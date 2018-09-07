package topcoder

object SRM145_2_1 {
  def count(dithered: String, screen: Array[String]): Int = {
    dithered.map(i => screen.mkString.count(i==)).sum
  }
}