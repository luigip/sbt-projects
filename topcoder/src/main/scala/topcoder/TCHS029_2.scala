package topcoder

object TCHS029_2 {
  def shortestRoute(distance: Int, cutStart: Array[Int], cutEnd: Array[Int], cutLength: Array[Int]) = {

    case class Cut(start: Int, end: Int, len: Int)
    val end = Cut(distance, distance, 0)
    val cuts = (cutStart, cutEnd, cutLength).zipped.map(Cut(_,_,_)).sortBy(_.start) :+ end
    
    def go(lst: List[Cut], dist: Int): Int = {
      lst match {
        case e :: Nil => dist min distance
        case x :: xs => { 
          val rest = xs dropWhile {_.start < x.end}
          if (rest.isEmpty) Int.MaxValue 
          else  go(rest, dist + x.len + rest.head.start - x.end)
          } min go(xs, dist + xs.head.start - x.start)
        case _ => throw new MatchError
      }
    }
    go(cuts.toList, cuts.head.start)
  }
}