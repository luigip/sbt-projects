package topcoder

object SRM147_2_1 {
  def decode1(cipherText: String, shift: Int): String = {
    val al2 = ('A' to 'Z').splitAt(shift)
    val m = (al2._2 ++ al2._1 zip ('A' to 'Z') toMap)
    cipherText map m
  }
  
  def decode(cipherText: String, shift: Int): String = {
    cipherText map {i => ((i - 'A') + 26 - shift) % 26 + 'A' toChar} 
  }  
  
}