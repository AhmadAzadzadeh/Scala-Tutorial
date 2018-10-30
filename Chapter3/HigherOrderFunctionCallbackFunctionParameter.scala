
def printReport(sendEmailCallback: () => Unit) = {
  println("Printing report ... started")
  println("Printing report ... finished")

  sendEmailCallback()
}

printReport(() =>
  println("Sending email ... finished")
)

//printReport(() => {}) // Not that elegant.

def printReportWithOptionCallback(sendEmailCallback: Option[() => Unit] = None) = {
  println("Printing report ... started")
  println("Printing report ... finished")

  sendEmailCallback.map(callback => callback())
}

printReportWithOptionCallback() // more elegant

printReportWithOptionCallback(Some(() =>
  println("Sending email wrapped in Some() ... finished")
))