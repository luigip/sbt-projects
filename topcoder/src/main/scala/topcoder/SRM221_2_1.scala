package topcoder

object SRM221_2_1 {
  def getSubstrings(str: String) = {

    val s = for { i <- 0 to str.length } yield Array(str.substring(0,i), str.substring(i))

    s.reverse.find(i => i(0).count('a'==) == i(1).count('b'==)).get
  }
}