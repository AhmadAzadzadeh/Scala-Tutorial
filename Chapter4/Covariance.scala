
abstract class Donut(name: String) {
  def printName: Unit
}

case class VanillaDonut(name: String) extends Donut(name) {
  override def printName: Unit = println(name)
}

case class GlazedDonut(name: String) extends Donut(name) {
  override def printName: Unit = println(name)
}

val vanillaDonut: VanillaDonut = VanillaDonut("Vanilla Donut")

val glazedDonut: Donut = GlazedDonut("Glazed Donut")

vanillaDonut.printName

glazedDonut.printName


class ShoppingCart[D <: Donut](donuts: Seq[D]) {
  def printCartItems: Unit = donuts.foreach(_.printName)
}

val shoppingCart: ShoppingCart[Donut] = new ShoppingCart[Donut](Seq[Donut](vanillaDonut, glazedDonut))

shoppingCart.printCartItems

// How to enable covariance on ShoppingCart
class ShoppingCart2[+D <: Donut](donuts: Seq[D]) {
  def printCartItems: Unit = donuts.foreach(_.printName)
}

val shoppingCart2: ShoppingCart2[Donut] = new ShoppingCart2[VanillaDonut](Seq(vanillaDonut))

shoppingCart2.printCartItems
// you can now create instances of ShoppingCart of type Donut or sub-types of Donuts such as VanillaDonut.
