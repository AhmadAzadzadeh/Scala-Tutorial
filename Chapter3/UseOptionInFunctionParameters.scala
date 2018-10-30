def calculateDonutCost(donutName: String, quantity: Int, couponCode: Option[String] = None): Double = {
    println(s"calculating cost for $donutName, quantity = $quantity")

    couponCode match {
        case Some(coupon) => 
        val discount = 0.1
        val totalCost = 2.50 * quantity * (1 - discount)
        totalCost
        case _ => 2.50 * quantity
    }
}

println(s"""Total cost = ${calculateDonutCost("Glazed Donut", 5, Some("5"))}""")