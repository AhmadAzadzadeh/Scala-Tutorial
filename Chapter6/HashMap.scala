import scala.collection.immutable.HashMap

val hashMap1: HashMap[String, String] = HashMap(("PD", "Plain Donut"), ("CD", "Chocolate Donut"), ("SD", "Strawberry Donut"))
println(hashMap1)

val hashMap2: HashMap[String, String] = HashMap("VD" -> "Vanilla Donut", "GD" -> "Glazed Donut")

println(hashMap2)

println(hashMap2("VD"))

val emptyHashMap: HashMap[String, String] = HashMap.empty[String, String]
println(emptyHashMap)