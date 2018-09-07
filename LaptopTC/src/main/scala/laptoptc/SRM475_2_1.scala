package laptoptc

object SRM475_2_1 {
  def getWinner(names: Array[String], votes: Array[String]): String = {
    val pairs = names zip votes toList
    val list = for {
      (n, v) <- pairs
      ps = pairs filter (i => i._1 != i._2)
    } yield (n, ps count (_._2 == n))
    val s = list.sortBy(_._2)(Ordering.Int.reverse)
    s match {
      case Nil => ""
      case h1 :: h2 :: t => if (h1._2 == h2._2) "" else h1._1
      case h1 :: Nil => h1._1
    }
  }
}