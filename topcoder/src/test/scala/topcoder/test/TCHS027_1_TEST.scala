package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS027_1._

class TCHS027_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { createPattern("L") should equal (Array("x.......x", "xx..xx..x", "x.......x" )) }
  test("Case 1") { createPattern("P=NP?") should equal (
    Array("x.......x",
          "xx.x....x",
          "x.xxxx.xx",
          "xx..xxx.x",
          "xx.x....x",
          "x.xxxxxxx",
          "x.......x" )) }
  test("Case 2") { createPattern("") should equal (Array("x.......x", "x.......x" )) }
}