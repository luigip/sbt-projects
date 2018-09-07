package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM147_2_1._

class SRM147_2_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { decode("VQREQFGT", 2) should equal ("TOPCODER") }
  test("Case 1") { decode("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 10 ) should equal ("QRSTUVWXYZABCDEFGHIJKLMNOP") }
  test("Case 2") { decode("TOPCODER", 0) should equal ("TOPCODER") }
  test("Case 3") { decode("ZWBGLZ", 25) should equal ("AXCHMA") }
  test("Case 4") { decode("DBNPCBQ", 1) should equal ("CAMOBAP") }
  test("Case 5") { decode("LIPPSASVPH", 4) should equal ("HELLOWORLD") }
}