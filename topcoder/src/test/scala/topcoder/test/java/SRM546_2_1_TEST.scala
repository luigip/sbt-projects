package topcoder.test.java

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.code.java.SRM546_2_1

class SRM546_2_1_TEST extends FunSuite with ShouldMatchers {

  val I = new SRM546_2_1

  test("Case 0") { I.getWinner(
    Array(4,7,4,1)
    ) should equal (4) }

  test("Case 1") { I.getWinner(
    Array(10,20,30,40,50)
    ) should equal (10) }

  test("Case 2") { I.getWinner(
    Array(123,123,456,456,456,123)
    ) should equal (456) }

  test("Case 3") { I.getWinner(
    Array(1,2,2,3,3,3,4,4,4,4)
    ) should equal (4) }

}