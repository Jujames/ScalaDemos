
// Demo for StartWith,EndsWith,IndexOf

object ForDemo2 {
  def main(args: Array[String]) {

    case class StreetAddress(name: String, address: String)

    val streetAddresses: List[StreetAddress] = List(
      StreetAddress(
        "Steve",
        "PO Box 1144"),
      StreetAddress(
        "Virgil",
        "123 22nd Street"),
      StreetAddress(
        "Edward",
        "PO Box 981"),
      StreetAddress(
        "Jane",
        "112 8th Avenue"))

    // PO Boxes
    val a = for {
      r <- streetAddresses
      n = r.address
      if (n startsWith "PO Box")
    } yield r

    //8th
    val b = for {
      r <- streetAddresses
      n = r.address
      if ((n indexOf "8th") >= 0)
    } yield r

    //Street
    val c = for {
      r <- streetAddresses
      n = r.address
      if (n endsWith "Street")
    } yield r
    println("PO Boxes: ")
    println(a)
    println("8th: ")
    println(b)
    println("Ends with 'Street': ")
    println(c)

  }
}




