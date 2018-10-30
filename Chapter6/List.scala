val list1: List[String] = List("Plain Donut", "Strawberry Donut", "Chocolate Donut")
println(list1)

println(list1(0))
println(list1(1))
println(list1(2))

// append elements
val list2: List[String] = list1 :+ "Vanilla Donut"

println(list2)

val list3: List[String] = "Banana Donut" +: list1

println(list3)

val list4: List[Any] = list2 :: list3

println(list4)

// Using :: returns a new List(List(...), elements from the second list)

// initialize an empty List
val emptyList: List[String] = List.empty[String]
println(emptyList)
