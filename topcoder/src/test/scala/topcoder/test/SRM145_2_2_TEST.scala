package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM145_2_2._

class SRM145_2_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { getPercentages("00:30:00") should equal (99) }
  test("Case 1") { getPercentages("00:28:00") should equal (19) }
  test("Case 2") { getPercentages("23:59:59") should equal (0) }
  test("Case 3") { getPercentages("00:14:10") should equal (49) }
  test("Case 4") { getPercentages("00:19:16") should equal (3) }
}