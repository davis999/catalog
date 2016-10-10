## 1. Introduce
Catalog Service support following user case:
* get all categories
* get products by category
* get product detail

## 2. get all categories
应用场景：在浏览网站的时候，需要获取到所有的category。
正常流程：顾客访问网站，由webserver接收到顾客请求，然后调用catalog的接口获取到所有的category，然后返回页面渲染。

## 3. get products by category
应用场景：顾客点击某一个category，跳转到产品列表页面，该页面列出这个category的所有产品。
正常流程：顾客点选了某一个category，由webserver接收请求，调用catalog的接口获取对应的产品列表，返回给产品列表页面渲染。
异常情况：
1. category的id不存在，返回404页面
2. category的id存在，没有关联的产品，返回空页面

## 4. get product detail
应用场景：顾客在产品列表页面点击了某一个产品，跳转到产品详情页面，该页面展示产品的所有信息。
正常流程：顾客选择了某一个产品，由webserver接收请求，调用catalog的接口获取对应的产品详情信息，返回给产品详情页面渲染。
异常情况：
1. 产品的id不存在，返回404页面