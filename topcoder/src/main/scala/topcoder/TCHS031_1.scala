package topcoder

object TCHS031_1 {
  def bestRoute(route: Array[String], report: Array[String]) = {
    val List(times, names) = route.map(_.split(" ")).toList.transpose
    val extra = for(r <- report; s = r.split(" "); if names.contains(s(1))) yield s(0).toInt
    times.map(_.toInt).sum + extra.sum
  }
}