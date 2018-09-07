package topcoder

object TCHS006_1 {
  def waysToInterpret(display: String) = {
    val nums = display.split(":").map(_.toInt)
    val r = if (nums forall (i => i >= 0 && i < 60)) {
      nums filter (i => i == 0 || i > 12) length
    } else 0

    r match {
      case 0 => 6
      case 1 => 4
      case 2 => 2
      case _ => 0
    }
  }
}