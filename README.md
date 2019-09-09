# Spring-Boot--redis-example
Spring-Boot With redis example project

![Description Image](https://programmerfriend.com/img/content/robust-boot_title.png)

## Description

Simple Spring Boot Project that conect to Redis DB

### How to run
Simply run this command to start server

```bash
mvn spring-boot:run
```

Server will start like this
```bash

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

2019-09-09 09:54:16.133  INFO 10532 --- [  restartedMain] com.example.demo.DemoApplication         : Starting DemoApplication on NDTH-chayutr with PID 10532 (D:\R&D\spring-boot\demo\target\classes started by Chayut in D:\R&D\spring-boot\demo)
2019-09-09 09:54:16.136  INFO 10532 --- [  restartedMain] com.example.demo.DemoApplication         : No active profile set, falling back to default profiles: default
2019-09-09 09:54:16.231  INFO 10532 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2019-09-09 09:54:16.232  INFO 10532 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2019-09-09 09:54:17.062  INFO 10532 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode!
2019-09-09 09:54:17.065  INFO 10532 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data repositories in DEFAULT mode.
2019-09-09 09:54:17.113  INFO 10532 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 23ms. Found 0 repository interfaces.
2019-09-09 09:54:18.596  INFO 10532 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2019-09-09 09:54:18.634  INFO 10532 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2019-09-09 09:54:18.634  INFO 10532 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.22]
2019-09-09 09:54:18.831  INFO 10532 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2019-09-09 09:54:18.832  INFO 10532 --- [  restartedMain] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2575 ms
2019-09-09 09:54:19.400  INFO 10532 --- [  restartedMain] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2019-09-09 09:54:19.820  INFO 10532 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2019-09-09 09:54:19.883  INFO 10532 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2019-09-09 09:54:19.886  INFO 10532 --- [  restartedMain] com.example.demo.DemoApplication         : Started DemoApplication in 4.148 seconds (JVM running for 4.721)
```
