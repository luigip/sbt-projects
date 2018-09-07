package topcoder

object TCHS023_2 {
  def numberOfSquares(N: Int, M: Int) = {
    val gcd = hcf(N, M)
    val (h, v) = (N/gcd, M/gcd)
    val squares = for {
      a <- 1L to N
      if a * v % h == 0
      b = a * v / h
      num = (N - a + 1) * (M - b + 1)
    } yield num
    squares.sum
  }
  
  def hcf(a: Int, b: Int): Int = b match  {
    case 0 => a
    case _ => hcf(b, a % b)
  }
  
}