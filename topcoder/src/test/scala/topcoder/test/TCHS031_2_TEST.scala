package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS031_2.minTime

class TCHS031_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { minTime(
    Array(1,2), 2, 15
    ) should be (9.5 plusOrMinus 1e-9) }
  test("Case 1") { minTime(
    Array(1, 2), 2, 6
    ) should be (6.0 plusOrMinus 1e-9) }
  test("Case 2") { minTime(
    Array(528000), 10, 1
    ) should be (1.893939393939394E-6 plusOrMinus 1e-9) }
  test("Case 3") { minTime(
    Array(1, 0, 10), 4, 1000
    ) should be (115.2 plusOrMinus 1e-9) }
  test("Case 4") { minTime(
    Array(12, 0, 18, 0, 0, 0, 0,
          944, 0, 0, 0, 0, 0, 0,
          0, 0, 0, 0, 0, 528000), 15, 1500
    ) should be (123.33333333333334 plusOrMinus 1e-9) }
}