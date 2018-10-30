//Singleton Object which you can use to store global fields and utility functions or methods.
object DonutShoppingCartCalculator {

  val discount: Double = 0.01

  def calculateTotalCost(donuts: List[String]): Double = {
    // calculate the cost of donuts
    return 1
  }

}

println(s"Global discount = ${DonutShoppingCartCalculator.discount}")

println(s"Call to calculateTotalCost function = ${DonutShoppingCartCalculator.calculateTotalCost(List())}")