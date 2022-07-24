# EasyShipApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createScheduledPackage**](EasyShipApi.md#createScheduledPackage) | **POST** /easyShip/2022-03-23/package | 
[**getScheduledPackage**](EasyShipApi.md#getScheduledPackage) | **GET** /easyShip/2022-03-23/package | 
[**listHandoverSlots**](EasyShipApi.md#listHandoverSlots) | **POST** /easyShip/2022-03-23/timeSlot | 
[**updateScheduledPackages**](EasyShipApi.md#updateScheduledPackages) | **PATCH** /easyShip/2022-03-23/package | 


<a name="createScheduledPackage"></a>
# **createScheduledPackage**
> ModelPackage createScheduledPackage(createScheduledPackageRequest)



Schedules an Easy Ship order and returns the scheduled package information.  This operation does the following:  *  Specifies the time slot and handover method for the order to be scheduled for delivery.  * Updates the Easy Ship order status.  * Generates a shipping label and an invoice. Calling &#x60;createScheduledPackage&#x60; also generates a warranty document if you specify a &#x60;SerialNumber&#x60; value. To get these documents, see [How to get invoice, shipping label, and warranty documents](doc:easy-ship-api-v2022-03-23-use-case-guide).  * Shows the status of Easy Ship orders when you call the &#x60;getOrders&#x60; operation of the Selling Partner API for Orders and examine the &#x60;EasyShipShipmentStatus&#x60; property in the response body.  See the **Shipping Label**, **Invoice**, and **Warranty** columns in the [Marketplace Support Table](doc:easy-ship-api-v2022-03-23-use-case-guide) to see which documents are supported in each marketplace.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api.EasyShipApi;


EasyShipApi apiInstance = new EasyShipApi();
CreateScheduledPackageRequest createScheduledPackageRequest = new CreateScheduledPackageRequest(); // CreateScheduledPackageRequest | 
try {
    ModelPackage result = apiInstance.createScheduledPackage(createScheduledPackageRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EasyShipApi#createScheduledPackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createScheduledPackageRequest** | [**CreateScheduledPackageRequest**](CreateScheduledPackageRequest.md)|  |

### Return type

[**ModelPackage**](ModelPackage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getScheduledPackage"></a>
# **getScheduledPackage**
> ModelPackage getScheduledPackage(amazonOrderId, marketplaceId)



Returns information about a package, including dimensions, weight, time slot information for handover, invoice and item information, and status.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api.EasyShipApi;


EasyShipApi apiInstance = new EasyShipApi();
String amazonOrderId = "amazonOrderId_example"; // String | An Amazon-defined order identifier. Identifies the order that the seller wants to deliver using Amazon Easy Ship.
String marketplaceId = "marketplaceId_example"; // String | An identifier for the marketplace in which the seller is selling.
try {
    ModelPackage result = apiInstance.getScheduledPackage(amazonOrderId, marketplaceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EasyShipApi#getScheduledPackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **amazonOrderId** | **String**| An Amazon-defined order identifier. Identifies the order that the seller wants to deliver using Amazon Easy Ship. |
 **marketplaceId** | **String**| An identifier for the marketplace in which the seller is selling. |

### Return type

[**ModelPackage**](ModelPackage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listHandoverSlots"></a>
# **listHandoverSlots**
> ListHandoverSlotsResponse listHandoverSlots(listHandoverSlotsRequest)



Returns time slots available for Easy Ship orders to be scheduled based on the package weight and dimensions that the seller specifies.  This operation is available for scheduled and unscheduled orders based on marketplace support. See **Get Time Slots** in the [Marketplace Support Table](doc:easy-ship-api-v2022-03-23-use-case-guide).  This operation can return time slots that have either pickup or drop-off handover methods - see **Supported Handover Methods** in the [Marketplace Support Table](doc:easy-ship-api-v2022-03-23-use-case-guide).  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api.EasyShipApi;


EasyShipApi apiInstance = new EasyShipApi();
ListHandoverSlotsRequest listHandoverSlotsRequest = new ListHandoverSlotsRequest(); // ListHandoverSlotsRequest | 
try {
    ListHandoverSlotsResponse result = apiInstance.listHandoverSlots(listHandoverSlotsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EasyShipApi#listHandoverSlots");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listHandoverSlotsRequest** | [**ListHandoverSlotsRequest**](ListHandoverSlotsRequest.md)|  | [optional]

### Return type

[**ListHandoverSlotsResponse**](ListHandoverSlotsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateScheduledPackages"></a>
# **updateScheduledPackages**
> Packages updateScheduledPackages(updateScheduledPackagesRequest)



Updates the time slot for handing over the package indicated by the specified &#x60;scheduledPackageId&#x60;. You can get the new &#x60;slotId&#x60; value for the time slot by calling the &#x60;listHandoverSlots&#x60; operation before making another &#x60;patch&#x60; call.  See the **Update Package** column in the [Marketplace Support Table](doc:easy-ship-api-v2022-03-23-use-case-guide) to see which marketplaces this operation is supported in.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api.EasyShipApi;


EasyShipApi apiInstance = new EasyShipApi();
UpdateScheduledPackagesRequest updateScheduledPackagesRequest = new UpdateScheduledPackagesRequest(); // UpdateScheduledPackagesRequest | 
try {
    Packages result = apiInstance.updateScheduledPackages(updateScheduledPackagesRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EasyShipApi#updateScheduledPackages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateScheduledPackagesRequest** | [**UpdateScheduledPackagesRequest**](UpdateScheduledPackagesRequest.md)|  | [optional]

### Return type

[**Packages**](Packages.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

