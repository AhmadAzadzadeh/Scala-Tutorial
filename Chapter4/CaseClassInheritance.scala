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

// Avoid having a case class extend other case classes.
// Instead, encapsulate common behaviour in an abstract class