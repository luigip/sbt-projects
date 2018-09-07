package topcoder

object SRM148_2_2 {
  def decipher(typed: String, switches: Array[String]): String = {
    var m = ('A' to 'Z'). map {i => i -> i} .toMap
    for (s <- switches) {
      val k1 = m.find(_._2 == s(0)).get._1
      val k2 = m.find(_._2 == s(2)).get._1
      m += k1 -> s(2)
      m += k2 -> s(0)
    }
    typed map m
  }
}