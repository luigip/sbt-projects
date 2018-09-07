package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS030_2.whoIsWho

class TCHS030_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { whoIsWho(
    Array("a b c", "c a d"),
    Array("a b c f", "c a d e")
    ) should equal (Array(4, 2, 0 )) }
  test("Case 1") { whoIsWho(
    Array("abc abcd"),
    Array("abcde")
    ) should equal (Array(2, 1, 0 )) }
  test("Case 2") { whoIsWho(
    Array("a b cd", "qq ee rre"),
    Array("a b c d e", "a cd t q", "a cd t", "qq ee q")
    ) should equal (Array(6, 2, 3 )) }
  test("Case 3") { whoIsWho(
    Array("a"),
    Array("a b c", "a b c d", "a b c d")
    ) should equal (Array(1, 0, 3 )) }
  test("Case 4") { whoIsWho(
    Array("alex", "serge", "vitalik"),
    Array()
    ) should equal (Array(3, 0, 0 )) }
  test("Case 5") { whoIsWho(
    Array(),
    Array("dmitry victor", "dmitry", "victor")
    ) should equal (Array(0, 2, 0 )) }
  test("Case 6") { whoIsWho(
    Array(),
    Array()
    ) should equal (Array(0, 0, 0 )) }
}