val glazedDonutTaste: Option[String] = Some("Very Tasty")
println(s"${glazedDonutTaste.get}")

val glazedDonutName: Option[String] = None
println(s"${glazedDonutName.getOrElse("Glazed Donut")}")

glazedDonutName match {
    case Some(name) => println(s"Received donut name = $name")
    case None => println(s"No donut name was found !")
}