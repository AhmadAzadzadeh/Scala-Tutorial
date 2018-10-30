
class DonutInventoryService[T] {
  def checkStock(donut: T): Boolean = {
    println("DonutInventoryService->checkStock")
    true
  }
}

class DonutPricingService[T] {
  def calculatePrice(donut: T): Double = {
    println("DonutPricingService->calculatePrice")
    2.50
  }
}

class DonutOrderService[T] {
  def createOrder(donut: T, quantity: Int, price: Double): Int = {
    println(s"Saving donut order to database: donut = $donut, quantity = $quantity, price = $price")
    100 // the id of the booked order
  }
}

class DonutShoppingCartService[T](donutInventoryService: DonutInventoryService[T], donutPricingService: DonutPricingService[T], donutOrderService: DonutOrderService[T]) {
  def bookOrder(donut: T, quantity: Int): Int = {
    donutInventoryService.checkStock(donut) match {
      case true =>
        val price = donutPricingService.calculatePrice(donut)
        donutOrderService.createOrder(donut, quantity, price) // the id of the booked order
      case false =>
        println(s"Sorry donut $donut is out of stock!")
        -100 // return some error code to identify out of stock
    }
  }
}


trait DonutStoreServices {
  val donutInventoryService = new DonutInventoryService[String]
  val donutPricingService = new DonutPricingService[String]
  val donutOrderService = new DonutOrderService[String]
  val donutShoppingCartService = new DonutShoppingCartService(donutInventoryService, donutPricingService, donutOrderService)
}

trait DonutStoreAppController {
  this: DonutStoreServices =>

  def bookOrder(donut: String, quantity: Int): Int = {
    println("DonutStoreAppController->bookOrder")
    donutShoppingCartService.bookOrder(donut, quantity)
  }
}

object DonutStoreApp extends DonutStoreAppController with DonutStoreServices

DonutStoreApp.bookOrder("Vanilla Donut", 10)


trait MockedDonutStoreServices extends DonutStoreServices {
  override val donutInventoryService: DonutInventoryService[String] = ???
  override val donutPricingService: DonutPricingService[String] = ???
  override val donutOrderService: DonutOrderService[String] = ???
  override val donutShoppingCartService: DonutShoppingCartService[String] = new DonutShoppingCartService[String](
    donutInventoryService, donutPricingService, donutOrderService)
}

object MockedDonutStoreApp extends DonutStoreAppController with MockedDonutStoreServices