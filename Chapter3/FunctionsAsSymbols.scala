class DonutCostCalculator {
  val totalCost: Int = 100

//  def minusDiscount(discount: Double): Double = totalCost - discount
  def - (discount: Double): Double = {
    totalCost - discount
  }
}

val donutCostCalculator = new DonutCostCalculator()

//println(s"Calling minusDiscount() function = ${donutCostCalculator.minusDiscount(10.5)}")
println(s"Calling function - = ${donutCostCalculator.-(10.5)}")
println(s"Calling function - with operator style notation = ${donutCostCalculator - 10.5}")
