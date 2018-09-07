package topcoder

object SRM522_2_1 {
  def getMaximum(y: Array[Int]) = {
    val cs = y.zipWithIndex
    val es = for {
      Array((y1, x1), (y2, x2)) <- cs.combinations(2)
      ya = y1 min y2
      yb = y1 max y2
      xa = x1 min x2
      xb = x1 max x2
      erased = cs.filter {case (y, x) => ya < y && yb > y && xa < x && xb > x} .size
    } yield erased
    
    es.max
  }
}