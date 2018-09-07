package topcoder

object SRM526_2_2 {
  
  def minimumTime(grid: Array[String]) = {
    val trans = grid.map(_.toArray).transpose.map(_.mkString)
    calc(grid) min calc(trans)
  }
  
  def calc(grid: Array[String]) = {
    val xs = grid map (_.indexOf("o")) filterNot(-1 ==)
    // total offsets for each possible column
    val tx = for {
      i <- grid(0).indices
    } yield xs.map(x => (i - x).abs).sum

    // total offsets for each possible starting row
    val ty = for {
      i <- grid.indices
      if i + xs.size <= grid.size
    } yield compress(grid, i, 0, 0)

    tx.min + ty.min
  }

  // n = number of blanks encountered
  // i = total moves
  // m = candidate distance from 0
  def compress(xs: Array[String], m: Int, n: Int, i: Int): Int = {
    if (xs.isEmpty) i
    else if (xs(0).contains('o')) 
      compress(xs.tail, m,  n, i + (m - n).abs)
    else
      compress(xs.tail, m, n + 1, i)
  }
}