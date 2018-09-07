package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.java.SRM519_2_1

class SRM519_2_1_Java_TEST extends FunSuite with ShouldMatchers {
  
  val I = new SRM519_2_1
  
  test("Case 0") { I.getDay(
    Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    ) should equal ("Saturday") }
  
  test("Case 1") { I.getDay(
    Array("Sunday", "Monday", "Tuesday", "Wednesday", "Friday", "Thursday")
    ) should equal ("Saturday") }
  
  test("Case 2") { I.getDay(
    Array("Sunday", "Monday", "Tuesday", "Thursday", "Friday", "Saturday")
    ) should equal ("Wednesday") }
  
  test("Case 3") { I.getDay(
    Array("Sunday", "Friday", "Tuesday", "Wednesday", "Monday", "Saturday")
    ) should equal ("Thursday") }
}