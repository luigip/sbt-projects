package topcoder

object SRM218_1_1 {
  def calculateWaste(files: Array[String], folderCount: Int, clusterSize: Int): Array[Int] = {

    val groups = files groupBy (_.split(" ")(0))

    val z = for {
      g <- groups
      n = g._1.toInt
      a = g._2.map(_.split(" ")(1).toInt)
      w = a.map {i => clusterSize - (i % clusterSize)}
      w1 = w.map {i => if(i == clusterSize) 0 else i}.sum
    } yield (n -> w1)
    val m = z.toMap
    (for (i <- 0 to (folderCount - 1)) yield m.getOrElse(i, 0) ).toArray

  }
}