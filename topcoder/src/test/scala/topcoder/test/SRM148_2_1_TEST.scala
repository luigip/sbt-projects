package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM148_2_1._

class SRM148_2_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { howMany(12345) should equal (3) }
  test("Case 1") { howMany(661232) should equal (3) }
  test("Case 2") { howMany(52527) should equal (0) }
  test("Case 3") { howMany(730000000) should equal (0) }
}