object Donut extends Enumeration {
    type Donut = Value

    val Glazed = Value("Glazed")
    val Strawberry = Value("Strawberry")
    val Plain = Value("Plain")
    val Vanilla = Value("Vanilla")
}

println(s"Vanilla Donut string value = ${Donut.Vanilla}")

println(s"Vanilla Donut's id = ${Donut.Vanilla.id}")

println(s"Donut Types = ${Donut.values}")


Donut.values.foreach {
    value => {
        value match {
            case d if (d == Donut.Strawberry || d == Donut.Glazed) => println(s"Found favorite donut = $d")
            case _ => None
        }
    }
}