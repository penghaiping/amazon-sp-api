/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, refer to the [Catalog Items API Use Case Guide](doc:catalog-items-api-v2022-04-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-04-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.catalogitems;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.catalogitems.ItemClassificationSalesRank;
import com.amazon.spapi.model.catalogitems.ItemDisplayGroupSalesRank;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Sales ranks of an Amazon catalog item for the indicated Amazon marketplace.
 */
@ApiModel(description = "Sales ranks of an Amazon catalog item for the indicated Amazon marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-24T09:53:49.652+08:00")
public class ItemSalesRanksByMarketplace {
  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("classificationRanks")
  private List<ItemClassificationSalesRank> classificationRanks = null;

  @SerializedName("displayGroupRanks")
  private List<ItemDisplayGroupSalesRank> displayGroupRanks = null;

  public ItemSalesRanksByMarketplace marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * Amazon marketplace identifier.
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "Amazon marketplace identifier.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public ItemSalesRanksByMarketplace classificationRanks(List<ItemClassificationSalesRank> classificationRanks) {
    this.classificationRanks = classificationRanks;
    return this;
  }

  public ItemSalesRanksByMarketplace addClassificationRanksItem(ItemClassificationSalesRank classificationRanksItem) {
    if (this.classificationRanks == null) {
      this.classificationRanks = new ArrayList<ItemClassificationSalesRank>();
    }
    this.classificationRanks.add(classificationRanksItem);
    return this;
  }

   /**
   * Sales ranks of an Amazon catalog item for an Amazon marketplace by classification.
   * @return classificationRanks
  **/
  @ApiModelProperty(value = "Sales ranks of an Amazon catalog item for an Amazon marketplace by classification.")
  public List<ItemClassificationSalesRank> getClassificationRanks() {
    return classificationRanks;
  }

  public void setClassificationRanks(List<ItemClassificationSalesRank> classificationRanks) {
    this.classificationRanks = classificationRanks;
  }

  public ItemSalesRanksByMarketplace displayGroupRanks(List<ItemDisplayGroupSalesRank> displayGroupRanks) {
    this.displayGroupRanks = displayGroupRanks;
    return this;
  }

  public ItemSalesRanksByMarketplace addDisplayGroupRanksItem(ItemDisplayGroupSalesRank displayGroupRanksItem) {
    if (this.displayGroupRanks == null) {
      this.displayGroupRanks = new ArrayList<ItemDisplayGroupSalesRank>();
    }
    this.displayGroupRanks.add(displayGroupRanksItem);
    return this;
  }

   /**
   * Sales ranks of an Amazon catalog item for an Amazon marketplace by website display group.
   * @return displayGroupRanks
  **/
  @ApiModelProperty(value = "Sales ranks of an Amazon catalog item for an Amazon marketplace by website display group.")
  public List<ItemDisplayGroupSalesRank> getDisplayGroupRanks() {
    return displayGroupRanks;
  }

  public void setDisplayGroupRanks(List<ItemDisplayGroupSalesRank> displayGroupRanks) {
    this.displayGroupRanks = displayGroupRanks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemSalesRanksByMarketplace itemSalesRanksByMarketplace = (ItemSalesRanksByMarketplace) o;
    return Objects.equals(this.marketplaceId, itemSalesRanksByMarketplace.marketplaceId) &&
        Objects.equals(this.classificationRanks, itemSalesRanksByMarketplace.classificationRanks) &&
        Objects.equals(this.displayGroupRanks, itemSalesRanksByMarketplace.displayGroupRanks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, classificationRanks, displayGroupRanks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemSalesRanksByMarketplace {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    classificationRanks: ").append(toIndentedString(classificationRanks)).append("\n");
    sb.append("    displayGroupRanks: ").append(toIndentedString(displayGroupRanks)).append("\n");
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

