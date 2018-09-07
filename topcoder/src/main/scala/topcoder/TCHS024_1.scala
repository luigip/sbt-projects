package topcoder

object TCHS024_1 {
  def getScore(keywords: Array[String], scores: Array[Int], answer: String) = {

//    val m = keywords.zip(scores).toMap
//    answer.split(" ").distinct.map(i => m.getOrElse(i, 0)).sum
    
    keywords.zip(scores).map {i =>
      if (answer split " " contains i._1) i._2  else 0
    }.sum
    
  }
}