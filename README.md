# springboot
demo

1、demo是一个springboot的简单例子，有一个接口可以通过localhost:8090/访问
2、增加了swagger-ui，展示api接口，http://localhost:8090/swagger-ui.html

demomysql

1、demomysql是一个集合mybatis访问mysql数据库的例子，实现了增删改查接口。
2、实现了增加数据的两种接口形式，@PathVariable和@RequestParam
@PathVariable参数的接口为http://localhost:8089/testBoot/insert/5/aaa/aaa/aaa
@RequestParam参数的接口为http://localhost:8089/testBoot/insert2?id=5&name=aaa&passwd=aaa&realname=aaa
3、增加了swagger-ui，展示api接口，http://localhost:8089/swagger-ui.html
