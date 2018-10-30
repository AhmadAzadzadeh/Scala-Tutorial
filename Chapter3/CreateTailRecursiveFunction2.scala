import scala.util.control.TailCalls._
//
val arrayDonuts: Array[String] = Array("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")
//
//@annotation.tailrec
//def search(donutName: String, donuts: Array[String], index: Int): Option[Boolean] = {
//  if (donuts.length == index) {
//    None
//  }else if (donuts(index) == donutName) {
//    Some(true)
//  }else {
//    val nextIndex = index + 1
//    search(donutName, donuts, nextIndex)
//  }
//}
//
//val found = search("Glazed Donut", arrayDonuts, 0)
//println(s"Find Glazed Donut = $found")
//
//val notFound = search("Chocolate Donut", arrayDonuts, 0)
//println(s"Find Chocolate Donut = $notFound")


def tailSearch(donutName: String, donuts: Array[String], index: Int): TailRec[Option[Boolean]] = {
  if (donuts.length == index) {
    done(None)
  }else if (donuts(index) == donutName) {
    done(Some(true))
  }else {
    val nextIndex = index + 1
    tailcall(tailSearch(donutName, donuts, nextIndex))
  }
}

val tailFound = tailcall(tailSearch("Glazed Donut", arrayDonuts, 0))
println(s"Find Glazed Donut using TailCall = ${tailFound.result}")