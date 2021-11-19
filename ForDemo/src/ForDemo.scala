

object ForDemo {
  def main(args: Array[String]) {

    case class BirthYear(name: String, year: Int)

    val births: List[BirthYear] = List(
      BirthYear(
        "Steve",
        1978),
        
      BirthYear(
        "Virgil",
        1938),
        
      BirthYear(
        "Edward",
        2009),
        
      BirthYear(
        "Jane",
        2001))
        
    val a = for {
      r <- births
      n = r.year
      if (n >= 1978)
    } yield r
    println(a)
  }
}