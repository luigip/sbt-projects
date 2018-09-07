package laptoptc.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import laptoptc.SRM530_2_1.solve

class SRM530_2_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { solve(
    Array(0, 2, 5)
    ) should equal (5) }
  test("Case 1") { solve(
    Array(5, 6, 7, 8)
    ) should equal (4) }
  test("Case 2") { solve(
    Array(0, 1, 2, 10)
    ) should equal (11) }
  test("Case 3") { solve(
    Array(1, 2, 3, 4, 5, 6, 7, 8)
    ) should equal (16) }
}