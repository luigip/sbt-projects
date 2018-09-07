package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM523_2_1.doesItExist

class SRM523_2_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { doesItExist(
    Array("ABCDEFGHIJKLMNOPQRSTUVWXYZ")
    ) should equal ("YES") }
  test("Case 1") { doesItExist(
    Array("ADEHI..Z",
          "BCFGJK.Y",
          ".PONML.X",
          ".QRSTUVW")
    ) should equal ("YES") }
  test("Case 2") { doesItExist(
    Array("ACBDEFGHIJKLMNOPQRSTUVWXYZ")
    ) should equal ("NO") }
  test("Case 3") { doesItExist(
    Array("ABC.......",
          "...DEFGHIJ",
          "TSRQPONMLK",
          "UVWXYZ....")
    ) should equal ("NO") }
  test("Case 4") { doesItExist(
    Array("..............",
          "..............",
          "..............",
          "...DEFGHIJK...",
          "...C......L...",
          "...B......M...",
          "...A......N...",
          "..........O...",
          "..ZY..TSRQP...",
          "...XWVU.......",
          "..............")
    ) should equal ("YES") }
}