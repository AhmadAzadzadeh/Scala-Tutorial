val array1: Array[String] = Array("Plain Donut", "Strawberry Donut", "Chocolate Donut")
println(array1.mkString(", "))

println(array1(0))
println(array1(1))
println(array1(2))

val array2: Array[String] = new Array[String](3)

array2(0) = "Vanilla Donut"
array2(1) = "Glazed Donut"
array2(2) = "Banana Donut"
println(array2.mkString(", "))
// create 2d array
val array3: Array[Array[String]] = Array.ofDim[String](2, 2)
array3(0)(0) = "Plain"
array3(0)(1) = "Donut"
array3(1)(0) = "Strawberry"
array3(1)(1) = "Donut"
println(array3.deep.toList)

// create 3d array
val array4: Array[Array[String]] = Array.ofDim[String](3, 3)
println(array4.deep.toList)


val rangeArray: Array[Int] = (1 to 10).toArray[Int]
println(rangeArray.mkString(", "))


for (d <- rangeArray) {
  println(d)
}
