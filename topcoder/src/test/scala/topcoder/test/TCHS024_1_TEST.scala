package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS024_1._

class TCHS024_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { getScore(
    Array("red", "fox", "lazy", "dogs"),
    Array(25, 25, 25, 25), "the quick brown fox jumped over the lazy dog"
    ) should equal (50) }
  test("Case 1") { getScore(
    Array("red", "fox", "lazy", "dogs"),
    Array(25, 25, 25, 25), "highschool matches are nice"
    ) should equal (0) }
  test("Case 2") { getScore(
    Array("red", "fox", "lazy", "dogs"),
    Array(1, 2, 3, 4), "lazy lazy lazy lazy"
    ) should equal (3) }
  test("Case 3") { getScore(
    Array("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
          "n", "o", "p", "q", "r", "s", "t", "u", "v", "x", "y", "z"),
    Array(1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000,
          1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000), "a b c d e f g h i j k l m n o p q r s t u v x y z"
    ) should equal (25000) }
}