```scala
class MyClass(val x: Int) {
  def this() { this(0) }
}

class MySubClass(override val x: Int) extends MyClass(x) { 
    override def toString = s"MySubClass with x: $x"
}

//Usage
val myInstance = new MySubClass(10)
println(myInstance) //prints MySubClass with x: 10

//Or if we want only one constructor to be present. In which case the x variable is only defined by the primary constructor
class MyClass2(val x: Int) {
  //Remove the auxiliary constructor for cleaner and more predictable behavior
}
```