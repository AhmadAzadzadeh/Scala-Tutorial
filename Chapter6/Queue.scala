import scala.collection.immutable.Queue
// The Queue's elements are in First In First Out order (FIFO)
val queue1: Queue[String] = Queue("Plain Donut", "Strawberry Donut", "Chocolate Donut")
println(queue1)

println(queue1(0))
println(queue1(1))
println(queue1(2))

val enqueue: Queue[String] = queue1.enqueue("Vanilla Donut")
println(enqueue)

val dequeue: (String, Queue[String]) = queue1.dequeue
println(dequeue)

println(dequeue._1)
println(dequeue._2)

val emptyQueue: Queue[String] = Queue.empty[String]
println(emptyQueue)