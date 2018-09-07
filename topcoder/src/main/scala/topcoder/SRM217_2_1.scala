package topcoder

object SRM217_2_1 {
  def maximalDistance(vel: Array[Int], con: Array[Int], fuel: Int): Double = {
//    (vel zip con map {case (a,b) => (a.toDouble / b)} max) * fuel
    (vel, con).zipped.map(_.toDouble / _).max * fuel
  }
}