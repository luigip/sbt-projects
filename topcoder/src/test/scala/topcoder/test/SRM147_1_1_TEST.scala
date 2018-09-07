package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM147_1_1._

class SRM147_1_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { order(5, 3, 2) should equal ("MFMFMFMM") }
  test("Case 1") { order(7, 3, 1) should equal ("FFFMMMMMMM") }
  test("Case 2") { order(25, 25,1000) should equal ("MMMMMFFFFFFMFMFMMMFFMFFFFFFFFFMMMMMMMFFMFMMMFMFMMF") }
  test("Case 3") { order(5, 5, 3) should equal ("MFFMMFFMFM") }
  test("Case 4") { order(1, 0, 245) should equal ("M") }
}