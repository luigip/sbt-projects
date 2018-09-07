package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM145_2_1._

class SRM145_2_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { count("BW",
    Array("AAAAAAAA",
          "ABWBWBWA",
          "AWBWBWBA",
          "ABWBWBWA",
          "AWBWBWBA",
          "AAAAAAAA")
    ) should equal (24) }
  test("Case 1") { count("BW",
    Array("BBBBBBBB",
          "BBWBWBWB",
          "BWBWBWBB",
          "BBWBWBWB",
          "BWBWBWBB",
          "BBBBBBBB")
    ) should equal (48) }
  test("Case 2") { count("ACEGIKMOQSUWY",
    Array("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
          "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
          "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
          "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
          "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
          "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX")
    ) should equal (150) }
  test("Case 3") { count("CA",
    Array("BBBBBBB",
          "BBBBBBB",
          "BBBBBBB")
    ) should equal (0) }
  test("Case 4") { count("DCBA",
    Array("ACBD")
    ) should equal (4) }
}