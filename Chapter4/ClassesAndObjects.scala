class Donut(name: String, productCode: Long) {
  def print: Unit = println(s"Donut name = $name, productCode = $productCode")
}

val glazedDonut: Donut = new Donut("Glazed Donut", 1111)
val vanillaDonut: Donut = new Donut("Vanilla Donut", 2222)

glazedDonut.print
vanillaDonut.print
