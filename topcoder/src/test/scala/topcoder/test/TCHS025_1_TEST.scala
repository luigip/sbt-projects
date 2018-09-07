package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS025_1._

class TCHS025_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { getSums(
    Array(2,3,4,5,6), 3
    ) should equal (2) }
  test("Case 1") { getSums(
    Array(3,4,5,6,7,8,9,10), 5
    ) should equal (22) }
  test("Case 2") { getSums(
    Array(991,45,32,0,1,1,2), 8
    ) should equal (1008) }
}