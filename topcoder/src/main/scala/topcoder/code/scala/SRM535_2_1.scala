package topcoder.code.scala

object SRM535_2_1 {
// Commented out version works, but is slow
//  def get(AminusB: Int, BminusC: Int, AplusB: Int, BplusC: Int) = {
//    val as, bs, cs = -30 to 30
//    
//    val s: Stream[((Int, Int, Int), Boolean)] = Stream.tabulate(61, 61, 61){
//      case (x, y, z) =>
//         val (a, b, c) = (x - 30, y - 30, z - 30)
//         ((a, b, c),
//         (AminusB == a - b) &&
//         (BminusC == b - c) &&
//         (AplusB == a + b)  &&
//         (BplusC == b + c))
//    }.flatten.flatten
//    
//    val r = s.find(_._2 == true)
//    
//    r.map(_._1.productIterator.toArray).getOrElse(Array[Int]())
//    
//  }

  def get(AminusB: Int, BminusC: Int, AplusB: Int, BplusC: Int): Array[Int] = {
    for {
      a <- -30 to 30
      b <- -30 to 30
      c <- -30 to 30
      if AminusB == a - b &&
         BminusC == b - c &&
         AplusB == a + b  &&
         BplusC == b + c
    } return Array(a, b, c)
    
    Array.empty[Int]
    
  }
}

