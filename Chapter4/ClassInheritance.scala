
abstract class Donut(name: String) {
  def printName: Unit
}

class VanillaDonut(name: String) extends Donut(name) {
  override def printName: Unit = println(name)
}

object VanillaDonut {
  def apply(name: String): Donut = {
    new VanillaDonut(name)
  }
}


class GlazedDonut(name: String) extends Donut(name) {
  override def printName: Unit = println(name)
}

object GlazedDonut {
  def apply(name: String): Donut = new GlazedDonut(name)
}

val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")

vanillaDonut.printName

val glazedDonut: Donut = GlazedDonut("Glazed Donut")

glazedDonut.printName

// Since VanillaDonut and GlazedDonut are sub-classes of the base class Donut,
// they both have access to the printName method.