println("Step1: using string interpolation to print a variable")
val favoriteDonut: String = "Glazed Donut"

println(s"My favorite donut = $favoriteDonut")

case class Donut(name: String, tasteLevel: String)

val favoriteDonut2: Donut = Donut("Glazed Donut", "very tasty")

println(s"My favorite donut name = ${favoriteDonut2.name}, tasetLevel = ${favoriteDonut2.tasteLevel}")
