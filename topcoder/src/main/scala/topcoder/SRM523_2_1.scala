package topcoder

object SRM523_2_1 {
  def doesItExist(letterMaze: Array[String]) = {
    def find(c: Char) = {
      val y = letterMaze.indexWhere(_ contains c)
      val x = letterMaze(y).indexOf(c)
      (x, y)
    }
    val a = find('A')
    val res = ((true, a._1, a._2) /: ('B' to 'Z')){ case((b, x1, y1), c) =>
      val (x2, y2) = find(c)
      if ((x1-x2).abs + (y1-y2).abs == 1) (b && true, x2, y2)
      else (false, x2, y2)
    }._1
    
    // alternatively, imperative:
    /*var res2 = true
    var (x1, y1) = find('A')
    for (c <- 'B' to 'Z') {
      val (x2, y2) = find(c)
      if ((x1-x2).abs + (y1-y2).abs != 1) res2 = false
      x1 = x2; y1 = y2
    }*/
    
    if (res) "YES" else "NO"
  }

}