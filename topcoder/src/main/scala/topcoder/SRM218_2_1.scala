package topcoder

object SRM218_2_1 {
  def canAccess(rights: Array[Int], minPermission: Int) = {
    rights.map(i => if(i < minPermission) "D" else "A").mkString
  }
}