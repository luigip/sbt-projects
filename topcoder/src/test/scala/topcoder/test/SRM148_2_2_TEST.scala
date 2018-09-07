package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM148_2_2._

class SRM148_2_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { decipher("AAAAA",
    Array("A:B","B:C","A:D")
    ) should equal ("CCCCC") }
  test("Case 1") { decipher("ABCDE",
    Array("A:B","B:C","C:D","D:E","E:A")
    ) should equal ("AEBCD") }
  test("Case 2") { decipher("IHWSIOTCHEDMYKEYCAPSARWUND",
    Array("W:O","W:I")
    ) should equal ("WHOSWITCHEDMYKEYCAPSAROUND") }
}