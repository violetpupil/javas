# [lombok](https://projectlombok.org/)

[@Getter&@Setter](https://projectlombok.org/features/GetterSetter) 字段添加getter和setter

[@Data](https://projectlombok.org/features/Data) 类所有字段添加getter，非final字段添加setter

## [constructor](https://projectlombok.org/features/constructor)

```java
@Getter
@AllArgsConstructor
enum Color {
    RED(0),
    YELLOW(1),
    BLUE(2);

    private final int value;
}
```
