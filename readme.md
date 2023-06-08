# 如何使用
1. 克隆本仓库
```shell
https://github.com/HandsomeZe/whitelist-daiguangze-spring-boot-starter.git
```

2. 使用maven install

使用IDEA中 maven 可视化工具即可

3. 在使用这个starter的项目中引入依赖
```xml
<dependency>
    <groupId>cn.ze.tool</groupId>
    <artifactId>whitelist-daiguangze-springboot-starter</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

4. 在springboot启动类上添加包扫描路径 
```java
@SpringBootApplication
@ComponentScan(basePackages = {"cn.ze.tool.middleware.*"})
public class ApiTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiTestApplication.class, args);
    }

}
```
