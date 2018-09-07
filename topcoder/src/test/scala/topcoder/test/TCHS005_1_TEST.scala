package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS005_1._

class TCHS005_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { calcSize(52, 9, 16) should equal (Array(25, 45 )) }
  test("Case 1") { calcSize(7, 2, 3) should equal (Array(3, 5 )) }
  test("Case 2") { calcSize(13, 7, 10) should equal (Array(7, 10 )) }
  test("Case 3") { calcSize(7, 32, 47) should equal (Array(3, 5 )) }
  test("Case 4") { calcSize(11, 15, 16) should equal (Array(7, 8 )) }
}