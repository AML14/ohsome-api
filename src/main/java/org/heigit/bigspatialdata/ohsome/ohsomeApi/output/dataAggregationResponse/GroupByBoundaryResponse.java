package org.heigit.bigspatialdata.ohsome.ohsomeApi.output.dataAggregationResponse;

import org.heigit.bigspatialdata.ohsome.ohsomeApi.output.dataAggregationResponse.metadata.Metadata;
import org.heigit.bigspatialdata.ohsome.ohsomeApi.output.dataAggregationResponse.result.GroupByResult;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents the whole JSON response object for the data aggregation response using the
 * /groupBy/boundary resource. It contains an optional
 * {@link org.heigit.bigspatialdata.ohsome.ohsomeApi.output.dataAggregationResponse.metadata.GroupByBoundaryMetadata
 * GroupByBoundaryMetadata} object, the requested
 * {@link org.heigit.bigspatialdata.ohsome.ohsomeApi.output.dataAggregationResponse.result.GroupByResult
 * GroupByResult}, which is named after the used /groupBy resource (e.g. groupByBoundaryResult for
 * using /groupBy/boundary) and an identifier of the object plus the corresponding
 * {@link org.heigit.bigspatialdata.ohsome.ohsomeApi.output.dataAggregationResponse.result.Result
 * Result} objects.
 */
@JsonInclude(Include.NON_NULL)
public class GroupByBoundaryResponse {

  @ApiModelProperty(notes = "License and copyright info", required = true, position = 0)
  private Attribution attribution;
  @ApiModelProperty(notes = "Version of this api", required = true, position = 1)
  private String apiVersion;
  @ApiModelProperty(notes = "Metadata describing the output", position = 2)
  private Metadata metadata;
  @ApiModelProperty(notes = "GroupByResult array holding the respective objects "
      + "with their timestamp-value pairs", required = true)
  private GroupByResult[] groupByBoundaryResult;

  public GroupByBoundaryResponse(Attribution attribution, String apiVersion, Metadata metadata,
      GroupByResult[] groupByBoundaryResult) {
    this.attribution = attribution;
    this.apiVersion = apiVersion;
    this.metadata = metadata;
    this.groupByBoundaryResult = groupByBoundaryResult;
  }

  public Attribution getAttribution() {
    return attribution;
  }

  public String getApiVersion() {
    return apiVersion;
  }

  public Metadata getMetadata() {
    return metadata;
  }

  public GroupByResult[] getGroupByBoundaryResult() {
    return groupByBoundaryResult;
  }

}
