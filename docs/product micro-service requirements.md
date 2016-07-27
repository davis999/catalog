# Product Service Requirement


This is the requirement document of the product micro-service.

The product micro-service provides those functions:

* Product  Management
* Product Bundle  Management
* Product Options Management



## Data Explanation

### 1. Product

product contains those attributes:

* general

  name, primary image, description, parent category, manufacturer, url, 

  retail price, sale price,

  start date, end date,

  taxable,tax code

* marketing

  is featured product, cross sale products, upsale products

* media

  product media

* **product options**

  additional skus, product options

* inventory

  inventory type, quantity available

* shipping

  fulfillment type, width, height, depth, girth, container size, container type, 

  dimension units, weight, is machine sortable, weight units

* advanced

  discountable, upc, can sell without options, display template, model, external id

  product attributes

### 2. Product Bundle

product bundle contains those attributes:

* general

  name, primary image, description, parent category, manufacturer, url, 

  pricing model, retail price,sale price,

  start date,end date,

  taxable,tax code,

  **sku bundle items**

* marketing

  is featured product, cross sale products, upscale products

* media

  product media

* inventory

  inventory type,quantity available

* shipping

  fulfillment type, width, height, depth, girth, container size, container type, 

  dimension units, weight, is machine sortable, weight units

* advanced

  discountable, upc, can sell without options, display template, model, external id

  product attributes

### 3. Product Options

product options contains those attributes:

* general

  Label, Required, Type, Use in Sku generation, Display Order, Attribute Name

* validation

  Error Code, Error Message, Validation String Expression, Validation Strategy, Validation Type

 

## Functions Explanation

### 1. Product Management

* search product

  search product by name or other attributes like parent category , url, manufacture, retail price, sale price

* add product

  * add general attributes
  * add marketing attributes
  * add inventory attributes
  * add shipping attributes
  * add advanced attributes

* edit product

  * edit general attributes
  * edit marketing attributes
  * edit(add) cross sale products
  * edit(add) upsale products
  * edit(add) media attributes
  * edit(add) additional skus
  * edit(add) product options
  * edit inventory attributes
  * edit shipping attributes
  * edit advanced attributes
  * edit(add) product attributes

* delete product

  * delete product 
  * delete media
  * delete additional skus
  * delete product options
  * delete product attributes
  * delete cross sale products
  * delete upsale products

* view product

### 2. Product Bundle Management

* search product bundle

  search product bundle by name or other attributes like parent category , url, manufacture, retail price, sale price

* add product bundle

  * add general attributes
  * add marketing attributes
  * add inventory attributes
  * add shipping attributes
  * add advanced attributes

* edit product bundle

  * edit general attributes
  * edit(add) sku bundle items
  * edit marketing attributes
  * edit(add) cross sale products
  * edit(add) upsale products
  * edit(add) media attributes
  * edit inventory attributes
  * edit shipping attributes
  * edit advanced attributes
  * edit(add) product attributes

* delete product bundle

  * delete product bundle
  * delete cross sale products
  * delete upsale products
  * delete media
  * delete product attributes

* view product bundle

### 3. Product Options Management

* search product option

  search product options by label or other attributes like required

* add product option

  * add general attributes
  * add validation attributes

* edit product option

  * edit general attributes
  * edit validation attributes
  * edit(add) allowed values

* delete product option

  * delete allowed values
  * delete product option

* view product option