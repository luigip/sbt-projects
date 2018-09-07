package topcoder

object SRM145_2_2 {
  def getPercentages(time: String): Int = {
    
    val t = time split ":" map (_.toInt)
    val sec: Int = (t, Vector(3600,60,1)).zipped.map(_*_).sum
    (1 to 99).dropWhile(sec * _ % 100 != 0).headOption match {
      case None => 0
      case Some(x) => 100 / x - 1 
    }
  }
}