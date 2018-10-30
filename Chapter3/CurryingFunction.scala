// totalCost is a curried function
def totalCost(donutType: String)(quantity: Int)(discount: Double): Double = {
  println(s"Calculating total cost for $quantity $donutType with ${discount * 100}% discount")
  val totalCost = 2.50 * quantity
  totalCost - (totalCost * discount)
}

println(s"Total cost = ${totalCost("Glazed Donut")(10)(0.1)}")
// partially applied function
val totalCostForGlazedDonuts = totalCost("Glazed Donut") _

println(s"Total cost for Glazed Donuts ${totalCostForGlazedDonuts(10)(0.2)}")
