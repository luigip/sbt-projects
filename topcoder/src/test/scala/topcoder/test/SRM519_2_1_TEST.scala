package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM519_2_1.getDay

class SRM519_2_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { getDay(
    Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    ) should equal ("Saturday") }
  test("Case 1") { getDay(
    Array("Sunday", "Monday", "Tuesday", "Wednesday", "Friday", "Thursday")
    ) should equal ("Saturday") }
  test("Case 2") { getDay(
    Array("Sunday", "Monday", "Tuesday", "Thursday", "Friday", "Saturday")
    ) should equal ("Wednesday") }
  test("Case 3") { getDay(
    Array("Sunday", "Friday", "Tuesday", "Wednesday", "Monday", "Saturday")
    ) should equal ("Thursday") }
}