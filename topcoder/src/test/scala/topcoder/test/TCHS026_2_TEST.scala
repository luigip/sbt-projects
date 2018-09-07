package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS026_2._

class TCHS026_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { getLength("123") should equal (3) }
  test("Case 1") { getLength("10342(76)") should equal (8) }
  test("Case 2") { getLength("33(562(71(9)))") should equal (19) }
  test("Case 3") { getLength("0(0)") should equal (0) }
  test("Case 4") { getLength("1(1(1(1(1(1(1(0(1234567890))))))))") should equal (0) }
  test("Case 5") { getLength("1()66(5)") should equal (7) }
}