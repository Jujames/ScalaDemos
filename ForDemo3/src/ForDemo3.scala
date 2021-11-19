

object ForDemo3 {
  def main(args: Array[String]) {
    val intSet: Set[Int] = Set(5, 3, 1, 6, 56, 9, 0)
    val myStringList = List("This is a string", "Another string")

    // non-zero elements
    val a = for {
      r <- intSet
      if (r != 0)
    } yield r

    // toUpperCase
    val b = for {
      r <- myStringList
    } yield r.toUpperCase

    val c = myStringList.map(_.toUpperCase)
    val d = myStringList.map(_.toLowerCase)
    println(a)
    println(b)
    println(c)
    println(d)
  }
}