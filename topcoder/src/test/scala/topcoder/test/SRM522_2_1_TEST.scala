package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM522_2_1.getMaximum

class SRM522_2_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { getMaximum(
    Array( 1, 2, 1, 1, 0, 4, 3 )
    ) should equal (2) }
  test("Case 1") { getMaximum(
    Array( 0, 1 )
    ) should equal (0) }
  test("Case 2") { getMaximum(
    Array( 0, 1, 2, 3, 4 )
    ) should equal (3) }
  test("Case 3") { getMaximum(
    Array( 10, 19, 10, 19 )
    ) should equal (0) }
  test("Case 4") { getMaximum(
    Array( 0, 23, 49, 50, 32, 0, 18, 50, 0, 28, 50, 27, 49, 0 )
    ) should equal (5) }
}