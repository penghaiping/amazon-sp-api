# ListingsApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteListingsItem**](ListingsApi.md#deleteListingsItem) | **DELETE** /listings/2021-08-01/items/{sellerId}/{sku} | 
[**getListingsItem**](ListingsApi.md#getListingsItem) | **GET** /listings/2021-08-01/items/{sellerId}/{sku} | 
[**patchListingsItem**](ListingsApi.md#patchListingsItem) | **PATCH** /listings/2021-08-01/items/{sellerId}/{sku} | 
[**putListingsItem**](ListingsApi.md#putListingsItem) | **PUT** /listings/2021-08-01/items/{sellerId}/{sku} | 


<a name="deleteListingsItem"></a>
# **deleteListingsItem**
> ListingsItemSubmissionResponse deleteListingsItem(sellerId, sku, marketplaceIds, issueLocale)



Delete a listings item for a selling partner.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api.ListingsApi;


ListingsApi apiInstance = new ListingsApi();
String sellerId = "sellerId_example"; // String | A selling partner identifier, such as a merchant account or vendor code.
String sku = "sku_example"; // String | A selling partner provided identifier for an Amazon listing.
List<String> marketplaceIds = Arrays.asList("ATVPDKIKX0DER"); // List<String> | A comma-delimited list of Amazon marketplace identifiers for the request.
String issueLocale = "en_US"; // String | A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \"en_US\", \"fr_CA\", \"fr_FR\". Localized messages default to \"en_US\" when a localization is not available in the specified locale.
try {
    ListingsItemSubmissionResponse result = apiInstance.deleteListingsItem(sellerId, sku, marketplaceIds, issueLocale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListingsApi#deleteListingsItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerId** | **String**| A selling partner identifier, such as a merchant account or vendor code. |
 **sku** | **String**| A selling partner provided identifier for an Amazon listing. |
 **marketplaceIds** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of Amazon marketplace identifiers for the request. |
 **issueLocale** | **String**| A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. | [optional]

### Return type

[**ListingsItemSubmissionResponse**](ListingsItemSubmissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getListingsItem"></a>
# **getListingsItem**
> Item getListingsItem(sellerId, sku, marketplaceIds, issueLocale, includedData)



Returns details about a listings item for a selling partner.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api.ListingsApi;


ListingsApi apiInstance = new ListingsApi();
String sellerId = "sellerId_example"; // String | A selling partner identifier, such as a merchant account or vendor code.
String sku = "sku_example"; // String | A selling partner provided identifier for an Amazon listing.
List<String> marketplaceIds = Arrays.asList("ATVPDKIKX0DER"); // List<String> | A comma-delimited list of Amazon marketplace identifiers for the request.
String issueLocale = "en_US"; // String | A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \"en_US\", \"fr_CA\", \"fr_FR\". Localized messages default to \"en_US\" when a localization is not available in the specified locale.
List<String> includedData = Arrays.asList("summaries"); // List<String> | A comma-delimited list of data sets to include in the response. Default: summaries.
try {
    Item result = apiInstance.getListingsItem(sellerId, sku, marketplaceIds, issueLocale, includedData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListingsApi#getListingsItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerId** | **String**| A selling partner identifier, such as a merchant account or vendor code. |
 **sku** | **String**| A selling partner provided identifier for an Amazon listing. |
 **marketplaceIds** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of Amazon marketplace identifiers for the request. |
 **issueLocale** | **String**| A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. | [optional]
 **includedData** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of data sets to include in the response. Default: summaries. | [optional] [enum: summaries, attributes, issues, offers, fulfillmentAvailability, procurement]

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchListingsItem"></a>
# **patchListingsItem**
> ListingsItemSubmissionResponse patchListingsItem(sellerId, sku, marketplaceIds, body, issueLocale)



Partially update (patch) a listings item for a selling partner. Only top-level listings item attributes can be patched. Patching nested attributes is not supported.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api.ListingsApi;


ListingsApi apiInstance = new ListingsApi();
String sellerId = "sellerId_example"; // String | A selling partner identifier, such as a merchant account or vendor code.
String sku = "sku_example"; // String | A selling partner provided identifier for an Amazon listing.
List<String> marketplaceIds = Arrays.asList("ATVPDKIKX0DER"); // List<String> | A comma-delimited list of Amazon marketplace identifiers for the request.
ListingsItemPatchRequest body = new ListingsItemPatchRequest(); // ListingsItemPatchRequest | The request body schema for the patchListingsItem operation.
String issueLocale = "en_US"; // String | A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \"en_US\", \"fr_CA\", \"fr_FR\". Localized messages default to \"en_US\" when a localization is not available in the specified locale.
try {
    ListingsItemSubmissionResponse result = apiInstance.patchListingsItem(sellerId, sku, marketplaceIds, body, issueLocale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListingsApi#patchListingsItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerId** | **String**| A selling partner identifier, such as a merchant account or vendor code. |
 **sku** | **String**| A selling partner provided identifier for an Amazon listing. |
 **marketplaceIds** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of Amazon marketplace identifiers for the request. |
 **body** | [**ListingsItemPatchRequest**](ListingsItemPatchRequest.md)| The request body schema for the patchListingsItem operation. |
 **issueLocale** | **String**| A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. | [optional]

### Return type

[**ListingsItemSubmissionResponse**](ListingsItemSubmissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putListingsItem"></a>
# **putListingsItem**
> ListingsItemSubmissionResponse putListingsItem(sellerId, sku, marketplaceIds, body, issueLocale)



Creates a new or fully-updates an existing listings item for a selling partner.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api.ListingsApi;


ListingsApi apiInstance = new ListingsApi();
String sellerId = "sellerId_example"; // String | A selling partner identifier, such as a merchant account or vendor code.
String sku = "sku_example"; // String | A selling partner provided identifier for an Amazon listing.
List<String> marketplaceIds = Arrays.asList("ATVPDKIKX0DER"); // List<String> | A comma-delimited list of Amazon marketplace identifiers for the request.
ListingsItemPutRequest body = new ListingsItemPutRequest(); // ListingsItemPutRequest | The request body schema for the putListingsItem operation.
String issueLocale = "en_US"; // String | A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \"en_US\", \"fr_CA\", \"fr_FR\". Localized messages default to \"en_US\" when a localization is not available in the specified locale.
try {
    ListingsItemSubmissionResponse result = apiInstance.putListingsItem(sellerId, sku, marketplaceIds, body, issueLocale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListingsApi#putListingsItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerId** | **String**| A selling partner identifier, such as a merchant account or vendor code. |
 **sku** | **String**| A selling partner provided identifier for an Amazon listing. |
 **marketplaceIds** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of Amazon marketplace identifiers for the request. |
 **body** | [**ListingsItemPutRequest**](ListingsItemPutRequest.md)| The request body schema for the putListingsItem operation. |
 **issueLocale** | **String**| A locale for localization of issues. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. | [optional]

### Return type

[**ListingsItemSubmissionResponse**](ListingsItemSubmissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

