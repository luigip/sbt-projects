package topcoder

object SRM219_2_1 {
  def maxPercent (total: Int, taxPercent: Int, money: Int) = {
    if(total + (total*taxPercent/100).toInt > money) -1
    else Stream.from(0).takeWhile(i =>
       (total + (total*taxPercent/100).toInt + (total * i / 100).toInt) <= money).last
  }
}