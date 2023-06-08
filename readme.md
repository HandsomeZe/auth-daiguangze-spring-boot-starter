# 快速开始
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

5. 在application.yml中配置白名单用户
```yaml
# 白名单用户 简单用法
cn:
  ze:
    tool:
      whitelist:
        users: aaa,111,daiguangze

```

6. 在需要的controller上添加 @ DoWhiteList 注解
```java
    @DoWhiteList(key = "userId", returnJson = "{\"code\":\"1111\",\"info\":\"非白名单可访问用户拦截！\"}")
    @RequestMapping(path = "/api/queryUserInfo", method = RequestMethod.GET)
    public UserInfo queryUserInfo(@RequestParam String userId) {
        return "hello";
    }
```
当传入的userID为配置的users中之外的人员时,返回returnJson
