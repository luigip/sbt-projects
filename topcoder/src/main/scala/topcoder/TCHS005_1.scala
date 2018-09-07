package topcoder

import math._

object TCHS005_1 {
  def calcSize(diagonal: Int, height: Int, width: Int) = {
    val H = sqrt(pow(diagonal, 2) / (1 + pow(width.toDouble / height, 2))) + 0.00000001
    val W = sqrt(pow(diagonal, 2) / (1 + pow(height.toDouble / width, 2))) + 0.00000001
    
    Array(H, W) map (_.toInt)
  }
}