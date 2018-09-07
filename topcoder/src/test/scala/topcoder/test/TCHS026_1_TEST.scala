package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS026_1._

class TCHS026_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { minCost(
    Array(50, 20, 30, 17, 100), 10
    ) should be (207.0 plusOrMinus 1e-9) }
  test("Case 1") { minCost(
    Array(1,2,3,4,5,6,7), 100
    ) should be (15.0 plusOrMinus 1e-9) }
  test("Case 2") { minCost(
    Array(100,40,23,592,582,19435739,204857,0), 0
    ) should be (1.9641933E7 plusOrMinus 1e-9) }
  test("Case 3") { minCost(
    Array(999,111,888,1238,52009,419,0,0,43,0,11,4,2,348,10039586,1000000,203985157), 37
    ) should be (1.355019587E8 plusOrMinus 1e-9) }
  test("Case 4") { minCost(
    Array(100,304,50607,2024,6046,708), 75
    ) should be (17299.25 plusOrMinus 1e-9) }
  test("Case 5") { minCost(
    Array(1), 50
    ) should be (1.0 plusOrMinus 1e-9) }
  test("Case 6") { minCost(
    Array(), 100
    ) should be (0.0 plusOrMinus 1e-9) }
}