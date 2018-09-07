package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM419_2_2.getText

class SRM419_2_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { getText(
    Array("type a", "type b", "type c", "undo 3"),
    Array(1, 2, 3, 5)
    ) should equal ("a") }
  test("Case 1") { getText(
    Array("type a", "type b", "undo 2", "undo 2"),
    Array(1,2,3,4)
    ) should equal ("a") }
  test("Case 2") { getText(
    Array("type a", "undo 1", "undo 1"),
    Array(1,2,3)
    ) should equal ("a") }
  test("Case 3") { getText(
    Array("type a", "type b", "type c", "undo 10"),
    Array(1, 2, 3, 1000)
    ) should equal ("abc") }
  test("Case 4") { getText(
    Array("undo 1"),
    Array(1)
    ) should equal ("") }
}