import scala.util.control.TailCalls._

val arrayDonuts: Array[String] = Array("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")

def verySweetDonut(donutList: Array[String]): TailRec[Boolean] = {
  if (donutList.isEmpty) {
    println("verySweetDonut function: donut list isEmpty, returning false")
    done(false)
  }else {
    if (Set(donutList.head).subsetOf(Set("Vanilla Donut", "Strawberry Donut", "Glazed Donut"))) {
      println(s"verySweetDonut function: found donut list's head = ${donutList.head} to be very sweet, returning true")
      done(true)
    }else {
      println(s"verySweetDonut function: donut list's head = ${donutList.head} is not very sweet, forwarding donut list's to notSweetDonut function")
      tailcall(notSweetDonut(donutList))
    }
  }
}

def notSweetDonut(donutList: Array[String]): TailRec[Boolean] = {
  println(s"notSweetDonut function: with donut list = $donutList")
  if (donutList.isEmpty) {
    println("notSweetDonut function: donut list isEmpty, returning false")
    done(false)
  } else {
    println(s"notSweetDonut function: donut list's head = ${donutList.head} is NOT sweet,   forwarding donut list's tail to verySweetDonut function")
    tailcall(verySweetDonut(donutList.tail))
  }
}

val foundVerySweetDonut = tailcall(verySweetDonut(arrayDonuts)).result
println(s"Found very sweet donut = $foundVerySweetDonut")