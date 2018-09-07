package topcoder

object TCHS028_2 {
  def highest(d: Int, op: Int) = {
    
    val m = (math.pow(10, d) - 1).toInt
    
    def find(opn: Int, nums: Set[Int]): Int = {
      if(opn == op) 
        if (nums.size > 0) nums.max else -1
      else 
        find(opn + 1, for {
          s <- nums
          d <- (2 to 9)
          p = s * d
          if p <= m
        } yield p ) 
    }
    
    find(0, Set(1))
  }
}

//  def factors(n: Int, m: Int = 2): List[Int] = {
//    if(n == 1) Nil
//    else if(m > 9) -1 :: Nil
//    else if(n % m == 0) m :: factors(n / m, m)
//    else factors(n, m + 1)
//  }