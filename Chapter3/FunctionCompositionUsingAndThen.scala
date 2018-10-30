
val totalCost: Double = 10

val applyDiscountValFunction: Double => Double = (amount) => {
  println("Apply discount function")
  val discount: Double = 2
  amount - discount
}

println(s"Total cost of 5 donuts with discount = ${applyDiscountValFunction(totalCost)}")

val applyTaxValFunction: Double => Double = (amount) => {
  println("Apply tax function")
  val tax: Double = 1
  amount + tax
}

// Calling andThen will take the result from the first function and pass it as input parameter to the second function.

println(s"Total cost of 5 donuts = ${(applyDiscountValFunction andThen applyTaxValFunction)(totalCost)}")