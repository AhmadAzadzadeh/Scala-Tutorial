class Donut(name: String, productCode: Long) {
  def print: Unit = println(s"Donut name = $name, productCode = $productCode")
}

// this is our companion object
object Donut {
  def apply(name: String, productCode: Long): Donut = {
    new Donut(name, productCode)
  }
}

val glazedDonut: Donut = Donut("Glazed Donut", 1111)
val vanillaDonut: Donut = Donut("Vanilla Donut", 2222)

glazedDonut.print
vanillaDonut.print