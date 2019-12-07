## mybatis与spring的整合
### 整合思路
* sqlsessionFactory对象放到spring容器中作为单例存放
* 传统dao的开发方式种，应该从spring容器中获取sqlsession对象
* Mapper代理形式中，应该从spring容器中直接获得mapper代理对象
* 数据库的链接及书籍库连接池事务管理都交给spring容器管理来完成
### 整合步骤
1. 创建工程添
2. 导入jar包  
3. 编写spring和mybatis的配置文件（了解一下mybatis-spring整合包的源码）  
>spring配置文件：
		* 数据库的链接及连接池
		* sqlsessionFactory对象，配置到spring容器中
		* 编写spring的配置文件  
4.编写jdbc.properties配置文件及log4j配置文件