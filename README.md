# Spring-Boot--redis-example

> #### Spring-Boot With `redis/mysql/flyway/HikariDatasource` example project

![Description Image](https://programmerfriend.com/img/content/robust-boot_title.png)

![mysql](https://raw.githubusercontent.com/docker-library/docs/c408469abbac35ad1e4a50a6618836420eb9502e/mysql/logo.png)

![flyway](https://camo.githubusercontent.com/4f26012c1f3873c9d6866dc14c48b2157cec6295/68747470733a2f2f666c7977617964622e6f72672f6173736574732f6c6f676f2f666c797761792d6c6f676f2d746d2e706e67)

## Description

Simple Spring Boot Project that connect to Redis DB / Mysql Database

### How to run
Simply run this command to start server

```bash
mvn spring-boot:run
```

Server will start like this
```shell script

[INFO] <<< spring-boot-maven-plugin:2.1.7.RELEASE:run (default-cli) < test-compile @ demo <<<
[INFO]
[INFO]
[INFO] --- spring-boot-maven-plugin:2.1.7.RELEASE:run (default-cli) @ demo ---
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.7.RELEASE)

2019-09-11 17:12:32.346  INFO 14244 --- [  restartedMain] com.example.demo.DemoApplication         : Starting DemoApplication on NDTH-chayutr with PID 14244 (D:\R&D\spring-boot\demo\target\classes started by Chayut in D:\R&D\spring-boot\demo)
2019-09-11 17:12:32.351  INFO 14244 --- [  restartedMain] com.example.demo.DemoApplication         : No active profile set, falling back to default profiles: default
2019-09-11 17:12:32.417  INFO 14244 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2019-09-11 17:12:32.420  INFO 14244 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2019-09-11 17:12:33.852  INFO 14244 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode!
2019-09-11 17:12:33.855  INFO 14244 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data repositories in DEFAULT mode.
2019-09-11 17:12:33.888  INFO 14244 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 16ms. Found 0 repository interfaces.
2019-09-11 17:12:34.328  INFO 14244 --- [  restartedMain] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration$$EnhancerBySpringCGLIB$$eb12431] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2019-09-11 17:12:35.037  INFO 14244 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2019-09-11 17:12:35.141  INFO 14244 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2019-09-11 17:12:35.141  INFO 14244 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.22]
2019-09-11 17:12:35.298  INFO 14244 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2019-09-11 17:12:35.299  INFO 14244 --- [  restartedMain] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2851 ms
2019-09-11 17:12:35.477  INFO 14244 --- [  restartedMain] o.f.c.internal.license.VersionPrinter    : Flyway Community Edition 5.2.4 by Boxfuse
2019-09-11 17:12:35.487  INFO 14244 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2019-09-11 17:12:35.698  INFO 14244 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2019-09-11 17:12:35.703  INFO 14244 --- [  restartedMain] o.f.c.internal.database.DatabaseFactory  : Database: jdbc:mysql://192.168.99.100:3306/springboot_test (MySQL 8.0)
2019-09-11 17:12:35.798  INFO 14244 --- [  restartedMain] o.f.core.internal.command.DbValidate     : Successfully validated 2 migrations (execution time 00:00.026s)
2019-09-11 17:12:35.827  INFO 14244 --- [  restartedMain] o.f.core.internal.command.DbMigrate      : Current version of schema `springboot_test`: 2
2019-09-11 17:12:35.829  INFO 14244 --- [  restartedMain] o.f.core.internal.command.DbMigrate      : Schema `springboot_test` is up to date. No migration necessary.
2019-09-11 17:12:36.357  INFO 14244 --- [  restartedMain] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2019-09-11 17:12:36.894  INFO 14244 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2019-09-11 17:12:36.961  INFO 14244 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2019-09-11 17:12:36.964  INFO 14244 --- [  restartedMain] com.example.demo.DemoApplication         : Started DemoApplication in 5.123 seconds (JVM running for 5.846)
```
