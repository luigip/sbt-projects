package laptoptc

object SRM476_2_1 {
  def minimumShifts(matrix: Array[String], value: Int): Int = {
    val poss = for {
      s <- matrix.indices
      c <- matrix(s).indices
      if matrix(s)(c).asDigit == value
    } yield math.min(s, matrix.size - s) + math.min(c, matrix(s).size - c)
    if (poss.length == 0) -1 else poss.min
  }
}