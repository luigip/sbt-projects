package topcoder.manual

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM220_2_1._

class SRM220_2_TEST extends FunSuite with ShouldMatchers {

  test("SRM 152 250pt") {
    getAge(2004, 1980) should equal (6)
    getAge(10000, 1582) should equal (2042)
    getAge(2007, 1981) should equal (6)
    getAge(1981, 1980) should equal (0)
    getAge(1984, 1983) should equal (1)
  }


}