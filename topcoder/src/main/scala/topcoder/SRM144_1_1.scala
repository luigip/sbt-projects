package topcoder

object SRM144_1_1 {
  def decode1(message: String) = {
    val Q = 0 +: (message map (_.asDigit))

    def dec(r0: Int): String = {
      var i = 2
      val P = new Array[Int](Q.length)
      P(0) = 0
      P(1) = r0
      while (i < Q.length) {
        P(i) = Q(i - 1) - P(i - 1) - P(i - 2)
        i += 1
      }
      if(Q.last != P.last + P.dropRight(1).last) ("NONE") else
      if (P forall {List(0,1).contains}) P.tail.mkString
      else "NONE"
    }
    Array(dec(0), dec(1))
  }
  
    def decode(message: String) = {
      val Q = message map (_.asDigit)
      def dec(n: Int) = {
        val p = Q.scanLeft(n,0,0)((a, x) => (x, a._1 - a._2 - a._3, a._2))
        if (p.last._1 != (p.last._2 + p.last._3)
            || !p.map(_._2).forall(List(0,1).contains)) "NONE"
        else p.map(_._2).mkString.tail
      }
      Array(dec(0), dec(1))
    }
  
}