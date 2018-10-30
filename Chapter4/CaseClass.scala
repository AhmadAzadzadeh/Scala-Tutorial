// A case class is similar to any other classes except that it also creates the Companion Object.
// The case class will automatically create the Companion Object.
case class Donut(name: String, price: Double, productCode: Option[Long] = None)

val vanillaDonut: Donut = Donut("Vanilla Donut", 1.50)
val glazedDonut: Donut = Donut("Glazed Donut", 2.0)

println(s"Vanilla Donut = $vanillaDonut")
println(s"Glazed Donut = $glazedDonut")

println(s"Vanilla Donut name field = ${vanillaDonut.name}")
println(s"Vanilla Donut price field = ${vanillaDonut.price}")
println(s"Vanilla Donut productCode = ${vanillaDonut.productCode}")

// Scala favours the use of immutability. As a results, fields defined on case class are immutable
// by default and as such you cannot modify them.

val shoppingCart: Map[Donut, Int] = Map(vanillaDonut -> 4, glazedDonut -> 3)

println(s"Quantity of vanilla donuts in shopping cart = ${shoppingCart(vanillaDonut)}")


val chocolateVanillaDonut: Donut = vanillaDonut.copy("Chocolate And Vanilla Donut", 5.0)
println(s"Chocolate And Vanilla Donut = $chocolateVanillaDonut")