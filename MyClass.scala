```scala
class MyClass(val x: Int) {
  def this() { this(0) }
}
```
This code compiles and runs without errors, but it's an example of how a seemingly straightforward use of auxiliary constructors in Scala might introduce subtle issues if not handled carefully. The issue here becomes apparent when you try to extend `MyClass`.  If a subclass tries to directly access or modify the `x` variable, there may be unexpected behavior.  The primary constructor is used for proper initialization. Auxiliary constructors often lead to less maintainable and less predictable behavior.