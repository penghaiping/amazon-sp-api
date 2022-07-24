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
import com.amazon.spapi.model.easyship.HandoverMethod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A time window to hand over an Easy Ship package to Amazon Logistics.
 */
@ApiModel(description = "A time window to hand over an Easy Ship package to Amazon Logistics.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-24T13:36:02.735+08:00")
public class TimeSlot {
  @SerializedName("slotId")
  private String slotId = null;

  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("endTime")
  private String endTime = null;

  @SerializedName("handoverMethod")
  private HandoverMethod handoverMethod = null;

  public TimeSlot slotId(String slotId) {
    this.slotId = slotId;
    return this;
  }

   /**
   * An Amazon-defined identifier for a time slot.
   * @return slotId
  **/
  @ApiModelProperty(required = true, value = "An Amazon-defined identifier for a time slot.")
  public String getSlotId() {
    return slotId;
  }

  public void setSlotId(String slotId) {
    this.slotId = slotId;
  }

  public TimeSlot startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The start date and time of the time slot.
   * @return startTime
  **/
  @ApiModelProperty(value = "The start date and time of the time slot.")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public TimeSlot endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The end date and time of the time slot.
   * @return endTime
  **/
  @ApiModelProperty(value = "The end date and time of the time slot.")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public TimeSlot handoverMethod(HandoverMethod handoverMethod) {
    this.handoverMethod = handoverMethod;
    return this;
  }

   /**
   * The method by which a seller will hand a package over to Amazon Logistics.
   * @return handoverMethod
  **/
  @ApiModelProperty(value = "The method by which a seller will hand a package over to Amazon Logistics.")
  public HandoverMethod getHandoverMethod() {
    return handoverMethod;
  }

  public void setHandoverMethod(HandoverMethod handoverMethod) {
    this.handoverMethod = handoverMethod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSlot timeSlot = (TimeSlot) o;
    return Objects.equals(this.slotId, timeSlot.slotId) &&
        Objects.equals(this.startTime, timeSlot.startTime) &&
        Objects.equals(this.endTime, timeSlot.endTime) &&
        Objects.equals(this.handoverMethod, timeSlot.handoverMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slotId, startTime, endTime, handoverMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSlot {\n");
    
    sb.append("    slotId: ").append(toIndentedString(slotId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    handoverMethod: ").append(toIndentedString(handoverMethod)).append("\n");
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

