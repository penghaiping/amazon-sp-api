# swagger-java-client

Selling Partner API for Listings Restrictions
- API version: 2021-08-01
  - Build date: 2022-07-24T13:50:01.907+08:00

The Selling Partner API for Listings Restrictions provides programmatic access to restrictions on Amazon catalog listings.  For more information, see the [Listings Restrictions API Use Case Guide](doc:listings-restrictions-api-v2021-08-01-use-case-guide).

  For more information, please visit [https://sellercentral.amazon.com/gp/mws/contactus.html](https://sellercentral.amazon.com/gp/mws/contactus.html)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.amazon.spapi.*;
import com.amazon.spapi.auth.*;
import com.amazon.spapi.model.listingsrestrictions.*;
import com.amazon.spapi.api.ListingsApi;

import java.io.File;
import java.util.*;

public class ListingsApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ListingsApi* | [**getListingsRestrictions**](docs/ListingsApi.md#getListingsRestrictions) | **GET** /listings/2021-08-01/restrictions | 


## Documentation for Models

 - [Error](docs/Error.md)
 - [ErrorList](docs/ErrorList.md)
 - [Link](docs/Link.md)
 - [Reason](docs/Reason.md)
 - [Restriction](docs/Restriction.md)
 - [RestrictionList](docs/RestrictionList.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



