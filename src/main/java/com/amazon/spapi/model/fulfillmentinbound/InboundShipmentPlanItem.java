/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillmentinbound;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Item information used to create an inbound shipment. Returned by the createInboundShipmentPlan operation.
 */
@ApiModel(description = "Item information used to create an inbound shipment. Returned by the createInboundShipmentPlan operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:38:48.493+08:00")
public class InboundShipmentPlanItem {
  @SerializedName("SellerSKU")
  private String sellerSKU = null;

  @SerializedName("FulfillmentNetworkSKU")
  private String fulfillmentNetworkSKU = null;

  @SerializedName("Quantity")
  private Integer quantity = null;

  @SerializedName("PrepDetailsList")
  private PrepDetailsList prepDetailsList = null;

  public InboundShipmentPlanItem sellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
    return this;
  }

   /**
   * The seller SKU of the item.
   * @return sellerSKU
  **/
  @ApiModelProperty(required = true, value = "The seller SKU of the item.")
  public String getSellerSKU() {
    return sellerSKU;
  }

  public void setSellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
  }

  public InboundShipmentPlanItem fulfillmentNetworkSKU(String fulfillmentNetworkSKU) {
    this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
    return this;
  }

   /**
   * Amazon&#39;s fulfillment network SKU of the item.
   * @return fulfillmentNetworkSKU
  **/
  @ApiModelProperty(required = true, value = "Amazon's fulfillment network SKU of the item.")
  public String getFulfillmentNetworkSKU() {
    return fulfillmentNetworkSKU;
  }

  public void setFulfillmentNetworkSKU(String fulfillmentNetworkSKU) {
    this.fulfillmentNetworkSKU = fulfillmentNetworkSKU;
  }

  public InboundShipmentPlanItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The item quantity that you are shipping.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The item quantity that you are shipping.")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public InboundShipmentPlanItem prepDetailsList(PrepDetailsList prepDetailsList) {
    this.prepDetailsList = prepDetailsList;
    return this;
  }

   /**
   * Get prepDetailsList
   * @return prepDetailsList
  **/
  @ApiModelProperty(value = "")
  public PrepDetailsList getPrepDetailsList() {
    return prepDetailsList;
  }

  public void setPrepDetailsList(PrepDetailsList prepDetailsList) {
    this.prepDetailsList = prepDetailsList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundShipmentPlanItem inboundShipmentPlanItem = (InboundShipmentPlanItem) o;
    return Objects.equals(this.sellerSKU, inboundShipmentPlanItem.sellerSKU) &&
        Objects.equals(this.fulfillmentNetworkSKU, inboundShipmentPlanItem.fulfillmentNetworkSKU) &&
        Objects.equals(this.quantity, inboundShipmentPlanItem.quantity) &&
        Objects.equals(this.prepDetailsList, inboundShipmentPlanItem.prepDetailsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerSKU, fulfillmentNetworkSKU, quantity, prepDetailsList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundShipmentPlanItem {\n");
    
    sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
    sb.append("    fulfillmentNetworkSKU: ").append(toIndentedString(fulfillmentNetworkSKU)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    prepDetailsList: ").append(toIndentedString(prepDetailsList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
