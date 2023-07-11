# function

```kotlin
// 默认参数值
fun sum(x: Int, y: Int = 1): Int {
    return x + y
}
// single-expression functions
fun sum(x: Int, y: Int) = x + y
// Lambda expressions 没有参数可以省略
println({ string: String -> string.uppercase() }("hello"))
// 函数类型 没有参数使用 () ->
val upperCaseString: (String) -> String = { string -> string.uppercase() }
```

If your function doesn't return a useful value then its return type is Unit.

```kotlin
// 调用时可以指定参数名
sum(y = 1, x = 1)
// Lambda expressions作为参数
println(listOf(1, 2, 3).fold(0, { x, item -> x + item }))
// Trailing lambdas
val numbers = listOf(1, -2, 3, -4, 5, -6)
val positives = numbers.filter { x -> x > 0 }
println(listOf(1, 2, 3).fold(0) { x, item -> x + item })
```
