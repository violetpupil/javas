# 项目结构

- pom.xml 项目描述文件
- src
  - main
    - java 程序代码
  - test
    - java 测试代码
- target 编译打包生成文件

## 多模块

- module-a
  - pom.xml
  - src
- module-b
  - pom.xml
  - src
- parent
  - pom.xml
- pom.xml

```xml
<!-- parent用来提取公共配置，`<packaging>` 是pom而不是jar -->
<groupId>com.instafever.demos</groupId>
<artifactId>parent</artifactId>
<version>1.0.0</version>
<packaging>pom</packaging>
```

```xml
<!-- 设置parent -->
<parent>
    <groupId>com.instafever.demos</groupId>
    <artifactId>parent</artifactId>
    <version>1.0.0</version>
    <!-- 可以不指定路径 -->
    <!-- maven 会自动搜索本地和远程仓库 -->
    <relativePath>../parent/pom.xml</relativePath>
</parent>

<artifactId>ma</artifactId>
<packaging>jar</packaging>
```

```xml
<!-- 根目录声明模块 -->
<groupId>com.instafever.demos</groupId>
<artifactId>build</artifactId>
<version>1.0.0</version>
<packaging>pom</packaging>

<modules>
    <module>parent</module>
    <module>ma</module>
    <module>mb</module>
</modules>
```
