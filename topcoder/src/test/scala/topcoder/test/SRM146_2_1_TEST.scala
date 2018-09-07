package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM146_2_1._

class SRM146_2_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { maxPoints(
    Array( 2, 2, 3, 5, 4 )
    ) should equal (5) }
  test("Case 1") { maxPoints(
    Array( 6, 4, 1, 1, 3 )
    ) should equal (6) }
  test("Case 2") { maxPoints(
    Array( 5, 3, 5, 3, 3 )
    ) should equal (10) }
}