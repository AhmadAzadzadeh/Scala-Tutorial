import scala.collection.immutable.Stream.cons

val stream1: Stream[Any] = 1 #:: 2 #:: 3 #:: Stream.empty
println(stream1)

val stream2: Stream[Any] = cons(1, cons(2, cons(3, Stream.empty)))
println(stream2)

stream1.take(3).print

val stream3: Stream[Int] = Stream.from(1)
print("Take only the first 20 numbers from the infinite number stream = ")
stream3.take(20).print