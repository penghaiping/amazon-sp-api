
# Restriction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketplaceId** | **String** | A marketplace identifier. Identifies the Amazon marketplace where the restriction is enforced. | 
**conditionType** | [**ConditionTypeEnum**](#ConditionTypeEnum) | The condition that applies to the restriction. |  [optional]
**reasons** | [**List&lt;Reason&gt;**](Reason.md) | A list of reasons for the restriction. |  [optional]


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



