
# ShipmentDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**warehouseId** | **String** | The Amazon-defined identifier for the warehouse. |  [optional]
**amazonOrderId** | **String** | The Amazon-defined identifier for the order. |  [optional]
**amazonShipmentId** | **String** | The Amazon-defined identifier for the shipment. |  [optional]
**purchaseDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time when the order was created. |  [optional]
**shippingAddress** | [**Address**](Address.md) |  |  [optional]
**paymentMethodDetails** | [**PaymentMethodDetailItemList**](PaymentMethodDetailItemList.md) |  |  [optional]
**marketplaceId** | **String** | The identifier for the marketplace where the order was placed. |  [optional]
**sellerId** | **String** | The seller identifier. |  [optional]
**buyerName** | **String** | The name of the buyer. |  [optional]
**buyerCounty** | **String** | The county of the buyer. |  [optional]
**buyerTaxInfo** | [**BuyerTaxInfo**](BuyerTaxInfo.md) |  |  [optional]
**marketplaceTaxInfo** | [**MarketplaceTaxInfo**](MarketplaceTaxInfo.md) |  |  [optional]
**sellerDisplayName** | **String** | The seller’s friendly name registered in the marketplace. |  [optional]
**shipmentItems** | [**ShipmentItems**](ShipmentItems.md) |  |  [optional]



