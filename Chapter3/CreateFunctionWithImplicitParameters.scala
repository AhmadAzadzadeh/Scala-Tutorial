// def totalCost(donutType: String, quantity: Int)(implicit discount: Double): Unit = {
//     implicit val discount: Double = 0.1
//     println(s"All customer will receive a ${discount * 100}% discount")
// }

// println(s"""Total cost with discount of 5 Glazed Donuts = ${totalCost("Glazed Donut", 5)}""")

def totalCost2(donutType: String, quantity: Int)(implicit discount: Double, storeName: String): Unit = {
    println(s"""$donutType, $quantity, $discount, $storeName""")
}

totalCost2("Glazed Donut", 5)(0.1, "New York")