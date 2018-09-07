package topcoder

object SRM223_2_2 {
  def cut(deck: String) = {

    def ftb(s: String, i: Int) = s.splitAt(i) match { case (a,b) => b + a }

    def win(s: String, red: Int = 0, black: Int = 0): Boolean = s.headOption match {
      case x if red > black => false
      case None             => true
      case Some('R')        => win(s.tail, red + 1, black)
      case Some('B')        => win(s.tail, red, black + 1)
    }

    val wins = deck.zipWithIndex.map{case(e,i) => (i, ftb(deck, i))}

    wins.dropWhile(i => !win(i._2)).head._1
  }
}