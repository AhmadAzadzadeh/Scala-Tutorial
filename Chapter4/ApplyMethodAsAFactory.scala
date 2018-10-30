
class Donut(name: String, productCode: Option[Long] = None) {
  def print: Unit = println(s"Donut name = $name, productCode = $productCode")
}

class GlazedDonut(name: String) extends Donut(name)

class VanillaDonut(name: String) extends Donut(name)

// define companion object
object Donut {
//  this apply method is a factory
  def apply(name: String): Donut = {
    name match {
      case "Glazed Donut" => new GlazedDonut(name)
      case "Vanilla Donut" => new VanillaDonut(name)
      case _ => new Donut(name)
    }
  }
}

val glazedDonut = Donut("Glazed Donut")
glazedDonut.print

val vanillaDonut = Donut("Vanilla Donut")
vanillaDonut.print