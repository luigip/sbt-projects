package laptoptc.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import laptoptc.SRM529_2_1.savedPawnCount

class SRM529_2_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { savedPawnCount(
    Array(0,2)
    ) should equal (1) }
  test("Case 1") { savedPawnCount(
    Array(10,3)
    ) should equal (11) }
  test("Case 2") { savedPawnCount(
    Array(0,0,0,8)
    ) should equal (1) }
  test("Case 3") { savedPawnCount(
    Array(0,1,1,2)
    ) should equal (1) }
  test("Case 4") { savedPawnCount(
    Array(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,123456)
    ) should equal (0) }
  test("Case 5") { savedPawnCount(
    Array(1000,2000,3000,4000,5000,6000,7000,8000)
    ) should equal (3921) }
}