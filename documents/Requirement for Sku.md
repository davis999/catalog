## 1. Introduce
Catalog Service support following user case:
* query sku inventory by sku id
* query sku simple information
* query list of sku information by list of id

## 2. query sku inventory by sku id
Use sku id to query sku inventory.
response & exception:
* if sku is active, return the inventory.
* if sku is not active, throw exception with description "Sku is not active".
* if sku is not found ,throw exception with description "Sku is not exist"

## 3. query sku simple information
Use sku id to query simple information
response & exception:
* if sku is exist and active, return simple information.
* if sku is not exist, throw exception with description "Sku is not exist"
* if sku is not active, throw exception with description "Sku is not active"

## 4. query list of sku information by list of id
Use list of sku id to query sku information
response & exception:
* if success, should return list of sku information
* if list of id is null or empty, throw exception with description "sku id is null"
* if sku is not exist or not active, should be excluded
* if all sku is not exist or not active, should return null list