package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS001_1._

class TCHS001_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { averageSpeed(1, 50,
    Array(45, 40, 50)
    ) should be (45.0 plusOrMinus 1E-9) }
  test("Case 1") { averageSpeed(1, 50,
    Array(42,43,44,45,46,47,48,49,50,51)
    ) should be (46.0 plusOrMinus 1E-9) }
  test("Case 2") { averageSpeed(1, 50,
    Array(42,46,48,50,52)
    ) should be (0.0 plusOrMinus 1E-9) }
  test("Case 3") { averageSpeed(20, 60,
    Array(25,45,45,43,24,9,51,55,60,34,61,23,40,40,47,49,33,23,47,54,54)
    ) should be (41.68421052631579 plusOrMinus 1E-9) }
}