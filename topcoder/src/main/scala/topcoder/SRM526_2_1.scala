package topcoder

object SRM526_2_1 {
  def howMany(answers: String): Array[Int] = {
    if(answers.isEmpty) Array()
    else answers.toSet.size +: howMany(answers.tail)
  }
}