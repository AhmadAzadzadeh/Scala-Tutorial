
def checkDonutAvailability(donutName: String): Boolean = {
  val listDonutsFromStock: List[String] = List("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")
  val iDonutInStock = (donutName.nonEmpty && donutName.length > 0) && (listDonutsFromStock contains donutName)
  iDonutInStock
}

println(s"Calling checkDonutAvailability with Vanilla Donut = ${checkDonutAvailability("Vanilla Donut")}")


def checkDonutAvailabilityWithNestedFunction(donutName: String): Boolean = {
  val listDonutsFromStock: List[String] = List("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")
  // Nested Function
  val validate: String => Boolean = (name) => {
    name.nonEmpty && name.length > 0
  }

  val isDonutInStock = validate(donutName) && (listDonutsFromStock contains donutName)
  isDonutInStock
}

println(s"Calling checkDonutAvailabilityWithNestedFunction with Vanilla Donut = ${checkDonutAvailabilityWithNestedFunction("Vanilla Donut")}")