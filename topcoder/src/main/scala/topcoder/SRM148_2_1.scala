package topcoder

object SRM148_2_1 {
  def howMany(number: Int): Int = {
    number.toString.count {
      case '0' => false
      case x => number % x.asDigit == 0
    }
  }
}