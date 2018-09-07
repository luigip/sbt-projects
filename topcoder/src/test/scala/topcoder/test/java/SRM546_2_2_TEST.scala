package topcoder.test.java

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.code.java.SRM546_2_2

class SRM546_2_2_TEST extends FunSuite with ShouldMatchers {

  val I = new SRM546_2_2

  test("Case 0") { I.describeIntersection(
//    Array(0,0,3,2),
    Array(3,0,6,2),
    Array(1,1,5,3)
    ) should equal ("rectangle") }

  test("Case 1") { I.describeIntersection(
    Array(0,0,5,3),
    Array(1,2,2,3)
    ) should equal ("rectangle") }

  test("Case 2") { I.describeIntersection(
    Array(1,1,6,2),
    Array(3,2,5,4)
    ) should equal ("segment") }

  test("Case 3") { I.describeIntersection(
    Array(0,1,2,3),
    Array(2,0,5,2)
    ) should equal ("segment") }

  test("Case 4") { I.describeIntersection(
    Array(0,0,1,1),
    Array(1,1,5,2)
    ) should equal ("point") }

  test("Case 5") { I.describeIntersection(
    Array(1,1,2,2),
    Array(3,1,4,2)
    ) should equal ("none") }

}