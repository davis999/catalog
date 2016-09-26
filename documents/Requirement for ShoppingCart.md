## 1. Introduce
Catalog Service support following user case:
* query sku inventory by sku id
* query sku simple information

## 2. query sku inventory by sku id
ShoppingCart use sku id to query sku inventory.
response & exception:
* if sku is active, return the real number.
* if sku is not active, throw exception with description "Sku is not active".
* if sku is not found ,throw exception with description "Sku is not exist"

## 3. query sku simple information
ShoppingCart use sku id to query simple information
response & exception:
* if sku is exist and active, return simple information.
* if sku is not exist, throw exception with description "Sku is not exist"
* if sku is not active, throw exception with description "Sku is not active"