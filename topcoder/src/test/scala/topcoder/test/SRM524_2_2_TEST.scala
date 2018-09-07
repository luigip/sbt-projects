package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM524_2_2.minimalTransfer

class SRM524_2_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { minimalTransfer(2) should equal (2) }
  test("Case 1") { minimalTransfer(4294967297L) should equal (1) }
  test("Case 2") { minimalTransfer(2147483647L) should equal (2) }
  test("Case 3") { minimalTransfer(1) should equal (1) }
}