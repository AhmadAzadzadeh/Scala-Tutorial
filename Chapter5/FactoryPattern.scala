
object Cakes {

  trait Cake {
    def name: String
  }

  class UnknownCake extends Cake {
    override def name: String = "Unknown Cake ... but still delicious!"
  }

  class Cupcake extends Cake {
    override def name: String = "Cupcake"
  }

  class Donut extends Cake {
    override def name: String = "Donut"
  }

}

object CakeFactory {
  import Cakes._
  def apply(cake: String): Cake = {
    cake match {
      case "cupcake" => new Cupcake
      case "donut" => new Donut
      case _ => new UnknownCake
    }
  }
}

println(s"A cupcake = ${CakeFactory("cupcake")}")
println(s"A donut = ${CakeFactory("donut").name}")
println(s"Unknown cake = ${CakeFactory("coconut tart").name}")