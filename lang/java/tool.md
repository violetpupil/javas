# [Tool](https://docs.oracle.com/en/java/javase/20/docs/specs/man/index.html)

## [java](https://docs.oracle.com/en/java/javase/20/docs/specs/man/java.html)

```bash
# java 版本
java -version
# To launch a class file
java mainclass
# 指定类路径 默认为当前目录 .
# 类路径可以是
# .class 文件目录
# jar 文件路径
# 指定多个类路径
# windows path;path
# linux path:path
java -cp classpath mainclass
# To launch the main class in a JAR file
java -jar jarfile
# To launch a single source-file program
java source-file
```

## [javac](https://docs.oracle.com/en/java/javase/20/docs/specs/man/javac.html)

```bash
# 将代码编译为类文件
javac <files>
```
