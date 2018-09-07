package topcoder

object SRM223_2_1 {
  def bestItem(costs: Array[Int], prices: Array[Int], sales: Array[Int], items: Array[String]) = {

    val is = (costs, prices, sales).zipped map { case (c,p,r) => (p -c) * r }
    val r = is.zip(items).sortWith(_._1 > _._1).head
    if(r._1 > 0) r._2 else ""

//    var ret = ""
//    var max = 0
//    for(i <- 0 until costs.length) {
//      val profit = (prices(i) - costs(i)) * sales(i)
//      if(profit > max && profit > max) {
//        max = profit
//        ret = items(i)
//      }
//    }
//    ret

  }
}