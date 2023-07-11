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

## Loops

```kotlin
for (number in 1..5) { 
    print(number)
}
```

```kotlin
var cakesEaten = 0
var cakesBaked = 0
// 先判断再执行
while (cakesEaten < 3) {
    println("Eat a cake")
    cakesEaten++
}
// 先执行再判断
do {
    println("Bake a cake")
    cakesBaked++
} while (cakesBaked < cakesEaten)
```
