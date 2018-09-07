package topcoder

object TCHS025_1 {
  def getSums(numbers: Array[Int], K: Int) = {
    
    val (a, b) = numbers partition {_ % K == 0}
    math.abs(a.sum - b.sum)
    
//    var t = 0
//    for(n <- numbers) {
//      if(n % K == 0) t += n
//      else t -= n
//    } 
//    math.abs(t)
  }
}