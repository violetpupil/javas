# lang

```kotlin
// 主函数
fun main() {
    println("Hello, world!")
}
```

```kotlin
// 在字符串中使用customers
val customers = 10
println("There are $customers customers")
println("There are ${customers + 1} customers")
```

## basic types

- Byte, Short, Int, Long
- UByte, UShort, UInt, ULong
- Float, Double
- Boolean
- Char
- String

## 声明

```kotlin
// val声明只读变量，var声明读写变量
val e: String = "hello"
val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
val accountBalances: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
// 类型推断
val customers = 10
// 先声明后初始化
val d: Int
d = 3
```