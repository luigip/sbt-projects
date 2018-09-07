package topcoder

object SRM523_2_2 {
  /*
    Would be simple; complications are:
      for AP, this can take too long / too much memory for Long-sized upper bound
      for GP, factor can be 1
      since we can't enumerate AP directly, have to use modulus to determine if member of GP would be in AP
   */
  
  def countThem(a: Long, b: Long, c: Long, d: Long, upperBound: Long) = {
    val ap = if (upperBound < a) 0 
             else (upperBound - a) / b + 1
    val gp = if (upperBound < a) Stream(0L) 
             else if (d == 1) Stream(c)
             else Stream.iterate(c)(_ * d)
    ap + gp.takeWhile(_ <= upperBound).filterNot(i => (i-a) >= 0 && (i-a) % b == 0).size
  }
}