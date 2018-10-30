for (numberOfDonuts <- 1 to 5) {
    println(s"Number of donuts to buy = $numberOfDonuts")
}

for (numberOfPeople <- 1 until 5) {
    println(s"Number of people is = $numberOfPeople")
}

val donutIngredients = List("flour", "sugar", "egg yolks", "syrup", "flavouring")
for (ingredient <- donutIngredients if ingredient == "sugar") {
    println(s"Found sweeting ingredient = $ingredient")
}

val sweeteningIngredients = for {
    ingredient <- donutIngredients
    if (ingredient == "sugar" || ingredient == "syrup")
} yield ingredient

println(s"Sweetening ingredients = $sweeteningIngredients")


val twoDimensionalArray = Array.ofDim[String](2, 2)

twoDimensionalArray(0)(0) = "flour"
twoDimensionalArray(0)(1) = "sugar"
twoDimensionalArray(1)(0) = "egg"
twoDimensionalArray(1)(1) = "syrup"

for {
    x <- 0 until 2
    y <- 0 until 2
} println(s"Donut ingredient at index ${(x, y)} = ${twoDimensionalArray(x)(y)}")