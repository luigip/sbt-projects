package topcoder

object SRM146_2_1 {
  def maxPoints(toss: Array[Int]): Int = {
    (toss.distinct).map(i => i * toss.count(i==)).max
  }
}