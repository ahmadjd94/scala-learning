import Student._

object Main extends App {
  val obj1 = new Student()
  println(obj1.isAlive(5))
  println(obj1.computeAge)

  println("multi1 can use monocle dependency")

}
