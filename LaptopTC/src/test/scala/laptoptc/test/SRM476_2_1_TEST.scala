package laptoptc.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import laptoptc.SRM476_2_1.minimumShifts

class SRM476_2_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { minimumShifts(
    Array("136",
          "427",
          "568",
          "309"), 2
    ) should equal (2) }
  test("Case 1") { minimumShifts(
    Array("0000",
          "0000",
          "0099"), 9
    ) should equal (2) }
  test("Case 2") { minimumShifts(
    Array("0123456789"), 7
    ) should equal (3) }
  test("Case 3") { minimumShifts(
    Array("555",
          "555"), 1
    ) should equal (-1) }
  test("Case 4") { minimumShifts(
    Array("12417727123",
          "65125691886",
          "55524912622",
          "12261288888"), 9
    ) should equal (6) }
}