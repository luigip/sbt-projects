package topcoder

object TCHS028_1 {
  
  def swaptions1(colors1: String, colors2: String) = {
    
    def has3(s: String) = s.sliding(3).filter(_.distinct.length == 1).size > 0
    
    val rs = for {
      i1 <- colors1.indices
      i2 <- colors2.indices
      n1 = colors1.substring(0, i1) + colors2(i2) + colors1.substring(i1 + 1)
      n2 = colors2.substring(0, i2) + colors1(i1) + colors2.substring(i2 + 1)
      if has3(n1) && has3(n2)
    } yield 1
    rs.sum
  }
  
  // more efficient version:  copied idea from someone's Java solution
  def swaptions(colors1: String, colors2: String) = {
    
    val rs = for {
      i <- (1 until colors1.size - 1)
      s = colors1(i - 1)
      if s == colors1(i + 1)
      m = colors1(i)
      j <- (1 until colors2.size - 1)
      if m == colors2(j - 1) && m == colors2(j + 1) && s == colors2(j)
    } yield 1
    rs.sum
  }  
}