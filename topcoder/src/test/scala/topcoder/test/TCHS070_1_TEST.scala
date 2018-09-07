package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS070_1._

class TCHS070_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { getPoints(
    Array(10, 20, 30),
    Array(10, 10, 5)
    ) should equal (9) }
  test("Case 1") { getPoints(
    Array(8, 16, 32),
    Array(10, 10, 5)
    ) should equal (9) }
  test("Case 2") { getPoints(
    Array(60, 59),
    Array(24, 24)
    ) should equal (5) }
  test("Case 3") { getPoints(
    Array(47, 42, 37, 30, 27, 21, 18),
    Array(1, 2, 3, 4, 5, 6, 7)
    ) should equal (100) }
  test("Case 4") { getPoints(
    Array(0, 1000000, 5000, 1000000),
    Array(1, 2, 1000000, 4)
    ) should equal (750000) }
}