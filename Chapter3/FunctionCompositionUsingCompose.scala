
val totalCost: Double = 10

val applyDiscountValFunction = (amount: Double) => {
  println("Apply discount function")
  val discount: Double = 2
  amount - discount
}

println(s"Total cost of 5 donuts with discount = ${applyDiscountValFunction(totalCost)}")

val applyTaxValFunction = (amount: Double) => {
  println("Apply Tax function")
  val tax = 1
  amount + tax
}

println(s"Total cost of 5 donuts = ${(applyDiscountValFunction compose applyTaxValFunction)(totalCost)}")

// Ordering using andThen: f(x) andThen g(x) = g(f(x))
// Ordering using compose: f(x) compose g(x) = f(g(x))