package topcoder

object TCHS022_1 {
  def numFibs(a: Int, b: Int) = {
    lazy val fib: Stream[Long] = 1 #:: 1 #:: fib.zip(fib.tail).map{case (x,y) => x + y}
    fib.takeWhile(_ <= b).dropWhile(_ < a).length
  }
}