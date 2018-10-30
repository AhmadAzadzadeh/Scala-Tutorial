
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
vanillaDonut.printName

val glazedDonut: Donut = GlazedDonut("Glazed Donut")
glazedDonut.printName


class ShoppingCart[D <: Donut](donuts: Seq[D]) {

  def printCartItems: Unit = donuts.foreach(_.printName)

}

val shoppingCart: ShoppingCart[Donut] = new ShoppingCart(Seq[Donut](vanillaDonut, glazedDonut))
shoppingCart.printCartItems



class ShoppingCart2[-D <: Donut](donuts: Seq[D]) {

  def printCartItems: Unit = donuts.foreach(_.printName)

}

val shoppingCart2: ShoppingCart2[VanillaDonut] = new ShoppingCart2[Donut](Seq(glazedDonut))
shoppingCart2.printCartItems

// in other words, you can now have a ShoppingCart of type Vanilla Donut ShoppingCart[VanillaDonut]
// reference ShoppingCart of type Donut ShoppingCart2[Donut]