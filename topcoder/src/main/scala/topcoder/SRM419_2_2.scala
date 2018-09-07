package topcoder

import collection.mutable.ArrayBuffer

object SRM419_2_2 {
  def getText(commands: Array[String], time: Array[Int]) = {
    
    val ab = new Array[String](commands.size)
    (commands, time, commands.indices).zipped foreach { case (c, t, i) =>
      val cmd = c split " "
      if(cmd(0) == "type") {
        val m = if(i == 0) "" else ab(i - 1)
        ab(i) = m + cmd(1) 
      } else {
        val back = t - cmd(1).toInt
        val idx = time.takeWhile(_ < back).size - 1
        if (idx < 0) ab(i) = "" 
        else ab(i) = ab(idx) 
      }
    }
    ab.last
  }
}
