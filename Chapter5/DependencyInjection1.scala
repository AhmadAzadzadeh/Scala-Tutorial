
trait DonutDatabase[A] {
  def addOrUpdate(donut: A): Long

  def query(donut: A): A

  def delete(donut: A): Boolean
}

class CassandraDonutStore[A] extends DonutDatabase[A] {
  override def addOrUpdate(donut: A): Long = {
    println(s"CassandraDonutDatabase -> addOrUpdate method -> donut: $donut")
    1
  }
  override def query(donut: A): A = {
    println(s"CassandraDonutDatabase -> query method -> donut: $donut")
    donut
  }

  override def delete(donut: A): Boolean = {
    println(s"CassandraDonutDatabase -> delete method -> donut: $donut")
    true
  }
}

trait DonutShoppingCartDao[A] {
  val donutDatabase: DonutDatabase[A] // dependency injection

  def add(donut: A): Long = {
    println(s"DonutShoppingCartDao -> add method -> donut: $donut")
    donutDatabase.addOrUpdate(donut)
  }

  def update(donut: A): Boolean = {
    println(s"DonutShoppingCartDao -> update method -> donut: $donut")
    donutDatabase.addOrUpdate(donut)
    true
  }

  def search(donut: A): A = {
    println(s"DonutShoppingCartDao -> search method -> donut: $donut")
    donutDatabase.query(donut)
  }

  def delete(donut: A): Boolean = {
    println(s"DonutShoppingCartDao -> delete method -> donut: $donut")
    donutDatabase.delete(donut)
  }

}

trait DonutInventoryService[A] {
  val donutDatabase: DonutDatabase[A] // dependency injection
  def checkStockQuantity(donut: A): Int = {
    println(s"DonutInventoryService -> checkStockInventory method -> donut: $donut")
    donutDatabase.query(donut)
    1
  }
}


trait DonutShoppingCartServices[A] extends DonutShoppingCartDao[A] with DonutInventoryService[A] {
  override val donutDatabase: DonutDatabase[A] = new CassandraDonutStore[A]()
}

class DonutShoppingCart[A] extends DonutShoppingCartServices[A] {

}


val donutShoppingCart: DonutShoppingCart[String] = new DonutShoppingCart[String]()
donutShoppingCart.add("Vanilla Donut")
donutShoppingCart.update("Vanilla Donut")
donutShoppingCart.search("Vanilla Donut")
donutShoppingCart.delete("Vanilla Donut")
donutShoppingCart.checkStockQuantity("Vanilla Donut")