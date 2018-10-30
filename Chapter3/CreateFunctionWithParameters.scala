// def calculateDonutCost(donutName: String, quantity: Int): Double = {
//     println(s"Calculating cost for $donutName, quantity = $quantity")
//     2.50 * quantity
// }

// val totalCost: Double = calculateDonutCost("Glazed Donut", 5)
// println(s"Total cost of donuts = $totalCost")


def calculateDonutCost(donutName: String, quantity: Int, couponCode: String = "NO CODE"): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity, couponCode = $couponCode")
    2.50 * quantity
}

val totalCostWithDiscount: Double = calculateDonutCost("Glazed Donut", 4, "COUPON_12345")
val totalCostWithoutDiscount: Double = calculateDonutCost("Glazed Donut", 4)
