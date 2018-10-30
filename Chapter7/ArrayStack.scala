import scala.collection.mutable.ArrayStack

val arrayStack1: ArrayStack[String] = ArrayStack("Plain Donut", "Strawberry Donut")
println(arrayStack1)

println(arrayStack1(0))
println(arrayStack1(1))

val emptyArrayStack: ArrayStack[Nothing] = ArrayStack.empty
println(emptyArrayStack)