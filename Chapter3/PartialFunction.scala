
val donut: String = "Glazed Donut"

val tasteLevel = donut match {
  case "Glazed Donut" | "Strawberry Donut" => "Very tasty"
  case "Plain Donut" => "Tasty"
  case _ => "Tasty"
}

println(s"Taste level of $donut = $tasteLevel")

val isVeryTasty: PartialFunction[String, String] = {
  case "Glazed Donut" | "Strawberry Donut" => "Very Tasty"
}

println(s"Calling partial function isVeryTasty = ${isVeryTasty("Glazed Donut")}")


val isTasty: PartialFunction[String, String] = {
  case "Plain Donut" => "Tasty"
}

val unKnownTaste: PartialFunction[String, String] = {
  case donut @ _ => s"Unknown taste for donut = $donut"
}

val donutTaste = isVeryTasty orElse isTasty orElse unKnownTaste

println(donutTaste("Glazed Donut"))
println(donutTaste("Plain Donut"))
println(donutTaste("Chocolate Donut"))