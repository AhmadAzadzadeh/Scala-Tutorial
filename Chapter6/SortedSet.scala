import scala.collection.immutable.SortedSet

val sortedSet1: SortedSet[String] = SortedSet("Plain Donut", "Strawberry Donut", "Chocolate Donut")
println(sortedSet1)
println(sortedSet1("Plain Donut"))

val emptySet: SortedSet[String] = SortedSet.empty[String]
println(emptySet)