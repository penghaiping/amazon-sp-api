
# Reason

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **String** | A message describing the reason for the restriction. | 
**reasonCode** | [**ReasonCodeEnum**](#ReasonCodeEnum) | A code indicating why the listing is restricted. |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | A list of path forward links that may allow Selling Partners to remove the restriction. |  [optional]


<a name="ReasonCodeEnum"></a>
## Enum: ReasonCodeEnum
Name | Value
---- | -----
APPROVAL_REQUIRED | &quot;APPROVAL_REQUIRED&quot;
ASIN_NOT_FOUND | &quot;ASIN_NOT_FOUND&quot;
NOT_ELIGIBLE | &quot;NOT_ELIGIBLE&quot;



