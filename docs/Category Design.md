## 1. CATEGORY
### 1.1 Representations
Category
* id - Long 
  category的唯一标示， 由数据库自动生成。
* name - String
  name的长度需要大于3，小于64。
* description - String - Optional
  description的长度需要小于1024。
* displayOrder - int - Optional
  不能为负数，不填默认为0。
  同一个节点下的展示顺序，如果相同，则按照id来排序。  
* depth - int
  深度，顶层为0，子category在父category的depth上＋1.
* createdTime - DateTime
  数据库记录创建时间。
* lastModifiedTime - DateTime
  数据库记录修改时间。
* subCategories - Reference to Category - Optional

CategoryDraft
* name - String - Required
* description - String - Optional
* displayOrder - int - Optional
* parent - Refenrence to a category - Optional

### 1.2 Get Category by ID
Method: Get
Response Representation:  Category
Exception: 
1. 如果该ID不存在，则返回错误信息“ID is not existed”

### 1.3 Query Categories
Method: Get
Response Representation: list of Category
Query Parameters:
*   where - Optional
    查询的限制条件，如name == "phone", id == 100000000L, createAt > datetime'2016-10-01 00:00:00'
查询category允许的限制条件包括：
    * id 
      使用＝表达式，查询的是确定的id
    * name
      使用like表达式，查询的是%name%
    * createAt
      使用<=和>= ，查询的是datetime(?) <= createAt <= datetime(?)
    * lastModifiedAt
      使用<=和>= ，查询的是datetime(?) <= lastModifiedAt <= datetime(?)
* sort - Optional
    查询结果排序，比如按照name字典正序排列，按照id正序排列，包括的条件（正序反序都可以）有：
    * id 
    * name
    * createAt
    * lastModifiedAt
* limit - Optional
    限制查询数量
* offset - Optional
    查询偏移量

### 1.4 Create a Category
Method: Post
Request Representation: CategoryDraft
Response Representation: Category
Exception:
1. name长度错误，则返回信息"the length of name should be greater than 3 and less than 64"
2. name为空，则返回信息"the name is null"
3. 同一节点下name重复，则返回信息"the name is existed"
4. description过长，则返回信息"the description is too long"
5. parent不存在，则返回信息"parent is not existed"
6. displayOrder为负数，则返回信息"the displayOrder should be a non-negative integer "

### 1.5 Update Category
#### 1.5.1 change name
Exception：
1. name长度错误，则返回信息"the length of name should be greater than 3 and less than 64"
2. name为空，则返回信息"the name is null"
3. 同一节点下name重复，则返回信息"the name is existed"
#### 1.5.2 change description
Exception:
1. description过长，则返回信息"the description is too long"
#### 1.5.3 change parent
Exception:
1. parent不存在，则返回信息"parent is not existed"
#### 1.5.4 change displayOrder
Exception:
1. displayOrder为负数，则返回信息"the displayOrder should be a non-negative integer "

### 1.6 Delete Category By ID
method: delete
Response Representation: message of result
Exception:
1. 当有product或者category与要删除的category关联，则不能直接删除category，这时会返回信息"not a null category, conn't delete'"。
2. 如果ID不存在，则返回信息"the category is not existed"。

### 1.7 get all category
Method: Get
Request Representation: null
Response Representation: List of Category
Exception:
1. 没有结果，则返回错误代号为NOT_FOUND，描述为 "query all categories fail, no categories"