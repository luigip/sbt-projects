package topcoder

object TCHS003_2 {
  def getCheater(first: Array[String], second: Array[String], third: Array[String]) = {

    def cheat(s1: String, s2: String) = !(s2.length > 0 && (s1 == s2.tail || s1 == s2.init))

    def round(i: Int): Int = {
           if (second.size <= i) -1
      else if (cheat(first(i), second(i))) 1
      else if (third.size <= i) -1
      else if (cheat(second(i), third(i))) 2
      else if (first.size <= i + 1) -1
      else if (cheat(third(i), first(i + 1))) 3
      else round(i + 1)
    }

    round(0)
  }
}