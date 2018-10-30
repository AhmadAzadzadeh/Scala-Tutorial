val numberOfPeople: Int = 20
val donutsPerPeople: Int = 2

val defaultDonutsToBuy = 8

if (numberOfPeople > 10) {
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPeople}")
}else {
    println(s"Number of donuts to buy = $defaultDonutsToBuy")
}