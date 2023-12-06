# class

没有 `public` 修饰的类，只能当前包使用

一个 java 文件只能有一个 public 类，类名与文件名相同，但可以有多个非 public 类

## 属性方法作用域

`public` 可以被其他类访问

`private` 只能当前类内部访问

`protected` 当前类及子类访问

都不加，表示当前包的类可以访问

## JavaBean

```java
// 属性、读方法、写方法不是必须存在
public class Person {
    // 私有属性
    private String name;
    private boolean child;

    // 公开读写方法 getter setter
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    // boolean 读方法
    public boolean isChild() { return this.child; }
    public void setChild(boolean child) { this.child = child; }
}
```

通过IDE，可以快速生成getter和setter
