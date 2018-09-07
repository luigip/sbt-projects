package topcoder

object TCHS001_1 {
  def averageSpeed(minLimit: Int, maxLimit: Int, readings: Array[Int]) = {

    def speeding(n: Int) = n > maxLimit || n < minLimit
    val faulty = readings.filter(speeding).length.toDouble / readings.length > 0.1
    val notsp = readings.filter(!speeding(_))
    val ave = notsp.sum.toDouble / notsp.length
    if(faulty) 0.0 else ave
  }
}