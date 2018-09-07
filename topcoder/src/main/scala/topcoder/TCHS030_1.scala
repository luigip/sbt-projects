package topcoder

object TCHS030_1 {
  def getList(friends: Array[String], today: String) = {
    friends.map(_.split(" ", 2)).filter(_(1) == today).map(_(0)).sorted
  }
}