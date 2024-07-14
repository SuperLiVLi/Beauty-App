# **美容预约平台**



## 功能介绍

### 一、主页

已完成

### 二、我的

我的部分需要包含：

如图：



<img src="C:\Users\yinya\AppData\Roaming\Typora\typora-user-images\image-20220709163151350.png" alt="image-20220709163151350" style="zoom: 25%;" />

里面需要包含：

 1. 我的订单信息
 2. VIP信息：用户的VIP信息，如果是VIP信息就展示VIP号码

**具体流程模拟**

 1. 在点击“我的预约”时，会显示用户历史预约记录

    界面可以设计成如下形式

    ![image-20220709201332643](C:\Users\yinya\AppData\Roaming\Typora\typora-user-images\image-20220709201332643.png)

    点击记录能不能显示详情信息看你们，想实现就实现不想实现就算了

 2. 当用户点击“VIP信息”时，可以展示如下界面

    <img src="C:\Users\yinya\AppData\Roaming\Typora\typora-user-images\image-20220709201752286.png" alt="image-20220709201752286" style="zoom:50%;" />

    （大多数APP的会员界面都是问要不要续费的，淦，你们可以自己简化一下）

    **接口定义**

    1. 查看我的订单功能的实现

       操作在User类里面

       接口/方法名: `queryOrderByUser`

       传参：`String name`

       返回类型: `List<Projects>`

       需要查询的有：项目名称、项目的图片、花费

    2. VIP信息的实现

       在`user`表中新建一列叫`VIPLevel`,0代表不是VIP，1代表是VIP1，从而代表VIP等级

       操作在User类里面

       接口/方法名:`queryVIPByUser`

       传参：`String name`

       返回类型: `Integer` -> VIP等级

### 三、技师

技师部分需要包含：

1. 技师的姓名
2. 技师的描述（介绍）
3. 技师的照片
4. 技师负责哪个项目
5. 评价（有时间最后再说）

技师界面要实现的功能：

1. 首先显示技师的姓名，擅长信息（与首页部分相同）
2. 点击具体技师的姓名，会弹出详情信息
3. 用户可以根据技师负责的项目来进行项目预约
4. 可以显示用户对于该技师的评价如何

**具体实现**

 1. 数据库实现

    数据库表信息：

    表名：technician

    作用：用于存储技师的基本信息

    | 名          | 类型    | 不是null | 描述         | 主键/外键/其他 |
    | ----------- | ------- | -------- | ------------ | -------------- |
    | id          | bigint  | √        | 技师的id     | 主键/外键      |
    | techexplain | varchar |          | 技师介绍     |                |
    | techname    | varchar |          | 技师姓名     |                |
    | imageurl    | varchar |          | 技师图片地址 |                |

​	表名：tech_comment

​	作用：用于存储对于技师的评价

| 名      | 类型    | 不是null | 描述                                         | 主键/外键/其他       |
| ------- | ------- | -------- | -------------------------------------------- | -------------------- |
| id      |         |          | 第几条评价                                   |                      |
| content | varchar |          | 评论内容                                     |                      |
| towhom  | bigint  | √        | 里面存储技师id用于表示对于对第几个技师的评价 | 与technician建立连接 |
| author  | bigint  | √        | 评论作者姓名                                 | 与user建立连接       |

 2. 模拟功能流程

    首先，当用户点击“技师”界面之后会列出所有的技师列表：

    <img src="C:\Users\yinya\AppData\Roaming\Typora\typora-user-images\image-20220709174248195.png" alt="image-20220709174248195" style="zoom: 50%;" />

    当用户点击具体的某个技师介绍时，会弹出对于技师的详细介绍：

    ![image-20220709195112507](C:\Users\yinya\AppData\Roaming\Typora\typora-user-images\image-20220709195112507.png)

​		当点击预约专家按钮时，会弹出该专家负责的项目：

​		（这部分可以参考首页界面进行处理）

---

如果还有时间，可以添加评论功能

在点击技师评价时，底部会弹出添加评价按钮

![image-20220709195624291](C:\Users\yinya\AppData\Roaming\Typora\typora-user-images\image-20220709195624291.png)

之后可以进行添加评论功能

![image-20220709200000372](C:\Users\yinya\AppData\Roaming\Typora\typora-user-images\image-20220709200000372.png)

**接口定义**

 1. 查询技师列表功能的实现

    在`Technician`类里面实现

    与首页“推荐”查询类似

    接口/方法名：`queryAll`

    传参：`void`

    返回类型`List<Technican>`

    需要查询的有：技师姓名，技师图片，技师简介

2. 技师详情信息的实现

   在`Technician`类里面实现

   与项目详情页面相似

   接口/方法名: `queryByTid`

   传参：`Integer id`

   返回值：`Technican`

   需要查询的有：技师姓名，技师图片，技师简介，技师评价

3. 点击预约时，跳转到专家负责具体项目的实现：

   在`Technician`类里面实现，同时需要调用Business以及Project里面的内容（依SQL查询语句而定）

   与首页点击“美容”，“美甲”后弹出具体项目类似

   接口/方法名：`queryByName`

   传参：`String name`

   返回值: `List<Projects>`

   需要查询的有：项目名称，项目简介，项目价格，项目图片

4. 评论功能的实现

   查看评论

   在`tech_comment`类里面实现

   接口/方法名：`queryComments`

   传参列表: `String name`

   返回值: `List<Users>`

   需要查询的有：`tech_comment`表中的所有内容

5. `Users`类的实现

   继承自`User`类，额外添加`imageurl`以显示头像

6. 添加评论功能的实现

   在`tech_comment`类里实现

   接口/方法名：`insertComment`

   传参列表：`tech_comment techcomment`

   返回值：`ResultData`

   将前端的内容插入到后端`tech_comment`表中

   