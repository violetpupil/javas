# Control flow

## Conditional expressions

```kotlin
// if语句
if () {} else {}
// if表达式
if (a > b) a else b
```

```kotlin
val obj = "Hello"
// when语句
when (obj) {
    "1" -> println("One")
    "Hello" -> println("Greeting")
    // Default statement
    else -> println("Unknown")     
}
// when表达式
val result = when (obj) {
    "1" -> "One"
    "Hello" -> "Greeting"
    else -> "Unknown"
}
// when条件判断
val description = when {
    temp < 0 -> "very cold"
    temp < 10 -> "a bit cold"
    temp < 20 -> "warm"
    else -> "hot"             
}
```
