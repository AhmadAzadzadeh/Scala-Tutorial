trait DonutShoppingCartDao[A] {

  def add(donut: A): Long

  def update(donut: A): Boolean

  def search(donut: A): A

  def delete(donut: A): Boolean

}

trait DonutInventoryService[A] {

  def checkStockQuantity(donut: A): Int

}

class DonutShoppingCart[A] extends DonutShoppingCartDao[A] with DonutInventoryService[A] {
  override def add(donut: A): Long = {
    println(s"DonutShoppingCart-> add method -> donut: $donut")
    1
  }

  override def update(donut: A): Boolean = {
    println(s"DonutShoppingCart-> update method -> donut: $donut")
    true
  }

  override def search(donut: A): A = {
    println(s"DonutShoppingCart-> search method -> donut: $donut")
    donut
  }

  override def delete(donut: A): Boolean = {
    println(s"DonutShoppingCart-> delete method -> donut: $donut")
    true
  }

  override def checkStockQuantity(donut: A): Int = {
    println(s"DonutShoppingCart-> checkStockQuantity method -> donut: $donut")
    10
  }
}

val donutShoppingCart: DonutShoppingCart[String] = new DonutShoppingCart[String]()
donutShoppingCart.add("Vanilla Donut")
donutShoppingCart.update("Vanilla Donut")
donutShoppingCart.search("Vanilla Donut")
donutShoppingCart.delete("Vanilla Donut")
donutShoppingCart.checkStockQuantity("Vanilla Donut")