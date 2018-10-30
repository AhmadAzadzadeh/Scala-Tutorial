var numberOfDonutsToBake: Int = 10

while (numberOfDonutsToBake > 0) {
    println(s"Remaining donuts to be baked = $numberOfDonutsToBake")
    numberOfDonutsToBake -= 1
}

var numberOfDonutsToBaked: Int = 0

do {
    numberOfDonutsToBaked += 1
    println(s"Number of donuts baked = $numberOfDonutsToBaked")
}while(numberOfDonutsToBaked < 5)