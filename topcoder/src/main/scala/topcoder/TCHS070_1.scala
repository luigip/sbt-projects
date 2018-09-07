package topcoder

object TCHS070_1 {
  // 250pt
  def getPoints(rawScores: Array[Int], conversionFactor: Array[Int]) = {
    (rawScores, conversionFactor).zipped.map((r,c) => (r.toDouble / c).round).sum
  }
}

