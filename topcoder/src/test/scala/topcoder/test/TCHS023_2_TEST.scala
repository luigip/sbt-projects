package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS023_2._

class TCHS023_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { numberOfSquares(1, 1) should equal (1) }
  test("Case 1") { numberOfSquares(2, 2) should equal (5) }
  test("Case 2") { numberOfSquares(2, 3) should equal (1) }
  test("Case 3") { numberOfSquares(6, 4) should equal (13) }
  test("Case 4") { numberOfSquares(76711, 54969) should equal (1) }
}