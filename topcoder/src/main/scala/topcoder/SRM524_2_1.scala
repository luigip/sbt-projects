package topcoder

object SRM524_2_1 {
  def minimalCost(N: Int) = {
    val xs = for {
      a <- 1 to 200
      b <- 1 to (200 / a + 1)
      c <- 1 to (200 / a / b + 1)
      vol = a * b * c
      cost = a + b + c
    } yield (vol, cost)
    
    xs.sorted.dropWhile(_._1 < N).head._2
  }
}
