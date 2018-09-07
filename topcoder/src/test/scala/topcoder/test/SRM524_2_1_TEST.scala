package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM524_2_1.minimalCost

class SRM524_2_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { minimalCost(1) should equal (3) }
  test("Case 1") { minimalCost(6) should equal (6) }
  test("Case 2") { minimalCost(7) should equal (9) }
  test("Case 3") { minimalCost(200) should equal (18) }
}