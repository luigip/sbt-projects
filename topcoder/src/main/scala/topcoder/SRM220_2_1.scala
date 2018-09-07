package topcoder

object SRM220_2_1 {
  def getAge(year: Int, born: Int) = {
    (born + 1 to year).filter(i => (i % 4 == 0 && !(i % 100 == 0 ^ i % 400 == 0))).length
  }
}
