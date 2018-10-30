def totalCostWithDiscountFunctionParameter(donutType: String)(quantity: Int)(f: Double => Double): Double = {
  println(s"Calculating total cost for $quantity $donutType")
  val totalCost: Double = 2.50 * quantity
  f(totalCost)
}

//val totalCostOf5Donuts = totalCostWithDiscountFunctionParameter("Glazed Donut")(5){totalCost =>
//  val discount = 2
//  totalCost - discount
//}
//
//println(s"Total cost of 5 Glazed Donut with anonymous discount function = $totalCostOf5Donuts")

// better solution
def applyDiscount(totalCost: Double): Double = {
  val discount: Int = 2
  totalCost - discount
}

val totalCostOf5Donuts = totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscount(_))
println(s"Total cost of 5 Glazed Donut with anonymous discount function = $totalCostOf5Donuts")