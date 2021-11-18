

@deprecated
@SerialVersionUID(1L)
class HeadphoneJack(var size: Double) extends Serializable {
  @inline def jackSize(): String = {
    "Headphone jack size: " + size
  }
}

object AnnotationDemo extends App {
  val jack = new HeadphoneJack(3.5)
  println(jack.jackSize())
  
}