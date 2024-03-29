/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.api;

import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.model.orders.UpdateShipmentStatusRequest;
import org.junit.Test;
import org.junit.Ignore;



/**
 * API tests for ShipmentApi
 */
@Ignore
public class ShipmentApiTest {

    private final ShipmentApi api = new ShipmentApi();

    
    /**
     * 
     *
     * Update the shipment status for an order that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateShipmentStatusTest() throws ApiException {
        String orderId = null;
        UpdateShipmentStatusRequest payload = null;
        api.updateShipmentStatus(orderId, payload);

        // TODO: test validations
    }
    
}
