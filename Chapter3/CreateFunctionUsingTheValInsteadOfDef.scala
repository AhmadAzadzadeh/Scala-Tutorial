
def totalCostWithDiscountFunctionParameter(donutType: String)(quantity: Int)(f: Double => Double): Double = {
  val totalCost = 2.50 * quantity
  f(totalCost)
}

def applyDiscount(totalCost: Double): Double = {
  val discount = 2
  totalCost - discount
}

println(s"Total cost of 5 Glazed Donuts with discount def function = ${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscount(_))}")

//val applyDiscountValueFunction = (totalCost: Double) => {
//  val discount = 2
//  totalCost - discount
//}

//println(s"Total cost of 5 Glazed Donuts with discount val function = ${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscountValueFunction)}")

//another form of our function which has an return type
val applyDiscountValueFunction: Double => Double = (totalCost) => {
  val discount = 2
  totalCost - discount
}

println(s"Total cost of 5 Glazed Donuts with discount val function = ${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscountValueFunction)}")
