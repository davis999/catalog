## 1. Introduce
Catalog Service support following user case:
* add category
* edit category
* delete category
* get all category
* get a category detail
* add product
* remove product

## 2. add category
Users commit some fields of category and catalog service uses those to
new a category and save it.

request: name(String), display order(int), description(String)

response and exception:
* if success, should return saved category.
* if name is exist, should throw exception with status. ALREADY_EXISTS 
and description "category name is exist"
* if name is to long (max length is 255), should throw exception with status.OUT_OF_RANGE
and description "category name is too long"
* if displayOrder is negative, should throw exception with status.OUT_OF_RANGE
and description "display order should not be negative"
* if description is to long (max length is 1024), should throw exception with
status.OUT_OF_RANGE and description "description is too long"