package topcoder

object SRM519_2_1 {
  def getDay(notOnThisDay: Array[String]): String = {
    Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
      .diff(notOnThisDay).head
  }
}