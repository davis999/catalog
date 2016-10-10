## 1. Introduce
This document describes the design for catalog service.

---

## 2. Technology Component
* SpringBoot and Spring Framework
* GRPC
* Gradle
* Spock
* Mysql

---

## 3. GRPC API
In [catalog-service.proto](https://github.com/reactivesw/catalog/blob/master/src/main/proto/catalog-service.proto), define 2 service and 3 rpc API.
The request and response message are in [catalog-message.proto](https://github.com/reactivesw/catalog/blob/master/src/main/proto/catalog-message.proto).

### 3.1 CategoryService
#### 3.1.1 getCategories
* description: get all categories.
* key point: setup system, if cann't find any category, should initial a root category.should be only one layer.
* parameters:Empty - no request
* return:CategoryList - list of GrpcCategory
* exception:

exception status | message | Customerized exception | description
-----------------|---------|------------------------|--------------
INTERNAL         | "System error."|InternalException|cann't get any category

### 3.2 ProductService
#### 3.2.1 getProductsByCategory
* description: get list of product by category id.
* parameters:Int64Value - id of category
* return:ProductBriefList - list of ProductBrief
* exception:

exception status | message | Customerized exception | description
-----------------|---------|------------------------|--------------
NOT_FOUND        |" category id is not exist " | NotFoundException | conn't get any 

#### 3.2.2 getProductDetail
* description: get product detail by it's id.
* parameters: Int64Value - id of product
* return: GrpcProduct - product detail
* exception:

exception status | message | Customerized exception | description
-----------------|---------|------------------------|--------------
NOT_FOUND        | "product is not exist" | NotFoundException | conn't get product by this id

---

## 4. Exception
GrpcException status | Customerized Exception | description
---------------------|------------------------|----------------------------
NOT_FOUND            | NotFoundException      | when something conn't found 
INTERNAL             | InternalException      | when something going wrong and don't know what heppend

---

## 5. Data 
In database, define following table:
#### Category
name | type | nullable | description | related
-|-|-|-|-|
category_id | long | no | primary key, auto increment | 
name | String | no | category name, max length is 255 | 
description | String | yes | description of category, max length is 1024 |
displayOrder | int | yes | display order of category, optional field, default is 0|
createdTime | ZonedDateTime | no | store date time when create category, should be utc |
modifiedTIme | ZonedDateTime | no | store date time when modify category, should be utc |