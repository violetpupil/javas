# [java](https://www.oracle.com/java/)

[文档](https://docs.oracle.com/en/java/javase/20/)

[教程](https://www.liaoxuefeng.com/wiki/1252599548343744)

## JVM & JRE & JDK

Java Virtual Machine

Java Runtime Environment

Java Development Kit

```image
 ┌─    ┌──────────────────────────────────┐
 │     │     Compiler, debugger, etc.     │
 │     └──────────────────────────────────┘
JDK ┌─ ┌──────────────────────────────────┐
 │  │  │                                  │
 │ JRE │      JVM + Runtime Library       │
 │  │  │                                  │
 └─ └─ └──────────────────────────────────┘
```

## [安装](https://www.oracle.com/java/technologies/)

安装 java17 只创建 C:\Program Files\Java\jdk-17

安装 java8 创建 C:\Program Files\Java\jdk-1.8 C:\Program Files\Java\jre-1.8

```batch
: windows临时设置JAVA_HOME环境变量
set JAVA_HOME=C:\Program Files\Java\jdk-1.8
: windows永久设置JAVA_HOME环境变量
setx JAVA_HOME "C:\Program Files\Java\jdk-1.8"
```

## jar

本质是 zip 压缩包

### META-INF/MANIFEST.MF

`Main-Class: Class` 指定主类
