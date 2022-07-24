
# PatchOperation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**op** | [**OpEnum**](#OpEnum) | Type of JSON Patch operation. Supported JSON Patch operations include add, replace, and delete. See &lt;https://tools.ietf.org/html/rfc6902&gt;. | 
**path** | **String** | JSON Pointer path of the element to patch. See &lt;https://tools.ietf.org/html/rfc6902&gt;. | 
**value** | **List&lt;Object&gt;** | JSON value to add, replace, or delete. |  [optional]


<a name="OpEnum"></a>
## Enum: OpEnum
Name | Value
---- | -----
ADD | &quot;add&quot;
REPLACE | &quot;replace&quot;
DELETE | &quot;delete&quot;



