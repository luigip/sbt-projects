package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS006_1._

class TCHS006_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { waysToInterpret("21:23:01") should equal (2) }
  test("Case 1") { waysToInterpret("00:00:00") should equal (0) }
  test("Case 2") { waysToInterpret("01:02:03") should equal (6) }
  test("Case 3") { waysToInterpret("59:59:01") should equal (2) }
  test("Case 4") { waysToInterpret("01:01:59") should equal (4) }
}