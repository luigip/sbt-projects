package topcoder

object SRM522_2_2 {
  def getWinner(cells: String) = {
    if( cells(0) == 'A' || cells.last == 'A') "Alice" else "Bob"
  }
}