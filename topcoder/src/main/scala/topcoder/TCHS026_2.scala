package topcoder

object TCHS026_2 {
  def getLength(s: String): Int = {
    
    val s2 = """(\d\(\d*\))""".r.replaceAllIn(s, { m => 
      val t = m.group(1)
      t.substring(2).init * t(0).asDigit
    })
    if (s2 == s) s.size
    else getLength(s2)
  }
}