# [pom](https://maven.apache.org/pom.html) Project Object Model

```xml
<!-- 版本 -->
<!-- 开发版本以 -SNAPSHOT 结尾 -->
<version>1.0.0</version>

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

## packaging

When no packaging is declared, Maven assumes the packaging is the default: jar.
