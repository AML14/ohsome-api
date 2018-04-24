package org.heigit.bigspatialdata.ohsome.ohsomeApi.controller.executor;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.SortedMap;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.heigit.bigspatialdata.ohsome.ohsomeApi.exception.BadRequestException;
import org.heigit.bigspatialdata.ohsome.ohsomeApi.inputProcessing.BoundaryType;
import org.heigit.bigspatialdata.ohsome.ohsomeApi.inputProcessing.GeometryBuilder;
import org.heigit.bigspatialdata.oshdb.api.generic.OSHDBTimestampAndIndex;
import org.heigit.bigspatialdata.oshdb.api.mapreducer.MapAggregator;
import org.heigit.bigspatialdata.oshdb.api.mapreducer.MapReducer;
import org.heigit.bigspatialdata.oshdb.api.object.OSMEntitySnapshot;
import org.heigit.bigspatialdata.oshdb.osm.OSMEntity;
import org.heigit.bigspatialdata.oshdb.util.geometry.Geo;
import org.heigit.bigspatialdata.oshdb.util.geometry.OSHDBGeometryBuilder;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.Polygonal;

/** Holds helper methods that are used in the executor-classes. */
public class ExecutionUtils {

  /**
   * Defines a certain decimal format.
   * 
   * @param format <code>String</code> defining the format (e.g.: "#.####" for getting 4 digits
   *        after the comma)
   * @return <code>DecimalFormat</code> object with the defined format.
   */
  public DecimalFormat defineDecimalFormat(String format) {
    DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.getDefault());
    otherSymbols.setDecimalSeparator('.');
    DecimalFormat decForm = new DecimalFormat(format, otherSymbols);
    return decForm;
  }

  /**
   * Evaluates the keys2 and values2 <code>String</code> arrays from /share requests.
   * 
   * @param keys2 <code>String</code> array containing the provided keys2 parameters.
   * @param values2 <code>String</code> array containing the provided values2 parameters.
   * @return <code>String</code> array containing the given (or an empty) values2 array, which is
   *         not null.
   */
  public String[] shareParamEvaluation(String[] keys2, String[] values2) {

    if (keys2 == null || keys2.length < 1)
      throw new BadRequestException(
          "You need to define at least one key if you want to use /share.");
    if (values2 == null)
      values2 = new String[0];
    if (keys2.length < values2.length)
      throw new BadRequestException(
          "There cannot be more input values in values2 than in keys2 as values2n must fit to keys2n.");

    return values2;
  }

  /**
   * Gets the geometry from the currently in-use boundary object(s).
   * 
   * @param boundary <code>BoundaryType</code> object (NOBOUNDARY, BBOXES, BCIRCLES, BPOLYS).
   * @param geomBuilder <code>GeometryBuilder</code> object.
   * @return <code>Geometry</code> object of the used boundary parameter.
   */
  public Geometry getGeometry(BoundaryType boundary, GeometryBuilder geomBuilder) {

    Geometry geom;
    switch (boundary) {
      case NOBOUNDARY:
        geom = geomBuilder.getDataPoly();
        break;
      case BBOXES:
        geom = OSHDBGeometryBuilder.getGeometry(geomBuilder.getBbox());
        break;
      case BCIRCLES:
        geom = geomBuilder.getBcircleGeom();
        break;
      case BPOLYS:
        geom = geomBuilder.getBpoly();
        break;
      default:
        geom = null;
    }

    return geom;
  }

  /**
   * Computes the result for the /count|length|perimeter|area/groupBy/boundary resources using the
   * map-reduce functions from the OSHDB.
   * 
   * @param requestResource
   * @param bType
   * @param mapRed
   * @param geomBuilder
   * @return <code>SortedMap</code> result object.
   * @throws Exception
   */
  public SortedMap<OSHDBTimestampAndIndex<Integer>, ? extends Number> computeCountLengthPerimeterAreaGBBResult(
      RequestResource requestResource, BoundaryType bType, MapReducer<OSMEntitySnapshot> mapRed,
      GeometryBuilder geomBuilder) throws Exception {

    if (bType == BoundaryType.NOBOUNDARY)
      throw new BadRequestException(
          "You need to give at least one boundary parameter if you want to use /groupBy/boundary.");
    SortedMap<OSHDBTimestampAndIndex<Integer>, ? extends Number> result = null;
    MapAggregator<OSHDBTimestampAndIndex<Integer>, Geometry> preResult;
    ArrayList<Geometry> geoms = geomBuilder.getGeometry(bType);
    List<Integer> zeroFill = new LinkedList<>();
    for (int j = 0; j < geoms.size(); j++)
      zeroFill.add(j);
    preResult = mapRed.flatMap(f -> {
      List<Pair<Integer, Geometry>> res = new LinkedList<>();
      Geometry entityGeom = f.getGeometry();
      if (requestResource.equals(RequestResource.PERIMETER)) {
        entityGeom = entityGeom.getBoundary();
      }
      for (int i = 0; i < geoms.size(); i++) {
        if (entityGeom.intersects(geoms.get(i))) {
          if (entityGeom.within(geoms.get(i)))
            res.add(new ImmutablePair<>(i, entityGeom));
          else
            res.add(
                new ImmutablePair<>(i, Geo.clip(entityGeom, (Geometry & Polygonal) geoms.get(i))));
        }
      }
      return res;
    }).aggregateByTimestamp().aggregateBy(Pair::getKey).zerofillIndices(zeroFill)
        .map(Pair::getValue);
    switch (requestResource) {
      case COUNT:
        result = preResult.count();
        break;
      case LENGTH:
      case PERIMETER:
        result = preResult.sum(Geo::lengthOf);
        break;
      case AREA:
        result = preResult.sum(Geo::areaOf);
        break;
    }
    return result;
  }

  /**
   * Computes the result for the /count/share/groupBy/boundary resource using the map-reduce
   * functions from the OSHDB.
   * 
   * @param bType
   * @param mapRed
   * @param keysInt2
   * @param valuesInt2
   * @param geomBuilder
   * @return <code>SortedMap</code> result object.
   * @throws UnsupportedOperationException
   * @throws Exception
   */
  public SortedMap<OSHDBTimestampAndIndex<Pair<Integer, Boolean>>, Integer> computeCountShareGBBResult(
      BoundaryType bType, MapReducer<OSMEntitySnapshot> mapRed, Integer[] keysInt2,
      Integer[] valuesInt2, GeometryBuilder geomBuilder)
      throws UnsupportedOperationException, Exception {

    if (bType == BoundaryType.NOBOUNDARY)
      throw new BadRequestException(
          "You need to give at least one boundary parameter if you want to use /groupBy/boundary.");
    ArrayList<Geometry> geoms = geomBuilder.getGeometry(bType);
    ArrayList<Pair<Integer, Boolean>> zeroFill = new ArrayList<>();
    for (int j = 0; j < geoms.size(); j++) {
      zeroFill.add(new ImmutablePair<>(j, true));
      zeroFill.add(new ImmutablePair<>(j, false));
    }
    SortedMap<OSHDBTimestampAndIndex<Pair<Integer, Boolean>>, Integer> result =
        mapRed.aggregateByTimestamp().flatMap(f -> {
          List<Pair<Integer, OSMEntity>> boundaryList = new LinkedList<>();
          for (int i = 0; i < geoms.size(); i++)
            if (f.getGeometry().intersects(geoms.get(i)))
              boundaryList.add(new ImmutablePair<>(i, f.getEntity()));
          return boundaryList;
        }).aggregateBy(f -> {
          // result aggregated on true (if obj contains all tags) and false (if not all are
          // contained)
          boolean hasTags = false;
          for (int i = 0; i < keysInt2.length; i++) {
            if (f.getRight().hasTagKey(keysInt2[i])) {
              if (i >= valuesInt2.length) {
                // if more keys2 than values2 are given
                hasTags = true;
                continue;
              }
              if (f.getRight().hasTagValue(keysInt2[i], valuesInt2[i])) {
                hasTags = true;
              } else {
                hasTags = false;
                break;
              }
            } else {
              hasTags = false;
              break;
            }
          }
          return new ImmutablePair<>(f.getLeft(), hasTags);
        }).zerofillIndices(zeroFill).count();

    return result;
  }

  /**
   * Computes the result for the /length|perimeter|area/share/groupBy/boundary resources using the
   * map-reduce functions from the OSHDB.
   * 
   * @param requestResource
   * @param bType
   * @param mapRed
   * @param keysInt2
   * @param valuesInt2
   * @param geomBuilder
   * @return <code>SortedMap</code> result object.
   * @throws UnsupportedOperationException
   * @throws Exception
   */
  public SortedMap<OSHDBTimestampAndIndex<Pair<Integer, Boolean>>, ? extends Number> computeCountLengthPerimeterAreaShareGBBResult(
      RequestResource requestResource, BoundaryType bType, MapReducer<OSMEntitySnapshot> mapRed,
      Integer[] keysInt2, Integer[] valuesInt2, GeometryBuilder geomBuilder)
      throws UnsupportedOperationException, Exception {

    if (bType == BoundaryType.NOBOUNDARY)
      throw new BadRequestException(
          "You need to give at least one boundary parameter if you want to use /groupBy/boundary.");
    ArrayList<Geometry> geoms = geomBuilder.getGeometry(bType);
    List<Pair<Integer, Boolean>> zeroFill = new LinkedList<>();
    for (int j = 0; j < geoms.size(); j++) {
      zeroFill.add(new ImmutablePair<>(j, true));
      zeroFill.add(new ImmutablePair<>(j, false));
    }
    MapAggregator<OSHDBTimestampAndIndex<Pair<Integer, Boolean>>, Geometry> preResult = null;
    SortedMap<OSHDBTimestampAndIndex<Pair<Integer, Boolean>>, ? extends Number> result = null;
    preResult = mapRed.aggregateByTimestamp().flatMap(f -> {
      List<Pair<Pair<Integer, OSMEntity>, Geometry>> res = new LinkedList<>();
      Geometry entityGeom = f.getGeometry();
      if (requestResource.equals(RequestResource.PERIMETER)) {
        entityGeom = entityGeom.getBoundary();
      }
      for (int i = 0; i < geoms.size(); i++) {
        if (entityGeom.intersects(geoms.get(i))) {
          if (entityGeom.within(geoms.get(i)))
            res.add(new ImmutablePair<>(new ImmutablePair<>(i, f.getEntity()), entityGeom));
          else
            res.add(new ImmutablePair<>(new ImmutablePair<>(i, f.getEntity()),
                Geo.clip(entityGeom, (Geometry & Polygonal) geoms.get(i))));
        }
      }
      return res;
    }).aggregateBy(f -> {
      // result aggregated on true (if obj contains all tags) and false (if not)
      boolean hasTags = false;
      for (int i = 0; i < keysInt2.length; i++) {
        if (f.getLeft().getRight().hasTagKey(keysInt2[i])) {
          if (i >= valuesInt2.length) {
            // if more keys2 than values2 are given
            hasTags = true;
            continue;
          }
          if (f.getLeft().getRight().hasTagValue(keysInt2[i], valuesInt2[i])) {
            hasTags = true;
          } else {
            hasTags = false;
            break;
          }
        } else {
          hasTags = false;
          break;
        }
      }
      return new ImmutablePair<>(f.getLeft().getLeft(), hasTags);
    }).zerofillIndices(zeroFill).map(Pair::getValue);

    switch (requestResource) {
      case COUNT:
        result = preResult.count();
        break;
      case LENGTH:
      case PERIMETER:
        result = preResult.sum(geom -> {
          return Geo.lengthOf(geom);
        });
        break;
      case AREA:
        result = preResult.sum(geom -> {
          return Geo.areaOf(geom);
        });
        break;
    }
    return result;
  }

}
