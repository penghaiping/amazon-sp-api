/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.orders;

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
 * The tax classification for the order.
 */
@ApiModel(description = "The tax classification for the order.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-24T10:19:26.677+08:00")
public class TaxClassification {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Value")
  private String value = null;

  public TaxClassification name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The type of tax.
   * @return name
  **/
  @ApiModelProperty(value = "The type of tax.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaxClassification value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The buyer&#39;s tax identifier.
   * @return value
  **/
  @ApiModelProperty(value = "The buyer's tax identifier.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxClassification taxClassification = (TaxClassification) o;
    return Objects.equals(this.name, taxClassification.name) &&
        Objects.equals(this.value, taxClassification.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxClassification {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

