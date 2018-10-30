
package object four {
  case class Donut(name: String, price: Double, productCode: Option[Long] = None)

  implicit class AugmentedDonut(donut: Donut) {
    def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(12345)}"
  }

  type DateTime = org.joda.time.DateTime
}

object PackageObject_Tutorial extends App {
  val vanillaDonut: Donut = Donut("Vanilla", 1.50)
  println(s"Vanilla donut name = ${vanillaDonut.name}")
  println(s"Vanilla donut price = ${vanillaDonut.price}")
  println(s"Vanilla donut productCode = ${vanillaDonut.productCode}")
  println(s"Vanilla donut uuid = ${vanillaDonut.uuid}")
}
