package org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.elements;

import org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.executor.ElementsRequestExecutor;
import org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.executor.RequestResource;
import org.heigit.bigspatialdata.ohsome.oshdbRestApi.exception.BadRequestException;
import org.heigit.bigspatialdata.ohsome.oshdbRestApi.exception.NotImplementedException;
import org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.DefaultAggregationResponse;
import org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.GroupByKeyResponse;
import org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.GroupByTagResponse;
import org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.GroupByUserResponse;
import org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.RatioResponse;
import org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.ShareGroupByBoundaryResponse;
import org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.ShareResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * REST controller containing the GET and POST request handling methods, which are mapped to
 * "/elements/length".
 */
@Api(tags = "length")
@RestController
@RequestMapping("/elements/length")
public class LengthController {

  /**
   * GET request giving the length of OSM objects.
   * <p>
   * The parameters are described in the
   * {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.elements.CountController#getCount(String, String, String, String[], String[], String[], String[], String[], String)
   * getCount} method.
   * 
   * @return {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.DefaultAggregationResponse
   *         DefaultAggregationResponse}
   */
  @ApiOperation(value = "Length of OSM elements")
  @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
  public DefaultAggregationResponse getLength(
      @ApiParam(hidden = true) @RequestParam(value = "bboxes", defaultValue = "",
          required = false) String bboxes,
      @ApiParam(hidden = true) @RequestParam(value = "bcircles", defaultValue = "",
          required = false) String bcircles,
      @ApiParam(hidden = true) @RequestParam(value = "bpolys", defaultValue = "",
          required = false) String bpolys,
      @ApiParam(hidden = true) @RequestParam(value = "types", defaultValue = "",
          required = false) String[] types,
      @ApiParam(hidden = true) @RequestParam(value = "keys", defaultValue = "",
          required = false) String[] keys,
      @ApiParam(hidden = true) @RequestParam(value = "values", defaultValue = "",
          required = false) String[] values,
      @ApiParam(hidden = true) @RequestParam(value = "userids", defaultValue = "",
          required = false) String[] userids,
      @ApiParam(hidden = true) @RequestParam(value = "time", defaultValue = "",
          required = false) String[] time,
      @ApiParam(hidden = true) @RequestParam(value = "showMetadata",
          defaultValue = "false") String showMetadata)
      throws UnsupportedOperationException, Exception {

    ElementsRequestExecutor executor = new ElementsRequestExecutor();
    return executor.executeLengthPerimeterArea(RequestResource.LENGTH, false, bboxes, bcircles,
        bpolys, types, keys, values, userids, time, showMetadata);
  }

  /**
   * GET request giving the length of OSM objects grouped by the userId.
   * <p>
   * The parameters are described in the
   * {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.elements.CountController#getCount(String, String, String, String[], String[], String[], String[], String[], String)
   * getCount} method.
   * 
   * @return {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.GroupByUserResponse
   *         GroupByUserResponseContent}
   */
  @ApiOperation(value = "Length of OSM elements grouped by the user")
  @RequestMapping(value = "/groupBy/user", method = RequestMethod.GET,
      produces = "application/json")
  public GroupByUserResponse getLengthGroupByUser(
      @ApiParam(hidden = true) @RequestParam(value = "bboxes", defaultValue = "",
          required = false) String bboxes,
      @ApiParam(hidden = true) @RequestParam(value = "bcircles", defaultValue = "",
          required = false) String bcircles,
      @ApiParam(hidden = true) @RequestParam(value = "bpolys", defaultValue = "",
          required = false) String bpolys,
      @ApiParam(hidden = true) @RequestParam(value = "types", defaultValue = "",
          required = false) String[] types,
      @ApiParam(hidden = true) @RequestParam(value = "keys", defaultValue = "",
          required = false) String[] keys,
      @ApiParam(hidden = true) @RequestParam(value = "values", defaultValue = "",
          required = false) String[] values,
      @ApiParam(hidden = true) @RequestParam(value = "userids", defaultValue = "",
          required = false) String[] userids,
      @ApiParam(hidden = true) @RequestParam(value = "time", defaultValue = "",
          required = false) String[] time,
      @ApiParam(hidden = true) @RequestParam(value = "showMetadata",
          defaultValue = "false") String showMetadata)
      throws UnsupportedOperationException, Exception {

    ElementsRequestExecutor executor = new ElementsRequestExecutor();
    return executor.executeLengthPerimeterAreaGroupByUser(RequestResource.LENGTH, false, bboxes,
        bcircles, bpolys, types, keys, values, userids, time, showMetadata);
  }

  /**
   * GET request giving the length of OSM objects grouped by the key.
   * <p>
   * The other parameters are described in the
   * {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.elements.CountController#getCount(String, String, String, String[], String[], String[], String[], String[], String)
   * getCount} method.
   * 
   * @param groupByKeys <code>String</code> array containing the key used to create the tags for the
   *        grouping. One or more keys can be provided.
   * @return {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.GroupByKeyResponse
   *         GroupByKeyResponseContent}
   */
  @ApiOperation(value = "Count of OSM elements grouped by the key")
  @ApiImplicitParams({@ApiImplicitParam(name = "groupByKeys",
      value = "OSM key e.g.: 'highway', 'building'; default: no key", defaultValue = "highway",
      paramType = "query", dataType = "string", required = true)})
  @RequestMapping(value = "/groupBy/key", method = RequestMethod.GET, produces = "application/json")
  public GroupByKeyResponse getLengthGroupByKey(
      @ApiParam(hidden = true) @RequestParam(value = "bboxes", defaultValue = "",
          required = false) String bboxes,
      @ApiParam(hidden = true) @RequestParam(value = "bcircles", defaultValue = "",
          required = false) String bcircles,
      @ApiParam(hidden = true) @RequestParam(value = "bpolys", defaultValue = "",
          required = false) String bpolys,
      @ApiParam(hidden = true) @RequestParam(value = "types", defaultValue = "",
          required = false) String[] types,
      @ApiParam(hidden = true) @RequestParam(value = "keys", defaultValue = "",
          required = false) String[] keys,
      @ApiParam(hidden = true) @RequestParam(value = "values", defaultValue = "",
          required = false) String[] values,
      @ApiParam(hidden = true) @RequestParam(value = "userids", defaultValue = "",
          required = false) String[] userids,
      @ApiParam(hidden = true) @RequestParam(value = "time", defaultValue = "",
          required = false) String[] time,
      @ApiParam(hidden = true) @RequestParam(value = "showMetadata",
          defaultValue = "false") String showMetadata,
      @RequestParam(value = "groupByKeys", defaultValue = "",
          required = false) String[] groupByKeys)
      throws UnsupportedOperationException, Exception {

    ElementsRequestExecutor executor = new ElementsRequestExecutor();
    return executor.executeLengthPerimeterAreaGroupByKey(RequestResource.LENGTH, false, bboxes,
        bcircles, bpolys, types, keys, values, userids, time, showMetadata, groupByKeys);
  }

  /**
   * GET request giving the length of OSM objects grouped by the tag.
   * <p>
   * The other parameters are described in the
   * {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.elements.CountController#getCount(String, String, String, String[], String[], String[], String[], String[], String)
   * getCount} method.
   * 
   * @param groupByKey <code>String</code> array containing the key used to create the tags for the
   *        grouping. At the current implementation, there must be one key given (not more and not
   *        less).
   * @param groupByValues <code>String</code> array containing the values used to create the tags
   *        for grouping. If a given value does not appear in the output, then there are no objects
   *        assigned to it (within the given filters).
   * @return {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.GroupByTagResponse
   *         GroupByTagResponseContent}
   */
  @ApiOperation(value = "Length of OSM elements grouped by the tag")
  @ApiImplicitParams({
      @ApiImplicitParam(name = "groupByKey",
          value = "OSM key e.g.: 'highway', 'building'; default: no key", defaultValue = "highway",
          paramType = "query", dataType = "string", required = true),
      @ApiImplicitParam(name = "groupByValues",
          value = "OSM value(s) e.g.: 'primary', 'residential'; default: no value",
          defaultValue = "", paramType = "query", dataType = "string", required = false)})
  @RequestMapping(value = "/groupBy/tag", method = RequestMethod.GET, produces = "application/json")
  public GroupByTagResponse getLengthGroupByTag(
      @ApiParam(hidden = true) @RequestParam(value = "bboxes", defaultValue = "",
          required = false) String bboxes,
      @ApiParam(hidden = true) @RequestParam(value = "bcircles", defaultValue = "",
          required = false) String bcircles,
      @ApiParam(hidden = true) @RequestParam(value = "bpolys", defaultValue = "",
          required = false) String bpolys,
      @ApiParam(hidden = true) @RequestParam(value = "types", defaultValue = "",
          required = false) String[] types,
      @ApiParam(hidden = true) @RequestParam(value = "keys", defaultValue = "",
          required = false) String[] keys,
      @ApiParam(hidden = true) @RequestParam(value = "values", defaultValue = "",
          required = false) String[] values,
      @ApiParam(hidden = true) @RequestParam(value = "userids", defaultValue = "",
          required = false) String[] userids,
      @ApiParam(hidden = true) @RequestParam(value = "time", defaultValue = "",
          required = false) String[] time,
      @ApiParam(hidden = true) @RequestParam(value = "showMetadata",
          defaultValue = "false") String showMetadata,
      @RequestParam(value = "groupByKey", defaultValue = "", required = false) String[] groupByKey,
      @RequestParam(value = "groupByValues", defaultValue = "",
          required = false) String[] groupByValues)
      throws UnsupportedOperationException, Exception {

    ElementsRequestExecutor executor = new ElementsRequestExecutor();
    return executor.executeLengthPerimeterAreaGroupByTag(RequestResource.LENGTH, false, bboxes,
        bcircles, bpolys, types, keys, values, userids, time, showMetadata, groupByKey,
        groupByValues);
  }

  /**
   * GET request giving the length of items satisfying keys, values (+ other params) and part of
   * items satisfying keys2, values2.(+ other params).
   * <p>
   * The other parameters are described in the
   * {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.elements.CountController#getCount(String, String, String, String[], String[], String[], String[], String[], String)
   * getCount} method.
   * 
   * @param keys2 <code>String</code> array having the same format as keys and used to define the
   *        subgroup(share).
   * @param values2 <code>String</code> array having the same format as values and used to define
   *        the subgroup(share).
   * @return {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.ShareResponse
   *         ShareResponse}
   */
  @ApiOperation(
      value = "Share of length of elements satisfying keys2 and values2 within elements selected by types, keys and values")
  @ApiImplicitParams({
      @ApiImplicitParam(name = "keys2",
          value = "OSM key e.g.: 'highway', 'building'; default: no key", defaultValue = "maxspeed",
          paramType = "query", dataType = "string", required = true),
      @ApiImplicitParam(name = "values2",
          value = "OSM value(s) e.g.: 'primary', 'residential'; default: no value",
          defaultValue = "", paramType = "query", dataType = "string", required = false)})
  @RequestMapping(value = "/share", method = RequestMethod.GET, produces = "application/json")
  public ShareResponse getLengthShare(
      @ApiParam(hidden = true) @RequestParam(value = "bboxes", defaultValue = "",
          required = false) String bboxes,
      @ApiParam(hidden = true) @RequestParam(value = "bcircles", defaultValue = "",
          required = false) String bcircles,
      @ApiParam(hidden = true) @RequestParam(value = "bpolys", defaultValue = "",
          required = false) String bpolys,
      @ApiParam(hidden = true) @RequestParam(value = "types", defaultValue = "",
          required = false) String[] types,
      @ApiParam(hidden = true) @RequestParam(value = "keys", defaultValue = "",
          required = false) String[] keys,
      @ApiParam(hidden = true) @RequestParam(value = "values", defaultValue = "",
          required = false) String[] values,
      @ApiParam(hidden = true) @RequestParam(value = "userids", defaultValue = "",
          required = false) String[] userids,
      @ApiParam(hidden = true) @RequestParam(value = "time", defaultValue = "",
          required = false) String[] time,
      @ApiParam(hidden = true) @RequestParam(value = "showMetadata",
          defaultValue = "false") String showMetadata,
      @RequestParam(value = "keys2", defaultValue = "", required = false) String[] keys2,
      @RequestParam(value = "values2", defaultValue = "", required = false) String[] values2)
      throws UnsupportedOperationException, Exception {

    ElementsRequestExecutor executor = new ElementsRequestExecutor();
    return executor.executeLengthPerimeterAreaShare(RequestResource.LENGTH, false, bboxes, bcircles,
        bpolys, types, keys, values, userids, time, showMetadata, keys2, values2);
  }

  /**
   * GET request giving the length of items satisfying keys, values (+ other params) and part of
   * items satisfying keys2, values2 (plus other parameters), grouped by the boundary.
   * <p>
   * The other parameters are described in the
   * {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.elements.CountController#getCount(String, String, String, String[], String[], String[], String[], String[], String)
   * getCount} method.
   * 
   * @param keys2 <code>String</code> array having the same format as keys and used to define the
   *        subgroup(share).
   * @param values2 <code>String</code> array having the same format as values and used to define
   *        the subgroup(share).
   * @return {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.ShareGroupByBoundaryResponse
   *         ShareGroupByBoundaryResponse}
   */
  @ApiOperation(value = "Share results of OSM elements grouped by the boundary")
  @ApiImplicitParams({
      @ApiImplicitParam(name = "keys2",
          value = "OSM key e.g.: 'highway', 'building'; default: no key", defaultValue = "maxspeed",
          paramType = "query", dataType = "string", required = true),
      @ApiImplicitParam(name = "values2",
          value = "OSM value(s) e.g.: 'primary', 'residential'; default: no value",
          defaultValue = "", paramType = "query", dataType = "string", required = false)})
  @RequestMapping(value = "/share/groupBy/boundary", method = RequestMethod.GET,
      produces = "application/json")
  public ShareGroupByBoundaryResponse getLengthShareGroupByBoundary(
      @ApiParam(hidden = true) @RequestParam(value = "bboxes", defaultValue = "",
          required = false) String bboxes,
      @ApiParam(hidden = true) @RequestParam(value = "bcircles", defaultValue = "",
          required = false) String bcircles,
      @ApiParam(hidden = true) @RequestParam(value = "bpolys", defaultValue = "",
          required = false) String bpolys,
      @ApiParam(hidden = true) @RequestParam(value = "types", defaultValue = "",
          required = false) String[] types,
      @ApiParam(hidden = true) @RequestParam(value = "keys", defaultValue = "",
          required = false) String[] keys,
      @ApiParam(hidden = true) @RequestParam(value = "values", defaultValue = "",
          required = false) String[] values,
      @ApiParam(hidden = true) @RequestParam(value = "userids", defaultValue = "",
          required = false) String[] userids,
      @ApiParam(hidden = true) @RequestParam(value = "time", defaultValue = "",
          required = false) String[] time,
      @ApiParam(hidden = true) @RequestParam(value = "showMetadata",
          defaultValue = "false") String showMetadata,
      @RequestParam(value = "keys2", defaultValue = "", required = false) String[] keys2,
      @RequestParam(value = "values2", defaultValue = "", required = false) String[] values2)
      throws UnsupportedOperationException, Exception {

    throw new NotImplementedException(
        "This resource is still under development and not finished yet.");

    // ElementsRequestExecutor executor = new ElementsRequestExecutor();
    // return executor.executeLengthPerimeterAreaShareGroupByBoundary(RequestResource.LENGTH,
    // false,bboxes, bcircles, bpolys, types, keys, values, userids, time, showMetadata, keys2,
    // values2);
  }

  /**
   * GET request giving the density of selected items (length of items per square-kilometers).
   * <p>
   * The parameters are described in the
   * {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.elements.CountController#getCount(String, String, String, String[], String[], String[], String[], String[], String)
   * getCount} method.
   * 
   * @return {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.DefaultAggregationResponse
   *         DefaultAggregationResponse}
   */
  @ApiOperation(value = "Density of OSM elements (length of elements per square-kilometers)")
  @RequestMapping(value = "/density", method = RequestMethod.GET, produces = "application/json")
  public DefaultAggregationResponse getLengthDensity(
      @ApiParam(hidden = true) @RequestParam(value = "bboxes", defaultValue = "",
          required = false) String bboxes,
      @ApiParam(hidden = true) @RequestParam(value = "bcircles", defaultValue = "",
          required = false) String bcircles,
      @ApiParam(hidden = true) @RequestParam(value = "bpolys", defaultValue = "",
          required = false) String bpolys,
      @ApiParam(hidden = true) @RequestParam(value = "types", defaultValue = "",
          required = false) String[] types,
      @ApiParam(hidden = true) @RequestParam(value = "keys", defaultValue = "",
          required = false) String[] keys,
      @ApiParam(hidden = true) @RequestParam(value = "values", defaultValue = "",
          required = false) String[] values,
      @ApiParam(hidden = true) @RequestParam(value = "userids", defaultValue = "",
          required = false) String[] userids,
      @ApiParam(hidden = true) @RequestParam(value = "time", defaultValue = "",
          required = false) String[] time,
      @ApiParam(hidden = true) @RequestParam(value = "showMetadata",
          defaultValue = "false") String showMetadata)
      throws UnsupportedOperationException, Exception {

    ElementsRequestExecutor executor = new ElementsRequestExecutor();
    return executor.executeLengthPerimeterAreaDensity(RequestResource.LENGTH, false, bboxes,
        bcircles, bpolys, types, keys, values, userids, time, showMetadata);
  }

  /**
   * GET request giving the ratio of selected items satisfying types2, keys2 and values2 within
   * items selected by types, keys and values.
   * <p>
   * The other parameters are described in the
   * {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.elements.CountController#getCount(String, String, String, String[], String[], String[], String[], String[], String)
   * getCount} method.
   * 
   * @param types2 <code>String</code> array having the same format as types.
   * @param keys2 <code>String</code> array having the same format as keys.
   * @param values2 <code>String</code> array having the same format as values.
   * @return {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.RatioResponse
   *         RatioResponse}
   */
  @ApiOperation(
      value = "Ratio of selected items satisfying types2, keys2 and values2 within items selected by types, keys and values")
  @ApiImplicitParams({
      @ApiImplicitParam(name = "types2",
          value = "OSM type(s) 'node' and/or 'way' and/or 'relation'; default: all three types",
          defaultValue = "way", paramType = "query", dataType = "string", required = false),
      @ApiImplicitParam(name = "keys2",
          value = "OSM key e.g.: 'highway', 'building'; default: no key", defaultValue = "highway",
          paramType = "query", dataType = "string", required = false),
      @ApiImplicitParam(name = "values2",
          value = "OSM value(s) e.g.: 'primary', 'residential'; default: no value",
          defaultValue = "primary", paramType = "query", dataType = "string", required = false)})
  @RequestMapping(value = "/ratio", method = RequestMethod.GET, produces = "application/json")
  public RatioResponse getLengthRatio(
      @ApiParam(hidden = true) @RequestParam(value = "bboxes", defaultValue = "",
          required = false) String bboxes,
      @ApiParam(hidden = true) @RequestParam(value = "bcircles", defaultValue = "",
          required = false) String bcircles,
      @ApiParam(hidden = true) @RequestParam(value = "bpolys", defaultValue = "",
          required = false) String bpolys,
      @ApiParam(hidden = true) @RequestParam(value = "types", defaultValue = "",
          required = false) String[] types,
      @ApiParam(hidden = true) @RequestParam(value = "keys", defaultValue = "",
          required = false) String[] keys,
      @ApiParam(hidden = true) @RequestParam(value = "values", defaultValue = "",
          required = false) String[] values,
      @ApiParam(hidden = true) @RequestParam(value = "userids", defaultValue = "",
          required = false) String[] userids,
      @ApiParam(hidden = true) @RequestParam(value = "time", defaultValue = "",
          required = false) String[] time,
      @ApiParam(hidden = true) @RequestParam(value = "showMetadata",
          defaultValue = "false") String showMetadata,
      @RequestParam(value = "types2", defaultValue = "", required = false) String[] types2,
      @RequestParam(value = "keys2", defaultValue = "", required = false) String[] keys2,
      @RequestParam(value = "values2", defaultValue = "", required = false) String[] values2)
      throws UnsupportedOperationException, Exception {

    ElementsRequestExecutor executor = new ElementsRequestExecutor();
    return executor.executeLengthPerimeterAreaRatio(RequestResource.LENGTH, false, bboxes, bcircles,
        bpolys, types, keys, values, userids, time, showMetadata, types2, keys2, values2);
  }

  /**
   * POST request giving the length of OSM objects. POST requests should only be used if the request
   * URL would be too long for a GET request.
   * <p>
   * The parameters are described in the
   * {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.elements.CountController#getCount(String, String, String, String[], String[], String[], String[], String[], String)
   * getCount} method.
   * 
   * @return {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.DefaultAggregationResponse
   *         DefaultAggregationResponse}
   */
  @ApiOperation(value = "Length of OSM elements")
  @ApiImplicitParams({@ApiImplicitParam(name = "bboxes", paramType = "form", dataType = "string",
      defaultValue = "8.6128,49.3183,8.7294,49.4376", required = false,
      value = "WGS84 coordinates in the following format: "
          + "id1:lon1,lat1,lon2,lat2|id2:lon1,lat1,lon2,lat2|... OR lon1,lat1,lon2,lat2|lon1,lat1,lon2,lat2|...; default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "bcircles", paramType = "form", dataType = "string",
          required = false,
          value = "WGS84 coordinates + radius in meters in the following format: "
              + "id1:lon,lat,r|id2:lon,lat,r|... OR lon,lat,r|lon,lat,r|...; default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "bpolys", paramType = "form", dataType = "string", required = false,
          value = "WGS84 coordinates in the following format: "
              + "id1:lon1,lat1,lon2,lat2,... lonn,latn,lon1,lat1|id2:lon1,lat1,lon2,lat2,... lonm,latm,lon1,lat1|... OR "
              + "lon1,lat1,lon2,lat2,... lonn,latn,lon1,lat1|lon1,lat1,lon2,lat2... lonm,latm,lon1,lat1|...; default: default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "types", paramType = "form", dataType = "string",
          defaultValue = "way", required = false,
          value = "OSM type(s) 'node' and/or 'way' and/or 'relation'; default: all three types"),
      @ApiImplicitParam(name = "keys", paramType = "form", dataType = "string",
          defaultValue = "highway", required = false,
          value = "OSM key(s) e.g.: 'highway', 'building'; default: no key"),
      @ApiImplicitParam(name = "values", paramType = "form", dataType = "string",
          defaultValue = "residential", required = false,
          value = "OSM value(s) e.g.: 'primary', 'residential'; default: no value"),
      @ApiImplicitParam(name = "userids", paramType = "form", dataType = "string", required = false,
          value = "OSM userids; default: no userid"),
      @ApiImplicitParam(name = "time", paramType = "form", dataType = "string",
          defaultValue = "2015-01-01/2017-01-01/P1Y", required = false,
          value = "ISO-8601 conform timestring(s); default: today"),
      @ApiImplicitParam(name = "showMetadata", paramType = "form", dataType = "string",
          defaultValue = "true", required = false,
          value = "'Boolean' operator 'true' or 'false'; default: 'false'")})
  @RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json",
      consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public DefaultAggregationResponse postLength(String bboxes, String bcircles, String bpolys,
      String[] types, String[] keys, String[] values, String[] userids, String[] time,
      String showMetadata) throws UnsupportedOperationException, Exception {

    ElementsRequestExecutor executor = new ElementsRequestExecutor();
    return executor.executeLengthPerimeterArea(RequestResource.LENGTH, true, bboxes, bcircles,
        bpolys, types, keys, values, userids, time, showMetadata);
  }

  /**
   * POST request giving the length of OSM objects grouped by the userID. POST requests should only
   * be used if the request URL would be too long for a GET request.
   * <p>
   * The parameters are described in the
   * {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.elements.CountController#getCount(String, String, String, String[], String[], String[], String[], String[], String)
   * getCount} method.
   * 
   * @return {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.GroupByUserResponse
   *         GroupByUserResponseContent}
   */
  @ApiOperation(value = "Length of OSM elements grouped by the user")
  @ApiImplicitParams({@ApiImplicitParam(name = "bboxes", paramType = "form", dataType = "string",
      defaultValue = "8.6128,49.3183,8.7294,49.4376", required = false,
      value = "WGS84 coordinates in the following format: "
          + "id1:lon1,lat1,lon2,lat2|id2:lon1,lat1,lon2,lat2|... OR lon1,lat1,lon2,lat2|lon1,lat1,lon2,lat2|...; default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "bcircles", paramType = "form", dataType = "string",
          required = false,
          value = "WGS84 coordinates + radius in meters in the following format: "
              + "id1:lon,lat,r|id2:lon,lat,r|... OR lon,lat,r|lon,lat,r|...; default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "bpolys", paramType = "form", dataType = "string", required = false,
          value = "WGS84 coordinates in the following format: "
              + "id1:lon1,lat1,lon2,lat2,... lonn,latn,lon1,lat1|id2:lon1,lat1,lon2,lat2,... lonm,latm,lon1,lat1|... OR "
              + "lon1,lat1,lon2,lat2,... lonn,latn,lon1,lat1|lon1,lat1,lon2,lat2... lonm,latm,lon1,lat1|...; default: default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "types", paramType = "form", dataType = "string",
          defaultValue = "way", required = false,
          value = "OSM type(s) 'node' and/or 'way' and/or 'relation'; default: all three types"),
      @ApiImplicitParam(name = "keys", paramType = "form", dataType = "string",
          defaultValue = "highway", required = false,
          value = "OSM key(s) e.g.: 'highway', 'building'; default: no key"),
      @ApiImplicitParam(name = "values", paramType = "form", dataType = "string",
          defaultValue = "residential", required = false,
          value = "OSM value(s) e.g.: 'primary', 'residential'; default: no value"),
      @ApiImplicitParam(name = "userids", paramType = "form", dataType = "string", required = false,
          value = "OSM userids; default: no userid"),
      @ApiImplicitParam(name = "time", paramType = "form", dataType = "string",
          defaultValue = "2015-01-01/2017-01-01/P1Y", required = false,
          value = "ISO-8601 conform timestring(s); default: today"),
      @ApiImplicitParam(name = "showMetadata", paramType = "form", dataType = "string",
          defaultValue = "true", required = false,
          value = "'Boolean' operator 'true' or 'false'; default: 'false'")})
  @RequestMapping(value = "/groupBy/user", method = RequestMethod.POST,
      produces = "application/json", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public GroupByUserResponse postLengthGroupByUser(String bboxes, String bcircles, String bpolys,
      String[] types, String[] keys, String[] values, String[] userids, String[] time,
      String showMetadata) throws UnsupportedOperationException, Exception, BadRequestException {

    ElementsRequestExecutor executor = new ElementsRequestExecutor();
    return executor.executeLengthPerimeterAreaGroupByUser(RequestResource.LENGTH, true, bboxes,
        bcircles, bpolys, types, keys, values, userids, time, showMetadata);
  }

  /**
   * POST request giving the length of OSM objects grouped by the key. POST requests should only be
   * used if the request URL would be too long for a GET request.
   * <p>
   * The other parameters are described in the
   * {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.elements.CountController#getCount(String, String, String, String[], String[], String[], String[], String[], String)
   * getCount} method.
   * 
   * @param groupByKeys <code>String</code> array containing the key used to create the tags for the
   *        grouping. At the current implementation, there must be one key given (not more and not
   *        less).
   * @return {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.GroupByTagResponse
   *         GroupByTagResponseContent}
   */
  @ApiOperation(value = "Length of OSM elements grouped by the tag")
  @ApiImplicitParams({@ApiImplicitParam(name = "bboxes", paramType = "form", dataType = "string",
      defaultValue = "8.6128,49.3183,8.7294,49.4376", required = false,
      value = "WGS84 coordinates in the following format: "
          + "id1:lon1,lat1,lon2,lat2|id2:lon1,lat1,lon2,lat2|... OR lon1,lat1,lon2,lat2|lon1,lat1,lon2,lat2|...; default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "bcircles", paramType = "form", dataType = "string",
          required = false,
          value = "WGS84 coordinates + radius in meters in the following format: "
              + "id1:lon,lat,r|id2:lon,lat,r|... OR lon,lat,r|lon,lat,r|...; default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "bpolys", paramType = "form", dataType = "string", required = false,
          value = "WGS84 coordinates in the following format: "
              + "id1:lon1,lat1,lon2,lat2,... lonn,latn,lon1,lat1|id2:lon1,lat1,lon2,lat2,... lonm,latm,lon1,lat1|... OR "
              + "lon1,lat1,lon2,lat2,... lonn,latn,lon1,lat1|lon1,lat1,lon2,lat2... lonm,latm,lon1,lat1|...; default: default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "types", paramType = "form", dataType = "string",
          defaultValue = "way", required = false,
          value = "OSM type(s) 'node' and/or 'way' and/or 'relation'; default: all three types"),
      @ApiImplicitParam(name = "keys", paramType = "form", dataType = "string", defaultValue = "",
          required = false, value = "OSM key(s) e.g.: 'highway', 'building'; default: no key"),
      @ApiImplicitParam(name = "values", paramType = "form", dataType = "string", defaultValue = "",
          required = false,
          value = "OSM value(s) e.g.: 'primary', 'residential'; default: no value"),
      @ApiImplicitParam(name = "userids", paramType = "form", dataType = "string", required = false,
          value = "OSM userids; default: no userid"),
      @ApiImplicitParam(name = "time", paramType = "form", dataType = "string",
          defaultValue = "2015-01-01/2017-01-01/P1Y", required = false,
          value = "ISO-8601 conform timestring(s); default: today"),
      @ApiImplicitParam(name = "showMetadata", paramType = "form", dataType = "string",
          defaultValue = "true", required = false,
          value = "'Boolean' operator 'true' or 'false'; default: 'false'"),
      @ApiImplicitParam(name = "groupByKeys", paramType = "form", dataType = "string",
          defaultValue = "highway", required = true,
          value = "OSM key(s) e.g.: 'highway', 'building'; default: no key")})
  @RequestMapping(value = "/groupBy/key", method = RequestMethod.POST,
      produces = "application/json", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public GroupByKeyResponse postLengthGroupByKey(String bboxes, String bcircles, String bpolys,
      String[] types, String[] keys, String[] values, String[] userids, String[] time,
      String showMetadata, String[] groupByKeys)
      throws UnsupportedOperationException, Exception, BadRequestException {

    ElementsRequestExecutor executor = new ElementsRequestExecutor();
    return executor.executeLengthPerimeterAreaGroupByKey(RequestResource.LENGTH, true, bboxes,
        bcircles, bpolys, types, keys, values, userids, time, showMetadata, groupByKeys);
  }

  /**
   * POST request giving the length of OSM objects grouped by the tag. POST requests should only be
   * used if the request URL would be too long for a GET request.
   * <p>
   * The other parameters are described in the
   * {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.elements.CountController#getCount(String, String, String, String[], String[], String[], String[], String[], String)
   * getCount} method.
   * 
   * @param groupByKey <code>String</code> array containing the key used to create the tags for the
   *        grouping. At the current implementation, there must be one key given (not more and not
   *        less).
   * @param groupByValues <code>String</code> array containing the values used to create the tags
   *        for grouping. If a given value does not appear in the output, then there are no objects
   *        assigned to it (within the given filters).
   * @return {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.GroupByTagResponse
   *         GroupByTagResponseContent}
   */
  @ApiOperation(value = "Length of OSM elements grouped by the tag")
  @ApiImplicitParams({@ApiImplicitParam(name = "bboxes", paramType = "form", dataType = "string",
      defaultValue = "8.6128,49.3183,8.7294,49.4376", required = false,
      value = "WGS84 coordinates in the following format: "
          + "id1:lon1,lat1,lon2,lat2|id2:lon1,lat1,lon2,lat2|... OR lon1,lat1,lon2,lat2|lon1,lat1,lon2,lat2|...; default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "bcircles", paramType = "form", dataType = "string",
          required = false,
          value = "WGS84 coordinates + radius in meters in the following format: "
              + "id1:lon,lat,r|id2:lon,lat,r|... OR lon,lat,r|lon,lat,r|...; default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "bpolys", paramType = "form", dataType = "string", required = false,
          value = "WGS84 coordinates in the following format: "
              + "id1:lon1,lat1,lon2,lat2,... lonn,latn,lon1,lat1|id2:lon1,lat1,lon2,lat2,... lonm,latm,lon1,lat1|... OR "
              + "lon1,lat1,lon2,lat2,... lonn,latn,lon1,lat1|lon1,lat1,lon2,lat2... lonm,latm,lon1,lat1|...; default: default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "types", paramType = "form", dataType = "string",
          defaultValue = "way", required = false,
          value = "OSM type(s) 'node' and/or 'way' and/or 'relation'; default: all three types"),
      @ApiImplicitParam(name = "keys", paramType = "form", dataType = "string",
          defaultValue = "highway", required = false,
          value = "OSM key(s) e.g.: 'highway', 'building'; default: no key"),
      @ApiImplicitParam(name = "values", paramType = "form", dataType = "string", defaultValue = "",
          required = false,
          value = "OSM value(s) e.g.: 'primary', 'residential'; default: no value"),
      @ApiImplicitParam(name = "userids", paramType = "form", dataType = "string", required = false,
          value = "OSM userids; default: no userid"),
      @ApiImplicitParam(name = "time", paramType = "form", dataType = "string",
          defaultValue = "2015-01-01/2017-01-01/P1Y", required = false,
          value = "ISO-8601 conform timestring(s); default: today"),
      @ApiImplicitParam(name = "showMetadata", paramType = "form", dataType = "string",
          defaultValue = "true", required = false,
          value = "'Boolean' operator 'true' or 'false'; default: 'false'"),
      @ApiImplicitParam(name = "groupByKey", paramType = "form", dataType = "string",
          defaultValue = "maxspeed", required = true,
          value = "OSM key e.g.: 'highway', 'building'; default: no key"),
      @ApiImplicitParam(name = "groupByValues", paramType = "form", dataType = "string",
          defaultValue = "", required = false,
          value = "OSM value(s) e.g.: 'primary', 'residential'; default: no value")})
  @RequestMapping(value = "/groupBy/tag", method = RequestMethod.POST,
      produces = "application/json", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public GroupByTagResponse postLengthGroupByTag(String bboxes, String bcircles, String bpolys,
      String[] types, String[] keys, String[] values, String[] userids, String[] time,
      String showMetadata, String[] groupByKey, String[] groupByValues)
      throws UnsupportedOperationException, Exception, BadRequestException {

    ElementsRequestExecutor executor = new ElementsRequestExecutor();
    return executor.executeLengthPerimeterAreaGroupByTag(RequestResource.LENGTH, true, bboxes,
        bcircles, bpolys, types, keys, values, userids, time, showMetadata, groupByKey,
        groupByValues);
  }

  /**
   * POST request giving the length of items satisfying keys, values (+ other params) and part of
   * items satisfying keys2, values2.(+ other params). POST requests should only be used if the
   * request URL would be too long for a GET request.
   * <p>
   * The parameters are described in the
   * {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.elements.CountController#getCount(String, String, String, String[], String[], String[], String[], String[], String)
   * getCount} method.
   * 
   * @param keys2 <code>String</code> array having the same format as keys and used to define the
   *        subgroup(share).
   * @param values2 <code>String</code> array having the same format as values and used to define
   *        the subgroup(share).
   * @return {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.ShareResponse
   *         ShareResponse}
   */
  @ApiOperation(
      value = "Share of length of elements satisfying keys2 and values2 within elements selected by types, keys and values")
  @ApiImplicitParams({@ApiImplicitParam(name = "bboxes", paramType = "form", dataType = "string",
      defaultValue = "8.6128,49.3183,8.7294,49.4376", required = false,
      value = "WGS84 coordinates in the following format: "
          + "id1:lon1,lat1,lon2,lat2|id2:lon1,lat1,lon2,lat2|... OR lon1,lat1,lon2,lat2|lon1,lat1,lon2,lat2|...; default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "bcircles", paramType = "form", dataType = "string",
          required = false,
          value = "WGS84 coordinates + radius in meters in the following format: "
              + "id1:lon,lat,r|id2:lon,lat,r|... OR lon,lat,r|lon,lat,r|...; default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "bpolys", paramType = "form", dataType = "string", required = false,
          value = "WGS84 coordinates in the following format: "
              + "id1:lon1,lat1,lon2,lat2,... lonn,latn,lon1,lat1|id2:lon1,lat1,lon2,lat2,... lonm,latm,lon1,lat1|... OR "
              + "lon1,lat1,lon2,lat2,... lonn,latn,lon1,lat1|lon1,lat1,lon2,lat2... lonm,latm,lon1,lat1|...; default: default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "types", paramType = "form", dataType = "string",
          defaultValue = "way", required = false,
          value = "OSM type(s) 'node' and/or 'way' and/or 'relation'; default: all three types"),
      @ApiImplicitParam(name = "keys", paramType = "form", dataType = "string",
          defaultValue = "highway", required = false,
          value = "OSM key(s) e.g.: 'highway', 'building'; default: no key"),
      @ApiImplicitParam(name = "values", paramType = "form", dataType = "string",
          defaultValue = "residential", required = false,
          value = "OSM value(s) e.g.: 'primary', 'residential'; default: no value"),
      @ApiImplicitParam(name = "userids", paramType = "form", dataType = "string", required = false,
          value = "OSM userids; default: no userid"),
      @ApiImplicitParam(name = "time", paramType = "form", dataType = "string",
          defaultValue = "2015-01-01/2017-01-01/P1Y", required = false,
          value = "ISO-8601 conform timestring(s); default: today"),
      @ApiImplicitParam(name = "showMetadata", paramType = "form", dataType = "string",
          defaultValue = "true", required = false,
          value = "'Boolean' operator 'true' or 'false'; default: 'false'"),
      @ApiImplicitParam(name = "keys2", paramType = "form", dataType = "string",
          defaultValue = "highway", required = true,
          value = "OSM key(s) e.g.: 'highway', 'building'; default: no key"),
      @ApiImplicitParam(name = "values2", paramType = "form", dataType = "string",
          defaultValue = "", required = false,
          value = "OSM value(s) e.g.: 'primary', 'residential'; default: no value")})
  @RequestMapping(value = "/share", method = RequestMethod.POST, produces = "application/json",
      consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public ShareResponse postLengthShare(String bboxes, String bcircles, String bpolys,
      String[] types, String[] keys, String[] values, String[] userids, String[] time,
      String showMetadata, String[] keys2, String[] values2)
      throws UnsupportedOperationException, Exception, BadRequestException {

    ElementsRequestExecutor executor = new ElementsRequestExecutor();
    return executor.executeLengthPerimeterAreaShare(RequestResource.LENGTH, true, bboxes, bcircles,
        bpolys, types, keys, values, userids, time, showMetadata, keys2, values2);
  }

  /**
   * POST request giving the length of items satisfying keys, values and part of items satisfying
   * keys2, values2, grouped by the boundary. POST requests should only be used if the request URL
   * would be too long for a GET request.
   * <p>
   * The parameters are described in the
   * {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.elements.CountController#getCount(String, String, String, String[], String[], String[], String[], String[], String)
   * getCount} method.
   * 
   * @param keys2 <code>String</code> array having the same format as keys and used to define the
   *        subgroup(share).
   * @param values2 <code>String</code> array having the same format as values and used to define
   *        the subgroup(share).
   * @return {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.ShareGroupByBoundaryResponse
   *         ShareGroupByBoundaryResponse}
   */
  @ApiOperation(value = "Share results of OSM elements grouped by the boundary")
  @RequestMapping(value = "/share/groupBy/boundary", method = RequestMethod.POST,
      produces = "application/json", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public ShareGroupByBoundaryResponse postLengthShareGroupByBoundary(
      @ApiParam(value = "WGS84 coordinates in the following format: "
          + "id1:lon1,lat1,lon2,lat2|id2:lon1,lat1,lon2,lat2|... OR lon1,lat1,lon2,lat2|lon1,lat1,lon2,lat2|...; default: whole dataset (if all three boundary parameters are empty)",
          defaultValue = "", required = false) String bboxes,
      @ApiParam(value = "WGS84 coordinates + radius in meters in the following format: "
          + "id1:lon,lat,r|id2:lon,lat,r|... OR lon,lat,r|lon,lat,r|...; default: whole dataset (if all three boundary parameters are empty)",
          defaultValue = "", required = false) String bcircles,
      @ApiParam(value = "WGS84 coordinates in the following format: "
          + "id1:lon1,lat1,lon2,lat2,... lonn,latn,lon1,lat1|id2:lon1,lat1,lon2,lat2,... lonm,latm,lon1,lat1|... OR "
          + "lon1,lat1,lon2,lat2,... lonn,latn,lon1,lat1|lon1,lat1,lon2,lat2... lonm,latm,lon1,lat1|...; default: default: whole dataset (if all three boundary parameters are empty)",
          defaultValue = "", required = false) String bpolys,
      @ApiParam(
          value = "OSM type(s) 'node' and/or 'way' and/or 'relation'; default: all three types",
          defaultValue = "", required = false) String[] types,
      @ApiParam(value = "OSM key(s) e.g.: 'highway', 'building'; default: no key",
          defaultValue = "", required = false) String[] keys,
      @ApiParam(value = "OSM value(s) e.g.: 'primary', 'residential'; default: no value",
          defaultValue = "", required = false) String[] values,
      @ApiParam(value = "OSM userids; default: no userid", defaultValue = "",
          required = false) String[] userids,
      @ApiParam(value = "ISO-8601 conform timestring(s); default: today", defaultValue = "",
          required = false) String[] time,
      @ApiParam(value = "'Boolean' operator 'true' or 'false'; default: 'false'", defaultValue = "",
          required = false) String showMetadata,
      @ApiParam(value = "OSM key(s) e.g.: 'highway', 'building'; default: no key",
          defaultValue = "", required = false) String[] keys2,
      @ApiParam(value = "OSM value(s) e.g.: 'primary', 'residential'; default: no value",
          defaultValue = "", required = false) String[] values2)
      throws UnsupportedOperationException, Exception, BadRequestException {

    throw new NotImplementedException(
        "This resource is still under development and not finished yet.");

    // ElementsRequestExecutor executor = new ElementsRequestExecutor();
    // return executor.executeLengthPerimeterAreaShareGroupByBoundary(RequestResource.LENGTH,
    // true,bboxes, bcircles, bpolys, types, keys, values, userids, time, showMetadata, keys2,
    // values2);
  }

  /**
   * POST request giving the density of OSM elements (length of elements per square-kilometers).
   * POST requests should only be used if the request URL would be too long for a GET request.
   * <p>
   * The parameters are described in the
   * {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.elements.CountController#getCount(String, String, String, String[], String[], String[], String[], String[], String)
   * getCount} method.
   * 
   * @return {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.DefaultAggregationResponse
   *         DefaultAggregationResponse}
   */
  @ApiOperation(value = "Density of OSM elements (length of elements per square-kilometers)")
  @ApiImplicitParams({@ApiImplicitParam(name = "bboxes", paramType = "form", dataType = "string",
      defaultValue = "8.6128,49.3183,8.7294,49.4376", required = false,
      value = "WGS84 coordinates in the following format: "
          + "id1:lon1,lat1,lon2,lat2|id2:lon1,lat1,lon2,lat2|... OR lon1,lat1,lon2,lat2|lon1,lat1,lon2,lat2|...; default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "bcircles", paramType = "form", dataType = "string",
          required = false,
          value = "WGS84 coordinates + radius in meters in the following format: "
              + "id1:lon,lat,r|id2:lon,lat,r|... OR lon,lat,r|lon,lat,r|...; default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "bpolys", paramType = "form", dataType = "string", required = false,
          value = "WGS84 coordinates in the following format: "
              + "id1:lon1,lat1,lon2,lat2,... lonn,latn,lon1,lat1|id2:lon1,lat1,lon2,lat2,... lonm,latm,lon1,lat1|... OR "
              + "lon1,lat1,lon2,lat2,... lonn,latn,lon1,lat1|lon1,lat1,lon2,lat2... lonm,latm,lon1,lat1|...; default: default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "types", paramType = "form", dataType = "string",
          defaultValue = "way", required = false,
          value = "OSM type(s) 'node' and/or 'way' and/or 'relation'; default: all three types"),
      @ApiImplicitParam(name = "keys", paramType = "form", dataType = "string",
          defaultValue = "highway", required = false,
          value = "OSM key(s) e.g.: 'highway', 'building'; default: no key"),
      @ApiImplicitParam(name = "values", paramType = "form", dataType = "string", defaultValue = "",
          required = false,
          value = "OSM value(s) e.g.: 'primary', 'residential'; default: no value"),
      @ApiImplicitParam(name = "userids", paramType = "form", dataType = "string", required = false,
          value = "OSM userids; default: no userid"),
      @ApiImplicitParam(name = "time", paramType = "form", dataType = "string",
          defaultValue = "2015-01-01/2017-01-01/P1Y", required = false,
          value = "ISO-8601 conform timestring(s); default: today"),
      @ApiImplicitParam(name = "showMetadata", paramType = "form", dataType = "string",
          defaultValue = "true", required = false,
          value = "'Boolean' operator 'true' or 'false'; default: 'false'")})
  @RequestMapping(value = "/density", method = RequestMethod.POST, produces = "application/json",
      consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public DefaultAggregationResponse postLengthDensity(String bboxes, String bcircles, String bpolys,
      String[] types, String[] keys, String[] values, String[] userids, String[] time,
      String showMetadata) throws UnsupportedOperationException, Exception, BadRequestException {

    ElementsRequestExecutor executor = new ElementsRequestExecutor();
    return executor.executeLengthPerimeterAreaDensity(RequestResource.LENGTH, true, bboxes,
        bcircles, bpolys, types, keys, values, userids, time, showMetadata);
  }

  /**
   * POST request giving the ratio of selected items satisfying types2, keys2 and values2 within
   * items selected by types, keys and values. POST requests should only be used if the request URL
   * would be too long for a GET request.
   * <p>
   * The parameters are described in the
   * {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.controller.elements.CountController#getCount(String, String, String, String[], String[], String[], String[], String[], String)
   * getCount} method.
   * 
   * @param types2 <code>String</code> array having the same format as types.
   * @param keys2 <code>String</code> array having the same format as keys.
   * @param values2 <code>String</code> array having the same format as values.
   * @return {@link org.heigit.bigspatialdata.ohsome.oshdbRestApi.output.dataAggregationResponse.RatioResponse
   *         RatioResponse}
   */
  @ApiOperation(
      value = "Ratio of selected items satisfying types2, keys2 and values2 within items selected by types, keys and values")
  @ApiImplicitParams({@ApiImplicitParam(name = "bboxes", paramType = "form", dataType = "string",
      defaultValue = "8.6128,49.3183,8.7294,49.4376", required = false,
      value = "WGS84 coordinates in the following format: "
          + "id1:lon1,lat1,lon2,lat2|id2:lon1,lat1,lon2,lat2|... OR lon1,lat1,lon2,lat2|lon1,lat1,lon2,lat2|...; default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "bcircles", paramType = "form", dataType = "string",
          required = false,
          value = "WGS84 coordinates + radius in meters in the following format: "
              + "id1:lon,lat,r|id2:lon,lat,r|... OR lon,lat,r|lon,lat,r|...; default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "bpolys", paramType = "form", dataType = "string", required = false,
          value = "WGS84 coordinates in the following format: "
              + "id1:lon1,lat1,lon2,lat2,... lonn,latn,lon1,lat1|id2:lon1,lat1,lon2,lat2,... lonm,latm,lon1,lat1|... OR "
              + "lon1,lat1,lon2,lat2,... lonn,latn,lon1,lat1|lon1,lat1,lon2,lat2... lonm,latm,lon1,lat1|...; default: default: whole dataset (if all three boundary parameters are empty)"),
      @ApiImplicitParam(name = "types", paramType = "form", dataType = "string",
          defaultValue = "way", required = false,
          value = "OSM type(s) 'node' and/or 'way' and/or 'relation'; default: all three types"),
      @ApiImplicitParam(name = "keys", paramType = "form", dataType = "string",
          defaultValue = "highway", required = false,
          value = "OSM key(s) e.g.: 'highway', 'building'; default: no key"),
      @ApiImplicitParam(name = "values", paramType = "form", dataType = "string", defaultValue = "",
          required = false,
          value = "OSM value(s) e.g.: 'primary', 'residential'; default: no value"),
      @ApiImplicitParam(name = "userids", paramType = "form", dataType = "string", required = false,
          value = "OSM userids; default: no userid"),
      @ApiImplicitParam(name = "time", paramType = "form", dataType = "string",
          defaultValue = "2015-01-01/2017-01-01/P1Y", required = false,
          value = "ISO-8601 conform timestring(s); default: today"),
      @ApiImplicitParam(name = "showMetadata", paramType = "form", dataType = "string",
          defaultValue = "true", required = false,
          value = "'Boolean' operator 'true' or 'false'; default: 'false'"),
      @ApiImplicitParam(name = "types2",
          value = "OSM type(s) 'node' and/or 'way' and/or 'relation'; default: all three types",
          defaultValue = "way", paramType = "query", dataType = "string", required = false),
      @ApiImplicitParam(name = "keys2", paramType = "form", dataType = "string",
          defaultValue = "highway", required = true,
          value = "OSM key(s) e.g.: 'highway', 'building'; default: no key"),
      @ApiImplicitParam(name = "values2", paramType = "form", dataType = "string",
          defaultValue = "residential", required = false,
          value = "OSM value(s) e.g.: 'primary', 'residential'; default: no value")})
  @RequestMapping(value = "/ratio", method = RequestMethod.POST, produces = "application/json",
      consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public RatioResponse postLengthRatio(String bboxes, String bcircles, String bpolys,
      String[] types, String[] keys, String[] values, String[] userids, String[] time,
      String showMetadata, String[] types2, String[] keys2, String[] values2)
      throws UnsupportedOperationException, Exception, BadRequestException {

    ElementsRequestExecutor executor = new ElementsRequestExecutor();
    return executor.executeLengthPerimeterAreaRatio(RequestResource.LENGTH, true, bboxes, bcircles,
        bpolys, types, keys, values, userids, time, showMetadata, types2, keys2, values2);
  }
}
