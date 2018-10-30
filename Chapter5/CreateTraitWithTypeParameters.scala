trait DonutShoppingCartDao[A] {

  def add(donut: A): Long

  def update(donut: A): Boolean

  def search(donut: A): String

  def delete(donut: A): Boolean

}
// This is our type class
class DonutShoppingCart[A] extends DonutShoppingCartDao[A] {
  override def add(donut: A): Long = {
    println(s"donut: $donut")
    1
  }

  override def update(donut: A): Boolean = {
    println(s"donut: $donut")
    true
  }

  override def search(donut: A): String = {
    println(s"donut: $donut")
    s"$donut"
  }

  override def delete(donut: A): Boolean = {
    println(s"donut: $donut")
    true
  }
}


val donutShoppingCart1: DonutShoppingCart[String] = new DonutShoppingCart[String]()

donutShoppingCart1.add("Glazed Donut")
donutShoppingCart1.update("Glazed Donut")
donutShoppingCart1.search("Glazed Donut")
donutShoppingCart1.delete("Glazed Donut")


val donutShoppingCart2: DonutShoppingCartDao[String] = new DonutShoppingCart[String]()


donutShoppingCart2.add("Glazed Donut")
donutShoppingCart2.update("Glazed Donut")
donutShoppingCart2.search("Glazed Donut")
donutShoppingCart2.delete("Glazed Donut")
