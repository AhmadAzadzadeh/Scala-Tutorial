import scala.collection.immutable.Stack
val stack1: Stack[String] = Stack("Plain Donut", "Strawberry Donut")
println(stack1)
// Immutable Stack is deprecated...  so do not use it!
// Instead let's use an Immutable List as per the Scala API documentation to achieve the same Stack behaviour.
val emptyStack: List[String] = List.empty[String]