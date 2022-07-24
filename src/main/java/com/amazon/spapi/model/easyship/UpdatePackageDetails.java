/*
 * Selling Partner API for Easy Ship
 * The Selling Partner API for Easy Ship helps you build applications that help sellers manage and ship Amazon Easy Ship orders.  Your Easy Ship applications can:  * Get available time slots for packages to be scheduled for delivery.  * Schedule, reschedule, and cancel Easy Ship orders.  * Print labels, invoices, and warranties.  See the [Marketplace Support Table](doc:easy-ship-api-v2022-03-23-use-case-guide) for the differences in Easy Ship operations by marketplace.
 *
 * OpenAPI spec version: 2022-03-23
 * Contact: marketplaceapitest@amazon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.easyship;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.easyship.ScheduledPackageId;
import com.amazon.spapi.model.easyship.TimeSlot;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request to update the time slot of a package.
 */
@ApiModel(description = "Request to update the time slot of a package.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-24T13:36:02.735+08:00")
public class UpdatePackageDetails {
  @SerializedName("scheduledPackageId")
  private ScheduledPackageId scheduledPackageId = null;

  @SerializedName("packageTimeSlot")
  private TimeSlot packageTimeSlot = null;

  public UpdatePackageDetails scheduledPackageId(ScheduledPackageId scheduledPackageId) {
    this.scheduledPackageId = scheduledPackageId;
    return this;
  }

   /**
   * Get scheduledPackageId
   * @return scheduledPackageId
  **/
  @ApiModelProperty(required = true, value = "")
  public ScheduledPackageId getScheduledPackageId() {
    return scheduledPackageId;
  }

  public void setScheduledPackageId(ScheduledPackageId scheduledPackageId) {
    this.scheduledPackageId = scheduledPackageId;
  }

  public UpdatePackageDetails packageTimeSlot(TimeSlot packageTimeSlot) {
    this.packageTimeSlot = packageTimeSlot;
    return this;
  }

   /**
   * Get packageTimeSlot
   * @return packageTimeSlot
  **/
  @ApiModelProperty(required = true, value = "")
  public TimeSlot getPackageTimeSlot() {
    return packageTimeSlot;
  }

  public void setPackageTimeSlot(TimeSlot packageTimeSlot) {
    this.packageTimeSlot = packageTimeSlot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePackageDetails updatePackageDetails = (UpdatePackageDetails) o;
    return Objects.equals(this.scheduledPackageId, updatePackageDetails.scheduledPackageId) &&
        Objects.equals(this.packageTimeSlot, updatePackageDetails.packageTimeSlot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledPackageId, packageTimeSlot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePackageDetails {\n");
    
    sb.append("    scheduledPackageId: ").append(toIndentedString(scheduledPackageId)).append("\n");
    sb.append("    packageTimeSlot: ").append(toIndentedString(packageTimeSlot)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

