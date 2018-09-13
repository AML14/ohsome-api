package org.heigit.bigspatialdata.ohsome.ohsomeapi.inputprocessing;

import java.util.EnumSet;
import org.heigit.bigspatialdata.ohsome.ohsomeapi.executor.RequestParameters;
import org.heigit.bigspatialdata.oshdb.osm.OSMType;

/** Holds all the relevant data that is used to process the request and create the response. */
public class ProcessingData {
  
  public static RequestParameters requestParameters;
  public static String requestUrl;
  public static BoundaryType boundary;
  public static String[] boundaryValues;
  public static String boundaryValuesGeoJson;
  public static EnumSet<OSMType> osmTypes;
  public static boolean showMetadata;
  public static String format;

}
