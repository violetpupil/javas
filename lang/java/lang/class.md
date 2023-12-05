# class

## [JavaBean](https://www.liaoxuefeng.com/wiki/1252599548343744/1260474416351680)

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
