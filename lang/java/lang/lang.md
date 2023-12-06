# [language](https://docs.oracle.com/javase/specs/jls/se20/html/index.html)

```java
// 主函数
public static void main(String[] args) {}
```

## 包

一个类总是属于某个包，`包名.类名` 用来表示一个类

没有声明包，则属于默认包

### 类查找顺序

- 查找当前package是否存在这个class，无需导入
- 查找import的包是否包含这个class
- 查找java.lang包是否包含这个class，无需导入
