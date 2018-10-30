class DonutString(s: String) {
    def isFavoriteDonut: Boolean = s == "Glazed Donut"
}

object DonutConverstions {
    implicit def stringToDonutString(s: String) = new DonutString(s)
}

import DonutConverstions._
val glazedDonut = "Glazed Donut"
val vanillaDonut = "Vanilla Donut"

println(s"Is Glazed Donut my favorite Donut = ${glazedDonut.isFavoriteDonut}")
println(s"Is Vanilla Donut my favorite Donut = ${vanillaDonut.isFavoriteDonut}")