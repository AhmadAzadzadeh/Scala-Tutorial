import scala.collection.mutable.ArrayBuffer

val arrayBuffer1: ArrayBuffer[String] = ArrayBuffer("Plain Donut", "Strawberry Donut", "Chocolate Donut")
println(arrayBuffer1)


println(arrayBuffer1(0))

val emptyArrayBuffer: ArrayBuffer[String] = ArrayBuffer.empty[String]
println(emptyArrayBuffer)