import scala.util.Random

val listOrders = List(("Glazed Donut", 5, 2.50), ("Vanilla", 10, 3.50))

def placeOrder(orders: List[(String, Int, Double)])(exchangeRate: Double): Double = {
  var totalCost: Double = 0.0
  orders.foreach { order =>
    val costOfItem = order._2 * order._3 * exchangeRate
    println(s"Cost of ${order._2} ${order._1} = $costOfItem")
    totalCost += costOfItem
  }
  totalCost
}

println(s"Total cost of order = ${placeOrder(listOrders)(0.5)}")


def placeOrderWithByNameParameter(orders: List[(String, Int, Double)])(exchangeRate: => Double): Double = {
  var totalCost = 0.0
  orders.foreach { order =>
    val costOfItem = order._2 * order._3 * exchangeRate
    println(s"Cost of ${order._2} ${order._1} = $costOfItem")
    totalCost += costOfItem
  }
  totalCost
}

val randomExchangeRate = new Random(10)
def usdToGbp: Double = {
  val rate = randomExchangeRate.nextDouble()
  println(s"Fetching USD to GBP exchange rate = $rate")
  rate
}

println(s"Total cost of order = ${placeOrderWithByNameParameter(listOrders)(usdToGbp)}")