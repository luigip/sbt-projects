package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS004_1._

class TCHS004_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { minimumSpeed(
    Array(4, 3, 2, 1), 5
    ) should be (0.0 plusOrMinus 1E-9) }
  test("Case 1") { minimumSpeed(
    Array(3, 3), 3
    ) should be (0.0 plusOrMinus 1E-9) }
  test("Case 2") { minimumSpeed(
    Array(2, 3, 4, 5), 1
    ) should be (2.0 plusOrMinus 1E-9) }
  test("Case 3") { minimumSpeed(
    Array(9), 1
    ) should be (4.0 plusOrMinus 1E-9) }
  test("Case 4") { minimumSpeed(
    Array(1, 1, 2, 2, 5, 2), 3
    ) should be (1.0 plusOrMinus 1E-9) }
}