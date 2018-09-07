package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS028_2._

class TCHS028_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { highest(4, 3) should equal (729) }
  test("Case 1") { highest(8, 0) should equal (1) }
  test("Case 2") { highest(2, 3) should equal (98) }
  test("Case 3") { highest(8, 10) should equal (99574272) }
  test("Case 4") { highest(8, 20) should equal (99532800) }
  test("Case 5") { highest(8, 30) should equal (-1) }
  test("Case 6") { highest(2, 6) should equal (96) }
  test("Case 7") { highest(3, 1) should equal (9) }
}
