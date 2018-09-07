package topcoder

import math._

object TCHS025_2 {
  def probability(dice: Int, sides: Int) = {

    val p = 1d / sides
    val hitsreq = (dice + 5) / 5
    val probs = (hitsreq to dice).map {
      i => combos(dice, i) * pow(p, i)  * pow(1 - p, dice - i) 
    }
    probs.sum
  }
  
  def combos(n: Int, r: Int) = fact(n) / fact(r) / fact(n - r)

  def fact(n: Long): Long = if (n ==0) 1 else (1L to n).reduceLeft(_ * _)
}