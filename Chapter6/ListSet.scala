import scala.collection.immutable.ListSet

val listSet1: ListSet[String] = ListSet("Plain Donut", "Strawberry Donut", "Chocolate Donut")

println(listSet1("Plain Donut"))

val listSet2: ListSet[String] = listSet1 + "Vanilla Donut"

println(listSet2)

val listSet3: ListSet[String] = listSet1 ++ ListSet("Glazed Donut")

println(listSet3)

val listSet4: ListSet[String] = listSet3 - "Glazed Donut"
println(listSet4)

// initialize an empty ListSet

val emptyListSet: ListSet[String] = ListSet.empty[String]
println(emptyListSet)