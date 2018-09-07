package topcoder

object TCHS022_2 {
  def closestShed(now: Int, streets: Int) = {
    val n = now.toString
    val isOddLen = n.length % 2 != 0

    def getPal(s: String) = isOddLen match {
      case true => s + s.reverse.tail
      case false => s + s.reverse  
    }
    
    val h1 = n.take((n.length + 1) / 2).toInt
    val vs = for {
      n <- List(h1, h1 + 1, h1 - 1)
      p = getPal(n.toString).toInt
      d = math.abs(now - p)
      if p > 9 && p <= streets
    } yield (p, d)
    vs.sortWith(_._2 < _._2).head._1
  }
}