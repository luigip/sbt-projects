package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS070_2._

class TCHS070_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { terminalTimes(
    Array(2, 1, 2, 4)
    ) should equal (Array(5, 2, 6, 9 )) }
  test("Case 1") { terminalTimes(
    Array(1, 2, 3)
    ) should equal (Array(1, 4, 6 )) }
  test("Case 2") { terminalTimes(
    Array(3, 2, 2, 1)
    ) should equal (Array(8, 6, 7, 4 )) }
  test("Case 3") { terminalTimes(
    Array(2, 4, 7, 7, 3, 2, 9, 10, 5, 8, 10, 1, 5, 7, 6, 8, 10, 4, 9, 7, 10, 4, 3, 9)
    ) should equal (
    Array(25, 69, 118, 119, 51, 30, 140, 147, 92, 133, 148, 12, 95, 124, 111, 135,
          149, 82, 144, 128, 150, 86, 67, 146 )) }
}