

object foldDemo {
  def main(args: Array[String]) {
    
    val numList = List(1,2,3,4,5)
    val fL = numList.foldLeft(0)(_+_) // ((((1+2)+3)+4)+5)
    val f = numList.fold(0)(_+_)
    println(fL)
    println(f)
    println("---------------------")
    
    val letterList = List("a", "b", "c", "d")
    val cfL = letterList.foldLeft("")("(" + _ + _ +")")
    val cfR = letterList.foldRight("")("(" + _ + _ + ")")
    val cf = letterList.fold("")("(" + _ + _ + ")")
    println(cfL)
    println(cfR)
    println(cf)
  }
}