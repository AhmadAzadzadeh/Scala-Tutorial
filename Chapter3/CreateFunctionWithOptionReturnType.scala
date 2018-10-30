def dailyCoupenCode(): Option[String] = {
    val couponFromDb = "COUPON_1234"
    Option(couponFromDb).filter(_.nonEmpty)
}

val todayCoupon: Option[String] = dailyCoupenCode()
println(s"Today's coupon code = ${todayCoupon.getOrElse("No Coupon's Today")}")

dailyCoupenCode() match {
    case Some(couponCode) => println(s"Today's coupon code = $couponCode")
    case None => println(s"Sorry there is no coupon code today")
}

dailyCoupenCode().map(couponCode => println(s"Today's coupon code = $couponCode"))