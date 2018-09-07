package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM419_2_1.getPerimiter

class SRM419_2_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { getPerimiter(
    Array(2,3,5,6,1)
    ) should equal (22) }
  test("Case 1") { getPerimiter(
    Array(3,2,1)
    ) should equal (12) }
  test("Case 2") { getPerimiter(
    Array(2,2)
    ) should equal (8) }
  test("Case 3") { getPerimiter(
    Array(1,2,1)
    ) should equal (10) }
  test("Case 4") { getPerimiter(
    Array(1,2,3)
    ) should equal (12) }
}