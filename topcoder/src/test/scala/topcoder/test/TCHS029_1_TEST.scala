package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS029_1.getSum

class TCHS029_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { getSum(1325) should equal (6556) }
  test("Case 1") { getSum(100) should equal (101) }
  test("Case 2") { getSum(89437) should equal (162935) }
  test("Case 3") { getSum(1) should equal (2) }
}