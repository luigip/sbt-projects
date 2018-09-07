package topcoder

object SRM524_2_2 {
  def minimalTransfer(n: Long) = {
    if(n == 3) 3L 
    else if(isPrime(n)) 2L else 1L    
  }
  
  def isPrime(n: Long, td: Long = 2): Boolean = {
    if(n == 1) false
    else if(td * td > n) true
    else if (n % td == 0) false
    else isPrime(n, td + 1)
  }
  
}