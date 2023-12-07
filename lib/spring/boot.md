# [spring-boot](https://spring.io/projects/spring-boot)

[文档](https://docs.spring.io/spring-boot/docs/current/reference/html/)

[api](https://docs.spring.io/spring-boot/docs/current/api/)

```bash
# 直接运行spring boot应用
mvnw spring-boot:run --quiet
# 打包后运行
# maven-jar 打包后, spring-boot 重新打包，将依赖都放到 jar 包里
# target/demo-0.0.1-SNAPSHOT.jar spring-boot 打包的文件
# target/demo-0.0.1-SNAPSHOT.jar.original maven-jar 打包的文件
mvnw clean package
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

## [application.properties](https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html)

```conf
# Server HTTP port.
server.port=8080
```
