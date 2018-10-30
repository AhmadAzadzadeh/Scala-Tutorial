import scala.collection.immutable.TreeMap

val treeMap1: TreeMap[String, String] = TreeMap(("PD", "Plain Donut"), ("SD", "Strawberry Donut"))
println(treeMap1)

val treeMap2: TreeMap[String, String] = TreeMap("VD" -> "Vanilla Donut", "GD" -> "Glazed Donut")
println(treeMap2)

println(treeMap2("GD"))

val treeMap3: TreeMap[String, String] = TreeMap.empty[String, String]
println(treeMap3)

