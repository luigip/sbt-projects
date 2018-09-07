package topcoder

object SRM144_2_1 {
  def whatTime(seconds: Int): String = {
    (seconds / 3600) + ":" + (seconds % 3600 / 60) + ":" + (seconds % 60) 
  }
}