package topcoder

object TCHS026_1 {
  def minCost(prices: Array[Int], discount: Int) = {
    val (d, n) = prices.sorted.reverse.splitAt(prices.size / 3)
    d.sum * (1 - discount / 100d) + n.sum
  }
}