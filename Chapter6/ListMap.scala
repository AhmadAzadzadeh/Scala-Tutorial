import scala.collection.immutable.ListMap

val listMap1: ListMap[String, String] = ListMap("PD" -> "Plain Donut", "SD" -> "Strawberry Donut")
println(listMap1)

println(listMap1("PD"))
println(listMap1("SD"))

val listMap2: ListMap[String, String] = listMap1 + ("KD" -> "Krispy Kreme Donut")
println(listMap2)

val listMap3: ListMap[String, String] = listMap1 ++ listMap2
println(listMap3)

val listMap4: ListMap[String, String] = listMap3 - "KD"
println(listMap4)

val emptyListMap: ListMap[String, String] = ListMap.empty[String, String]
println(emptyListMap)