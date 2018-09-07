package topcoder

object TCHS001_2 {
  def language(frequencies: Array[String], text: Array[String]) = {
    val allText = text.mkString.replace(" ", "")

    val lcounts = ('a' to 'z' map { i => i -> allText.count(i ==) } toMap)
    
    val vars = frequencies map { fset =>
      val devs = 'a' to 'z' map { i =>
        val p = fset.indexOf(i) match {
          case -1 => 0d
          case x => fset.substring(x + 1, x + 3).toDouble / 100 * allText.size
        }
        math.pow(p - lcounts(i), 2)
      }
      devs.sum
    }
    vars.min
  }
}