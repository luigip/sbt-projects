package topcoder.test.java

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.code.java.SRM458_2_1

class SRM458_2_1_TEST extends FunSuite with ShouldMatchers {

  val I = new SRM458_2_1

  test("Case 0") { I.minDucks(
    Array(5, 8)
    ) should equal (2) }

  test("Case 1") { I.minDucks(
    Array(4, 7, 4, 7, 4)
    ) should equal (6) }

  test("Case 2") { I.minDucks(
    Array(17, 17, 19, 23, 23, 19, 19, 17, 17)
    ) should equal (12) }

  test("Case 3") { I.minDucks(
    Array(50)
    ) should equal (1) }

  test("Case 4") { I.minDucks(
    Array(10, 10, 10, 10, 10)
    ) should equal (5) }

}