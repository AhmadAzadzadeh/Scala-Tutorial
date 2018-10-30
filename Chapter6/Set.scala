// As per Wikipedia, a Set is a data structure which allows you to store some values but where the values cannot be repeatable.

val set1: Set[String] = Set("Plain Donut", "Strawberry Donut", "Chocolate Donut")
println(set1)

println(set1("Plain Donut"))

val emptySet: Set[String] = Set.empty[String]
println(emptySet)