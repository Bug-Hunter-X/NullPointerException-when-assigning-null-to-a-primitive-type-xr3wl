```scala
object Main extends App {
  val x: Option[Int] = None
  val y: Option[Int] = Some(5)

  println(x)
  println(y)

  val z = x.getOrElse(0) // Default value if x is None
  println(z)

  val w = y.getOrElse(0) //Returns 5 since y is Some(5)
  println(w) 
}
```