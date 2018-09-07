package topcoder

object TCHS004_1 {
  def minimumSpeed(speed: Array[Int], yourSpeed: Int) = {
    (speed.max - yourSpeed) / 2.0 max 0
    
  }
}