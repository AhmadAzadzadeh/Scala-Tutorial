def applyDiscount[T](discount: T) = {
    discount match {
        case d: String =>
            println(s"Lookup percentage discount in database for")
        case d: Double =>
            println(s"$d discount will be applied")
        case _ =>
            println("Unsupported discount type")
    }
}

applyDiscount[String]("COUPON_123")
applyDiscount[Double](10)


def applyDiscountWithReturnType[T](discount: T): Seq[T] = {
    discount match {
        case d: String => 
            println(s"Lookup percentage discount in database for $d")
            Seq[T](discount)
        case d: Double =>
            println(s"$d discount will be applied")
            Seq[T](discount)
        case d @ _ => 
            println("Unsupported discount type")
            Seq[T](discount)
    }
}

println(s"Result of applyDiscountWithReturnType with String parameter = ${applyDiscountWithReturnType[String]("COUPON_123")}")