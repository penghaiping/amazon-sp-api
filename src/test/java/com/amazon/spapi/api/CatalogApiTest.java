/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items helps you programmatically retrieve item details for items in the catalog.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.api;

import com.amazon.spapi.client.*;
import com.amazon.spapi.model.catalogitems.GetCatalogItemResponse;
import com.amazon.spapi.model.catalogitems.ListCatalogCategoriesResponse;
import com.amazon.spapi.model.catalogitems.ListCatalogItemsResponse;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for CatalogApi
 */
@Ignore
public class CatalogApiTest {

    private final CatalogApi api = new CatalogApi();

    
    /**
     * 
     *
     * Returns a specified item and its attributes.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCatalogItemTest() throws ApiException {
        String marketplaceId = null;
        String asin = null;
        GetCatalogItemResponse response = api.getCatalogItem(marketplaceId, asin);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the parent categories to which an item belongs, based on the specified ASIN or SellerSKU.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCatalogCategoriesTest() throws ApiException {
        String marketplaceId = null;
        String ASIN = null;
        String sellerSKU = null;
        ListCatalogCategoriesResponse response = api.listCatalogCategories(marketplaceId, ASIN, sellerSKU);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of items and their attributes, based on a search query or item identifiers that you specify. When based on a search query, provide the Query parameter and optionally, the QueryContextId parameter. When based on item identifiers, provide a single appropriate parameter based on the identifier type, and specify the associated item value. MarketplaceId is always required.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCatalogItemsTest() throws ApiException {
        String marketplaceId = null;
        String query = null;
        String queryContextId = null;
        String sellerSKU = null;
        String UPC = null;
        String EAN = null;
        String ISBN = null;
        String JAN = null;
        ListCatalogItemsResponse response = api.listCatalogItems(marketplaceId, query, queryContextId, sellerSKU, UPC, EAN, ISBN, JAN);

        // TODO: test validations
    }
    
}