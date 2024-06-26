该目录下为Spring Boot 1.x版本的教程，因为版本落后，**后续不再继续更新**。

推荐下面的2.x版本，还在持续更新哦！

- 教程汇总（1.x版本）：[《Spring Boot基础教程》](https://blog.didispace.com/spring-boot-learning-1x/)
- 教程汇总（2.x版本）：[《Spring Boot基础教程》](https://blog.didispace.com/spring-boot-learning-2x/)

Spring Boot 2.x版本的教程可在`2.x`目录下查看。


## 教程目录（1.x版本）

本教程版本基于Spring Boot 1.3.x - 1.5.x，部分内容可能会有出入。如果您发现问题，首先看版本是否一致。如果还有问题，可以提Issue指出。

如果您要学习Spring Boot 2.x版本，可以切换到2.x分支学习，本教程正在连载2.x版本的最新教程，如果您觉得内容不错，Star关注我吧！

#### 快速入门

- [Spring Cloud Alibaba与Spring Boot、Spring Cloud之间不得不说的版本关系](http://blog.didispace.com/spring-cloud-alibaba-version/)
- chapter1：[基本项目构建（可作为工程脚手架），引入web模块，完成一个简单的RESTful API](http://blog.didispace.com/spring-boot-learning-1/)
- [使用Intellij中的Spring Initializr来快速构建Spring Boot/Cloud工程](http://blog.didispace.com/spring-initializr-in-intellij/)

> 提示：我们在学习Spring Boot、Spring Cloud的时候，一定要知道它们的版本关系，以避免不必要的困恼。

#### 工程配置

- chapter2-1-1：[配置文件详解：自定义属性、随机数、多环境配置等](http://blog.didispace.com/springbootproperties/)
- chapter2-2-1：[2.0 新特性（一）：配置绑定全解析](http://blog.didispace.com/Spring-Boot-2-0-feature-1-relaxed-binding-2/)
- chapter2-1-2：[2.0 新特性（二）：新增事件ApplicationStartedEvent](http://blog.didispace.com/Spring-Boot-2-0-feature-2-ApplicationStartedEvent/)

#### Web开发

- chapter3-1-1：[构建一个较为复杂的RESTful API以及单元测试](http://blog.didispace.com/springbootrestfulapi/)
- chapter3-1-2：[使用Thymeleaf模板引擎渲染web视图](http://blog.didispace.com/springbootweb/)
- chapter3-1-3：[使用Freemarker模板引擎渲染web视图](http://blog.didispace.com/springbootweb/)
- chapter3-1-4：[使用Velocity模板引擎渲染web视图](http://blog.didispace.com/springbootweb/)
- chapter3-1-5：[使用Swagger2构建RESTful API](http://blog.didispace.com/springbootswagger2/)
- chapter3-1-6：[统一异常处理](http://blog.didispace.com/springbootexception/)
- chapter3-1-7：[使用Java 8中LocalDate等时间日期类的问题解决](http://blog.didispace.com/Spring-Boot-And-Feign-Use-localdate/)
- chapter3-1-8：[扩展XML请求和响应的支持](http://blog.didispace.com/spring-boot-xml-httpmessageconverter)

#### 数据访问

- chapter3-2-1：[使用JdbcTemplate](http://blog.didispace.com/springbootdata1/)
- chapter3-2-2：[使用Spring-data-jpa简化数据访问层（推荐）](http://blog.didispace.com/springbootdata2/)
- chapter3-2-3：[多数据源配置（一）：JdbcTemplate](http://blog.didispace.com/springbootmultidatasource/)
- chapter3-2-4：[多数据源配置（二）：Spring-data-jpa](http://blog.didispace.com/springbootmultidatasource/)
- chapter3-2-5：[使用NoSQL数据库（一）：Redis](http://blog.didispace.com/springbootredis/)
- chapter3-2-6：[使用NoSQL数据库（二）：MongoDB](http://blog.didispace.com/springbootmongodb/)
- chapter3-2-7：[整合MyBatis](http://blog.didispace.com/springbootmybatis/)
- chapter3-2-8：[MyBatis注解配置详解](http://blog.didispace.com/mybatisinfo/)
- chapter3-2-9：[使用Flyway来管理数据库版本](http://blog.didispace.com/spring-boot-flyway-db-version/)
- chapter3-2-10：[使用LDAP来统一管理用户信息](http://blog.didispace.com/spring-boot-ldap-userDTO/)
- chapter3-2-11：[Spring Boot中增强对MongoDB的配置（连接池等）](http://blog.didispace.com/springbootmongodb-plus/)

#### 事务管理

- chapter3-3-1：[使用事务管理](http://blog.didispace.com/springboottransactional/)
- chapter3-3-2：[分布式事务（未完成）]

#### 其他内容

- chapter4-1-1：[使用@Scheduled创建定时任务](http://blog.didispace.com/springbootscheduled/)
- chapter4-1-2：[使用@Async实现异步调用](http://blog.didispace.com/springbootasync/)
- chapter4-1-3：[使用@Async实现异步调用：自定义线程池](http://blog.didispace.com/springbootasync-2/)
- chapter4-1-4：[使用@Async实现异步调用：资源优雅关闭](http://blog.didispace.com/springbootasync-3/)
- chapter4-1-5：[使用@Async实现异步调用：使用Future以及定义超时](http://blog.didispace.com/springbootasync-4/)

#### 日志管理

- chapter4-2-1：[默认日志的配置](http://blog.didispace.com/springbootlog/)
- chapter4-2-2：[使用log4j记录日志](http://blog.didispace.com/springbootlog4j/)
- chapter4-2-3：[对log4j进行多环境不同日志级别的控制](http://blog.didispace.com/springbootlog4jmuilt/)
- chapter4-2-4：[使用AOP统一处理Web请求日志](http://blog.didispace.com/springbootaoplog/)
- chapter4-2-5：[使用log4j记录日志到MongoDB](http://blog.didispace.com/springbootlog4jmongodb/)
- chapter4-2-6：[Spring Boot 1.5.x新特性：动态修改日志级别](http://blog.didispace.com/spring-boot-1-5-x-feature-1/)]

#### 安全管理

- chapter4-3-1：[使用Spring Security](http://blog.didispace.com/springbootsecurity/)
- chapter4-3-2：[使用Spring Session（未完成）]

#### 缓存支持

- chapter4-4-1：[注解配置与EhCache使用](http://blog.didispace.com/springbootcache1/)
- chapter4-4-2：[使用Redis做集中式缓存](http://blog.didispace.com/springbootcache2/)

#### 邮件发送

- chapter4-5-1：[实现邮件发送：简单邮件、附件邮件、嵌入资源的邮件、模板邮件](http://blog.didispace.com/springbootmailsender/)

#### 消息服务

- chapter5-1-1：[JMS（未完成）]
- chapter5-2-1：[Spring Boot中使用RabbitMQ](http://blog.didispace.com/spring-boot-rabbitmq/)

#### 其他功能

- chapter6-1-1：[使用Spring StateMachine框架实现状态机](http://blog.didispace.com/spring-statemachine/)
- [Spring Boot Actuator监控端点小结](http://blog.didispace.com/spring-boot-actuator-1/)
- [在传统Spring应用中使用spring-boot-actuator模块提供监控端点](http://blog.didispace.com/spring-boot-actuator-without-boot/)
- [Spring Boot应用的后台运行配置](http://blog.didispace.com/spring-boot-run-backend/)
- [Spring Boot自定义Banner](http://blog.didispace.com/spring-boot-banner/)

#### Dubbo进行服务治理

- chapter9-2-1：[Spring Boot中使用Dubbo进行服务治理](https://gitee.com/didispace/SpringBoot-Learning/tree/master/Chapter9-2-1)
- chapter9-2-2：[Spring Boot与Dubbo中管理服务依赖](https://gitee.com/didispace/SpringBoot-Learning/tree/master/Chapter9-2-2)

## 推荐内容

- [我的博客](http://blog.didispace.com)：分享平时学习和实践过的技术内容
- [知识星球](https://t.xiaomiquan.com/zfEiY3v)：聊聊技术人的斜杠生活
- [GitHub](https://github.com/dyc87112/SpringBoot-Learning)：Star支持一下呗
- [Gitee](https://gitee.com/didispace/SpringBoot-Learning)：Star支持一下呗
- [Spring问答社区](http://www.spring4all.com/)：如果您有什么问题，可以去这里发帖
- [Spring Boot基础教程](http://blog.didispace.com/Spring-Boot%E5%9F%BA%E7%A1%80%E6%95%99%E7%A8%8B/)：全网Star最多的免费Spring Boot基础教程
- [Spring Cloud基础教程](http://blog.didispace.com/Spring-Cloud%E5%9F%BA%E7%A1%80%E6%95%99%E7%A8%8B/)：全网最早最全的免费Spring Cloud基础教程

## 我的公众号

<img src="https://github.com/dyc87112/SpringBoot-Learning/blob/master/images/weixin.jpg?raw=true" style="width:150px;height:150px;" />


