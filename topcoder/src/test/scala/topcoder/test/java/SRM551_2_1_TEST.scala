package topcoder.test.java

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.code.java.SRM551_2_1

class SRM551_2_1_TEST extends FunSuite with ShouldMatchers {

  val I = new SRM551_2_1

  test("Case 0") { I.countLayouts("ABAB") should equal (2) }

  test("Case 1") { I.countLayouts("AAA") should equal (1) }

  test("Case 2") { I.countLayouts("WXYZ") should equal (0) }

}