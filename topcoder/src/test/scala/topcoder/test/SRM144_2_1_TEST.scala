package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM144_2_1._

class SRM144_2_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { whatTime(0) should equal ("0:0:0") }
  test("Case 1") { whatTime(3661) should equal ("1:1:1") }
  test("Case 2") { whatTime(5436) should equal ("1:30:36") }
  test("Case 3") { whatTime(86399) should equal ("23:59:59") }
}