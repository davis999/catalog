#Catelog Requirement Document
##1. Introduce
The project provides other services with funtions of catelog.
Including modules as follows:
* category management
* product management
  * product
  * product bundle
  * product options
* media assets management
* promotions management
* dynamic pricing support

##2. Category Management
The module is responsible for managing category.
Category has following attributes:
* general:
  name,url,long description,active start date,active end date,tax code
* marketing:
  featured products,cross sale products,upsale products
* media:
  media assets
* facets:
  category search facets,excluded search facets
* advanced:
  display template,default inventory type,default fulfillment type,external id,child categories,category attributes
* products

The module provides functions as follows:
* add category
  * add general attributes
  * add advanced attributes
* edit category
  * edit general attributes
  * edit marketing attributes
  * edit media assets
  * edit facets attributes
  * edit advanced attributes
  * edit products
* search category
 
 search category by name or url
* view category

  view all attributes of category
* delete category

##3. Product Management
The module is responsible for managing product,product bundle and product options.
Providing functions as follows:
###3.1 product
Product has following attributes
* general:
  name, primary image, description, parent category, manufacturer, url,retail price, sale price,start date, end date,taxable,tax code
* marketing:
  is featured product, cross sale products, upsale products
* media:
  product media
* product options:
  additional skus, product options
* inventory:
  inventory type, quantity available
* shipping:
  fulfillment type, width, height, depth, girth, container size, container type,dimension units, weight, is machine sortable, weight units
* advanced:
  discountable, upc, can sell without options, display template, model, external id,product attributes

The module provides functions as follows:
* add product
  * add general attributes
  * add marketing attributes
  * add inventory attributes
  * add shipping attributes
  * add advanced attributes
* edit product
  * edit general attributes
  * edit marketing attributes
  * edit media attributes
  * edit product options
  * edit inventory attributes
  * edit shipping attributes
  * edit advanced attributes
* search product
 
 search product by name or url, manufacture, price, parent category
* view product
 
 view all attributes of product
* delete product

###3.2 product bundle
Product bundle has following attributes:
* general:
  name, primary image, description, parent category, manufacturer, url,pricing model, retail price,sale price,start date,end date,taxable,tax code,sku bundle items
* marketing:
  is featured product, cross sale products, upscale products
* media:
  product media
* inventory:
  inventory type,quantity available
* shipping:
  fulfillment type, width, height, depth, girth, container size, container type,dimension units, weight, is machine sortable, weight units
* advanced:
  discountable, upc, can sell without options, display template, model, external id,product attributes

The module provides following functions:
* add product bundle
  * add general attributes
  * add marketing attributes
  * add inventory attributes
  * add shipping attributes
  * add advanced attributes
* edit product bundle
  * edit general attributes
  * edit marketing attributes
  * edit media attributes
  * edit inventory attributes
  * edit shipping attributes
  * edit advanced attributes
* search product bundle
 
 search product bundle by name or url, manufacture, price, parent category
* view product bundle
 
 view all attributes of product bundle
* delete product bundle

###3.3 product options
Product options have following attributes:
* general:
  Label, Required, Type, Use in Sku generation, Display Order, Attribute Name
* validation:
  Error Code, Error Message, Validation String Expression, Validation Strategy, Validation Type

The module provides following functions:
* add product options
  * add general attributes
  * add validation attributes
* edit product options
  * edit general attributes
  * edit validation attributes
  * edit(add) allowed values
* search product options
 
 search product options by option label or required
* view product options
 
 view all attributes of product options
* delete product options

##4. Media Assets Management
The module is responsible for managing media assets.
Media asset has following attributes:
* general
  item name,image,url,title,alt text
* file details
  mime type, file extension, file size bytes

Providing functions as follows:
* add media asset
* edit media asset
* search media asset
* view media asset
* delete media asset

##5. Promotions Management
The module is responsible for managing promotions.
promotions has following attributes:
* general:
  name, description, type, automatically considered, marketing message, discount type, value, start date, end date, time rule, Should this offer target specific customers, Should this offer target specific orders, Should this offer target orders with specific items (e.g. Buy X get Y), item discount rule
* codes:
  offer codes
* advanced:
  max uses per order, priority, max uses per customer, apply to sale price, item qualifier rule, item target rule, combinable, target system, qualifying item subtotal, targets and qualifiers must be related

The module providing functions as follows:
* add promotions
  * add general attributes
  * add advanced attributes
* edit promotions
  * edit general attributes
  * edit codes
  * edit advanced
* search promotions
* view promotions
* delete promotions

##6. Dynamic Pricing Support
Dynamic pricing support dependens on two modules,product options and promotions.
By setting product options,we can set price of different sku product.
By setting promotions,we can set price of special product.
