## 1. gRPC API
In [catalog_sku_service.proto](https://github.com/reactivesw/catalog_proto/blob/master/catalog_sku_service.proto), define 1 service and 3 rpc API.
The request and response message are in [catalog_sku_message.proto
](https://github.com/reactivesw/catalog_proto/blob/master/catalog_sku_message.proto).
### 1.1 query sku inventory by sku id
* description : query sku inventory by sku id.
* parameters : Int64Value(value(long))
* return : Int32Value - inventory of sku.
* exception :

exception status | message | Customerized exception | description
-----------------|---------|------------------------|--------------
NOT_FOUND  | "sku is not exit" | NotFoundException | "sku is not exit"
UNAVAILABLE | "sku is not active" | SkuNotActiveException | "sku is not active"

### 1.2 query sku simple information
* description : query sku simple information.
* paramenters : Int64Value(value(long))
* return : SkuInformation
* exception : 

exception status | message | Customerized exception | description
-----------------|---------|------------------------|--------------
NOT_FOUND  | "sku is not exit" | NotFoundException | "sku is not exit"
UNAVAILABLE | "sku is not active" | SkuNotActiveException | "sku is not active"

### 1.3 query list of sku information by list of id
* description : use list of sku id to query list of sku information
* parementers : SkuIdList(sku_id(List<long>))
* return : SkuInformationList
* exception :

exception status | message | Customerized exception | description
-----------------|---------|------------------------|--------------
DATA_LOSS | "list of id is null" | NullParameterException | "list of id is null"
