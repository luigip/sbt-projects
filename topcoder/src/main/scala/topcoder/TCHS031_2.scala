package topcoder

object TCHS031_2 {
  def minTime(lanes: Array[Int], laneChange: Int, dist: Int) = {
    val flanes = lanes.takeWhile(_ != lanes.max) :+ lanes.max
    
    def go(l: Array[Int], d: Double): Double = {
      if(l.size == 1) d / l(0) else {
        val chgdist = (l(0) + l(1)) * laneChange
        if(d < chgdist) d / l(0)
        else (laneChange * 2 + go(l.tail, d - chgdist )) min (d / l(0))
      }
    }
    if(laneChange * flanes(0) > dist) dist.toDouble / flanes(0)
    else laneChange + go(flanes, dist.toDouble - laneChange * flanes(0))
  }
}