package topcoder

object TCHS023_1 {
  def numberOfPictures(labels: Array[String], K: Int) = {
    labels.map(i => (i, labels.count(i==) min (K - 1)))
      .distinct.map(_._2).sum
  }
}