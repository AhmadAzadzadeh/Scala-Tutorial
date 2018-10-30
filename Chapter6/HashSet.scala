import scala.collection.immutable.HashSet

val hashSet1: HashSet[String] = HashSet("Plain Donut", "Strawberry Donut", "Chocolate Donut")
println(hashSet1)

println(hashSet1("Chocolate Donut"))
println(hashSet1("Glazed Donut"))

val emptyHashSet: HashSet[String] = HashSet.empty[String]
println(emptyHashSet)