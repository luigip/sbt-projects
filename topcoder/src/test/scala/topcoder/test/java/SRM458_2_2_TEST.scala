package topcoder.test.java

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.code.java.SRM458_2_2

class SRM458_2_2_TEST extends FunSuite with ShouldMatchers {

  val I = new SRM458_2_2

  test("Case 0") { I.minLevel(
    Array(9, 5, 11)
    ) should equal (3) }

  test("Case 1") { I.minLevel(
    Array(5, 8)
    ) should equal (0) }

  test("Case 2") { I.minLevel(
    Array(1, 1, 1, 1, 1)
    ) should equal (4) }

  test("Case 3") { I.minLevel(
    Array(548, 47, 58, 250, 2012)
    ) should equal (251) }

  test("System test") { I.minLevel(
    Array(1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000)
    ) should equal(25) }
  
}