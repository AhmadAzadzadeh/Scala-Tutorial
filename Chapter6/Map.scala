
val map1: Map[String, String] = Map(("PD", "Plain Donut"), ("SD", "Strawberry Donut"), ("CD", "Chocolate Donut"))
println(map1)

val map2: Map[String, String] = Map("VD" -> "Vanilla Donut", "GD" -> "Glazed Donut")
println(map2)

println(map2("VD"))
println(map2("GD"))

val map3: Map[String, String] = map1 + ("KD" -> "Krispy Kreme Donut")
println(map3)

val map4: Map[String, String] = map1 ++ map2
println(map4)

val map5: Map[String, String] = map4 - ("CD")
println(map5)

val emptyMap: Map[String, String] = Map.empty[String, String]
println(emptyMap)