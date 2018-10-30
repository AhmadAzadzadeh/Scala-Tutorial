trait DonutShoppingCartDao {

  def add(donutName: String): Long

  def update(donutName: String): Boolean

  def search(donutName: String): String

  def delete(donutName: String): Boolean

}

class DonutShoppingCart extends DonutShoppingCartDao {
  override def add(donutName: String): Long = {
    println(s"DonutShoppingCart -> add method -> donutName: $donutName")
    1
  }

  override def update(donutName: String): Boolean = {
    println(s"DonutShoppingCart -> update method -> donutName: $donutName")
    true
  }

  override def search(donutName: String): String = {
    println(s"DonutShoppingCart -> search method -> donutName: $donutName")
    donutName
  }

  override def delete(donutName: String): Boolean = {
    println(s"DonutShoppingCart -> delete method -> donutName: $donutName")
    true
  }

}

val donutShoppingCart1: DonutShoppingCart = new DonutShoppingCart()

donutShoppingCart1.add("Vanilla Donut")
donutShoppingCart1.update("Vanilla Donut")
donutShoppingCart1.search("Vanilla Donut")
donutShoppingCart1.delete("Vanilla Donut")


//  Create an instance of DonutShoppingCart and assign its type to the trait DonutShoppingCartDao

val donutShoppingCart2: DonutShoppingCartDao = new DonutShoppingCart()

donutShoppingCart2.add("Glazed Donut")
donutShoppingCart2.update("Glazed Donut")
donutShoppingCart2.search("Glazed Donut")
donutShoppingCart2.delete("Glazed Donut")







