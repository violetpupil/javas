# Classes

```kotlin
// 两种声明属性方式
class Contact(val id: Int, var email: String)
class Contact(val id: Int, var email: String) {
    val category: String = ""
}
// 创建对象
val contact = Contact(1, "mary@gmail.com")
```

```kotlin
// 声明方法
class Contact(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}
```

```kotlin
// 数据类
data class User(val name: String, val id: Int)
// Automatically uses toString() function so that output is easy to read
println(user)
// 比较
user1 == user2
user1.equals(user2)
// 复制，同时修改属性
println(user.copy())
println(user.copy("Max"))
```
