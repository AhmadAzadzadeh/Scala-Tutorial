
abstract class Donut(name: String) {
  def printName: Unit
}

case class VanillaDonut(name: String) extends Donut(name) {
  override def printName: Unit = println(name)
}


case class GlazedDonut(name: String) extends Donut(name) {
  override def printName: Unit = println(name)
}

val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")

val glazedDonut: Donut = GlazedDonut("Glazed Donut")


vanillaDonut.printName

glazedDonut.printName


class ShoppingCart[D <: Donut ](donuts: Seq[D]) {
  def printCartItems: Unit = donuts.foreach(_.printName)
}

// With the notation [D <: Donut], we are restricting only Donut types to be
// passed-through to the ShoppingCart class.

val shoppingCart: ShoppingCart[Donut] = new ShoppingCart[Donut](Seq(glazedDonut, vanillaDonut))

shoppingCart.printCartItems






