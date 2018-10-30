
class Donut(name: String, productCode: Option[Long] = None) {
  def print: Unit = println(s"Donut name = $name, productCode = ${productCode.getOrElse(0)}, uuid = ${Donut.uuid}")
}


// let's define our companion object
object Donut {
  private val uuid = 1

  def apply(name: String, productCode: Option[Long]): Donut = {
    new Donut(name, productCode)
  }

  def apply(name: String): Donut = {
    new Donut(name)
  }
}

val glazedDonut = Donut("Glazed Donut", Some(1111))
val vanillaDonut = Donut("Vanilla Donut")

glazedDonut.print
vanillaDonut.print