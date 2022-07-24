
# ItemSummaryByMarketplace

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketplaceId** | **String** | Amazon marketplace identifier. | 
**brand** | **String** | Name of the brand associated with an Amazon catalog item. |  [optional]
**browseClassification** | [**ItemBrowseClassification**](ItemBrowseClassification.md) | Classification (browse node) associated with an Amazon catalog item. |  [optional]
**color** | **String** | Name of the color associated with an Amazon catalog item. |  [optional]
**itemClassification** | [**ItemClassificationEnum**](#ItemClassificationEnum) | Classification type associated with the Amazon catalog item. |  [optional]
**itemName** | **String** | Name, or title, associated with an Amazon catalog item. |  [optional]
**manufacturer** | **String** | Name of the manufacturer associated with an Amazon catalog item. |  [optional]
**modelNumber** | **String** | Model number associated with an Amazon catalog item. |  [optional]
**packageQuantity** | **Integer** | Quantity of an Amazon catalog item in one package. |  [optional]
**partNumber** | **String** | Part number associated with an Amazon catalog item. |  [optional]
**size** | **String** | Name of the size associated with an Amazon catalog item. |  [optional]
**style** | **String** | Name of the style associated with an Amazon catalog item. |  [optional]
**websiteDisplayGroup** | **String** | Name of the website display group associated with an Amazon catalog item. |  [optional]


<a name="ItemClassificationEnum"></a>
## Enum: ItemClassificationEnum
Name | Value
---- | -----
BASE_PRODUCT | &quot;BASE_PRODUCT&quot;
OTHER | &quot;OTHER&quot;
PRODUCT_BUNDLE | &quot;PRODUCT_BUNDLE&quot;
VARIATION_PARENT | &quot;VARIATION_PARENT&quot;



