package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS023_1._

class TCHS023_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { numberOfPictures(
    Array("picture"), 100
    ) should equal (1) }
  test("Case 1") { numberOfPictures(
    Array("picture", "canvas"), 2
    ) should equal (2) }
  test("Case 2") { numberOfPictures(
    Array("picture", "canvas", "picture", "canvas", "picture"), 2
    ) should equal (2) }
  test("Case 3") { numberOfPictures(
    Array("picture", "canvas", "picture", "canvas", "picture"), 3
    ) should equal (4) }
  test("Case 4") { numberOfPictures(
    Array("a","a","A","a","A","A"), 3
    ) should equal (4) }
}