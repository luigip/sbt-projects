package topcoder.manual

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

import topcoder.{TCHS070_2, TCHS070_1}
import TCHS070_2._
import TCHS070_1._
class TCHS070_TEST extends FunSuite with ShouldMatchers {
  test("250 pt") {
    getPoints(Array(10,20,30), Array(10,10,5)) should equal (9)
    getPoints(Array(8, 16, 32), Array(10,10,5)) should equal (9)
    getPoints(Array(60, 59), Array(24, 24)) should equal (5)
    getPoints(Array(47, 42, 37, 30, 27, 21, 18), Array(1, 2, 3, 4, 5, 6, 7)) should equal (100)
    getPoints(Array(0, 1000000, 5000, 1000000), Array(1, 2, 1000000, 4)) should equal (750000)
  }

  test("500 pt") {
    terminalTimes(Array(2,1,2,4)) should equal (Array(5,2,6,9))
    terminalTimes(Array(1,2,3)) should equal (Array(1,4,6))
    terminalTimes(Array(3, 2, 2, 1)) should equal (Array(8, 6, 7, 4))
    terminalTimes(Array(2, 4, 7, 7, 3, 2, 9, 10, 5, 8, 10, 1, 5, 7, 6, 8, 10, 4, 9, 7, 10, 4, 3, 9)
    ) should equal (Array(25, 69, 118, 119, 51, 30, 140, 147, 92, 133, 148, 12, 95, 124, 111, 135,
 149, 82, 144, 128, 150, 86, 67, 146))
  }
}