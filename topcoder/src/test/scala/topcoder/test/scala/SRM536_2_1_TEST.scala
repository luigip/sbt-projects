package topcoder.test.scala

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.code.scala.SRM536_2_1.countRoots

class SRM536_2_1_TEST extends FunSuite with ShouldMatchers {

  test("Case 0") { countRoots(
    Array(1, 0, 1)
    ) should equal (1) }

  test("Case 1") { countRoots(
    Array(0, 1, 0, 1)
    ) should equal (2) }

  test("Case 2") { countRoots(
    Array(1)
    ) should equal (0) }

  test("Case 3") { countRoots(
    Array(1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1)
    ) should equal (0) }

  test("Case 4") { countRoots(
    Array(1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0,
          0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1)
    ) should equal (1) }

}