# [pom](https://maven.apache.org/pom.html) Project Object Model

```xml
<!-- 固定开头 -->
<project xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
</project>
```

```xml
<groupId>com.instafever</groupId>
<artifactId>javas</artifactId>
<!-- 版本 -->
<!-- 开发版本以 -SNAPSHOT 结尾 -->
<version>1.0.0</version>
<!-- When no packaging is declared, Maven assumes the packaging is the default: jar. -->
<packaging>jar</packaging>

<!-- 属性 -->
<properties>
    <!-- 读写文件时使用的编码 -->
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
</properties>

<!-- 声明依赖 -->
<!-- 缓存目录 $HOME/.m2 -->
<!-- 开发版本每次都会重新下载 -->
<dependencies>
    <dependency>
        <groupId></groupId>
        <artifactId></artifactId>
        <version></version>
    </dependency>
</dependencies>
```

```xml
<!-- 构建插件配置 -->
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-jar-plugin</artifactId>
            <version>3.3.0</version>
            <configuration>
                <!-- 设置 jar 包主类 -->
                <archive>
                    <manifest>
                        <mainClass>Hello</mainClass>
                    </manifest>
                </archive>
            </configuration>
        </plugin>
    </plugins>
</build>
```
