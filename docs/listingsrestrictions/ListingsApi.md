# ListingsApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getListingsRestrictions**](ListingsApi.md#getListingsRestrictions) | **GET** /listings/2021-08-01/restrictions | 


<a name="getListingsRestrictions"></a>
# **getListingsRestrictions**
> RestrictionList getListingsRestrictions(asin, sellerId, marketplaceIds, conditionType, reasonLocale)



Returns listing restrictions for an item in the Amazon Catalog.   **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api.ListingsApi;


ListingsApi apiInstance = new ListingsApi();
String asin = "B0000ASIN1"; // String | The Amazon Standard Identification Number (ASIN) of the item.
String sellerId = "sellerId_example"; // String | A selling partner identifier, such as a merchant account.
List<String> marketplaceIds = Arrays.asList("ATVPDKIKX0DER"); // List<String> | A comma-delimited list of Amazon marketplace identifiers for the request.
String conditionType = "used_very_good"; // String | The condition used to filter restrictions.
String reasonLocale = "en_US"; // String | A locale for reason text localization. When not provided, the default language code of the first marketplace is used. Examples: \"en_US\", \"fr_CA\", \"fr_FR\". Localized messages default to \"en_US\" when a localization is not available in the specified locale.
try {
    RestrictionList result = apiInstance.getListingsRestrictions(asin, sellerId, marketplaceIds, conditionType, reasonLocale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListingsApi#getListingsRestrictions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asin** | **String**| The Amazon Standard Identification Number (ASIN) of the item. |
 **sellerId** | **String**| A selling partner identifier, such as a merchant account. |
 **marketplaceIds** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of Amazon marketplace identifiers for the request. |
 **conditionType** | **String**| The condition used to filter restrictions. | [optional] [enum: new_new, new_open_box, new_oem, refurbished_refurbished, used_like_new, used_very_good, used_good, used_acceptable, collectible_like_new, collectible_very_good, collectible_good, collectible_acceptable, club_club]
 **reasonLocale** | **String**| A locale for reason text localization. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. | [optional]

### Return type

[**RestrictionList**](RestrictionList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

