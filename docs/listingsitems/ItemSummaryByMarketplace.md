
# ItemSummaryByMarketplace

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketplaceId** | **String** | A marketplace identifier. Identifies the Amazon marketplace for the listings item. | 
**asin** | **String** | Amazon Standard Identification Number (ASIN) of the listings item. | 
**productType** | **String** | The Amazon product type of the listings item. | 
**conditionType** | [**ConditionTypeEnum**](#ConditionTypeEnum) | Identifies the condition of the listings item. |  [optional]
**status** | [**List&lt;StatusEnum&gt;**](#List&lt;StatusEnum&gt;) | Statuses that apply to the listings item. | 
**fnSku** | **String** | Fulfillment network stock keeping unit is an identifier used by Amazon fulfillment centers to identify each unique item. |  [optional]
**itemName** | **String** | Name, or title, associated with an Amazon catalog item. | 
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the listings item was created, in ISO 8601 format. | 
**lastUpdatedDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date the listings item was last updated, in ISO 8601 format. | 
**mainImage** | [**ItemImage**](ItemImage.md) | Main image for the listings item. |  [optional]


<a name="ConditionTypeEnum"></a>
## Enum: ConditionTypeEnum
Name | Value
---- | -----
NEW_NEW | &quot;new_new&quot;
NEW_OPEN_BOX | &quot;new_open_box&quot;
NEW_OEM | &quot;new_oem&quot;
REFURBISHED_REFURBISHED | &quot;refurbished_refurbished&quot;
USED_LIKE_NEW | &quot;used_like_new&quot;
USED_VERY_GOOD | &quot;used_very_good&quot;
USED_GOOD | &quot;used_good&quot;
USED_ACCEPTABLE | &quot;used_acceptable&quot;
COLLECTIBLE_LIKE_NEW | &quot;collectible_like_new&quot;
COLLECTIBLE_VERY_GOOD | &quot;collectible_very_good&quot;
COLLECTIBLE_GOOD | &quot;collectible_good&quot;
COLLECTIBLE_ACCEPTABLE | &quot;collectible_acceptable&quot;
CLUB_CLUB | &quot;club_club&quot;


<a name="List<StatusEnum>"></a>
## Enum: List&lt;StatusEnum&gt;
Name | Value
---- | -----
BUYABLE | &quot;BUYABLE&quot;
DISCOVERABLE | &quot;DISCOVERABLE&quot;



