package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS028_1._

class TCHS028_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { swaptions("RGBRBR", "BRBGRG") should equal (1) }
  test("Case 1") { swaptions("RGRGR", "GRG") should equal (2) }
  test("Case 2") { swaptions("BGBGBGBG", "RBRBRBRBRB") should equal (0) }
  test("Case 3") { swaptions("RBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRB", "BRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBRBR") should equal (1152) }
  test("Case 4") { swaptions("BRGBRGBRBRBGRBRBRBGRGBRGBRGBRGBRGB", "RBGBGBRBRBGRGBRBRBGRBGRBGBGBRBGBRBGRGRGBRBRBR") should equal (41) }
}