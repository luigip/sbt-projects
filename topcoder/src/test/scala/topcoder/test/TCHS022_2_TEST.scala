package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS022_2._

class TCHS022_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { closestShed(19, 22) should equal (22) }
  test("Case 1") { closestShed(19, 21) should equal (11) }
  test("Case 2") { closestShed(1234567, 12345678) should equal (1234321) }
  test("Case 3") { closestShed(9999, 99999999) should equal (9999) }
}