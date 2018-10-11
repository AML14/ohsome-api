package org.heigit.bigspatialdata.ohsome.ohsomeapi.output.dataaggregationresponse;

/**
 * Interface for all Response classes.
 * <ul>
 * <li>{@link org.heigit.bigspatialdata.ohsome.ohsomeapi.output.dataaggregationresponse.DefaultAggregationResponse
 * DefaultAggregationResponse}</li>
 * <li>{@link org.heigit.bigspatialdata.ohsome.ohsomeapi.output.dataaggregationresponse.elements.ShareResponse
 * ShareResponse}</li>
 * <li>{@link org.heigit.bigspatialdata.ohsome.ohsomeapi.output.dataaggregationresponse.groupbyresponse.GroupByResponse
 * GroupByResponse}</li>
 * <li>{@link org.heigit.bigspatialdata.ohsome.ohsomeapi.output.dataaggregationresponse.groupbyresponse.RatioGroupByBoundaryResponse
 * RatioGroupByBoundaryResponse}</li>
 * <li>{@link org.heigit.bigspatialdata.ohsome.ohsomeapi.output.dataaggregationresponse.groupbyresponse.ShareGroupByBoundaryResponse
 * ShareGroupByBoundaryResponse}</li>
 * <li>{@link org.heigit.bigspatialdata.ohsome.ohsomeapi.output.dataaggregationresponse.RatioResponse
 * RatioResponse}</li>
 * <li>{@link org.heigit.bigspatialdata.ohsome.ohsomeapi.output.rawdataresponse.DataResponse
 * DataResponse}</li>
 * </ul>
 */
public interface Response {

  public Attribution getAttribution();

  public String getApiVersion();

  public BaseMetadata getMetadata();
}