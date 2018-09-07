package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS022_1._

class TCHS022_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { numFibs(2, 5) should equal (3) }
  test("Case 1") { numFibs(12, 13) should equal (1) }
  test("Case 2") { numFibs(13, 13) should equal (1) }
}