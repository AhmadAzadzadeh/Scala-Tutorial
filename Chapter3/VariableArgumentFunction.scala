def printReport(names: String*) = {
    println(s"""Donut Report = ${names.mkString(", ")}""")
}

printReport("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
printReport("Chocolate Donut")

val listDonuts: List[String] = List("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
printReport(listDonuts: _*)

val seqDonuts: Seq[String] = Seq("Chocolate Donuts", "Plain Donut")
printReport(seqDonuts: _*)