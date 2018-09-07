package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS025_2._

class TCHS025_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { probability(1, 6) should be (0.16666666666666666 plusOrMinus 1e-9) }
  test("Case 1") { probability(5, 6) should be (0.19624485596707822 plusOrMinus 1e-9) }
  test("Case 2") { probability(4, 10) should be (0.3439 plusOrMinus 1e-9) }
  test("Case 3") { probability(20, 10) should be (0.04317449528446337 plusOrMinus 1e-9) }
}