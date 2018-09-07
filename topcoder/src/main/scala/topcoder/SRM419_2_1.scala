package topcoder

object SRM419_2_1 {
  def getPerimiter(a: Array[Int]) = {
    a.size * 2 + a(0) + a.last + 
      (a zip a.tail).map(i => math.abs(i._1 - i._2)).sum
  }
}