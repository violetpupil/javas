# [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/)

```kotlin
// 读写列表 -> 只读列表
val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
val shapesLocked: List<String> = shapes
// check that an item is in a list
val readOnlyShapes = listOf("triangle", "square", "circle")
println("circle" in readOnlyShapes)
```

## Extension Functions

count() list长度

first() Returns the first element.

last() Returns the last element.
