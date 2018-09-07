package topcoder

object SRM147_1_1 {
  def order1(numMales: Int, numFemales: Int, K: Int): String = {
    def loop(a: String, f: Int): String = {
      val s = (K - 1) % (a.size + 1)
      if (f == 0) a
      else loop(a.takeRight(s) + 'F' + a.dropRight(s), f - 1)
    }
    loop("M" * numMales, numFemales)
  }
  
  def order(numMales: Int, numFemales: Int, K: Int): String = {
    var a = "M" * numMales
    var f = numFemales
    while({f -= 1; f >= 0}) {
      val s = (K - 1) % (a.size + 1)
      a = a.takeRight(s) + 'F' + a.dropRight(s)
    }
    a
  }  

}