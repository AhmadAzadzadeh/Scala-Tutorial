
case class Donut(name: String, price: Double, productCode: Option[Long] = None)

val vanillaDonut = Donut("Vanilla", 1.50)
println(s"Vanilla donut name = ${vanillaDonut.name}")
println(s"Vanilla donut price = ${vanillaDonut.price}")
println(s"Vanilla donut productCode = ${vanillaDonut.productCode}")

object DonutImplicits {
  implicit class AugmentedDonut(donut: Donut) {
  // uuid is our extension method
    def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(12345)}"
  }
}

// It's a good practice to encapsulate Implicit Classes into an object which can later be injected or referenced.

import DonutImplicits._
println(s"Vanilla donut uuid = ${vanillaDonut.uuid}")

// While we've shown how to wrap Implicit Classes inside an object, it is also common to encapsulate Implicit Classes inside Package Object.