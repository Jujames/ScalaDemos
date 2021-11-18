

object BeanPropertyDemo extends App {
  val c = new Camera("Nikon", "D3")
  /*
    c.setMake("Cannon")
    c.setModel("5D")
  */
    c.make = "Cannon"
    c.model = "5D"
   /*
    println(c.getMake)
    println(c.getModel)
  */
    println(c.make)
    println(c.model)
}