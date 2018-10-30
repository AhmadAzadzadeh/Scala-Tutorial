case class Donut(name: String, price: Double, productCode: Option[Long] = None)

val vanillaDonut: Donut = Donut("Vanilla", 1.50)

val glazedDonut: Donut = Donut("Glazed", 2.0)

type CartItem[Donut, Int] = Tuple2[Donut, Int]

val cartItem = new CartItem(vanillaDonut, 4)

println(s"cartItem = $cartItem")
println(s"cartItem first value = ${cartItem._1}")
println(s"cartItem second value = ${cartItem._2}")

def calculateTotal(shoppingCartItems: Seq[CartItem[Donut, Int]]): Double = {
  shoppingCartItems.foreach { cartItem =>
    println(s"CartItem donut = ${cartItem._1}, quantity = ${cartItem._2}")
  }
  10
}

// you might as well create another case class instead of using type aliasing of Tuple2.
case class ShoppingCartItem(donut: Donut, quantity: Int)

val shoppingItem: ShoppingCartItem = ShoppingCartItem(Donut("Glazed Donut", 2.50), 10)

println(s"shoppingItem donut = ${shoppingItem.donut}")
println(s"shoppingItem quantity = ${shoppingItem.quantity}")

def calculateTotal2(shoppingCartItems: Seq[ShoppingCartItem]): Double = {
  shoppingCartItems.foreach { shoppingCartItem =>
    println(s"ShoppingCartItem donut = ${shoppingCartItem.donut}, quantity = ${shoppingCartItem.quantity}")
  }
  10
}