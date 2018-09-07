package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM526_2_2.minimumTime

class SRM526_2_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { minimumTime(
    Array(".o",
          "o.")
    ) should equal (1) }
  test("Case 1") { minimumTime(
    Array(".o...",
          "..o..",
          "....o")
    ) should equal (3) }
  test("Case 2") { minimumTime(
    Array("o..........",
          "..o........",
          ".......o...",
          "...........",
          "...........",
          "...........",
          "........o..",
          "...........")
    ) should equal (16) }
  test("Case 3") { minimumTime(
    Array(".........",
          "....o....",
          ".........")
    ) should equal (0) }
  test("Case 4") { minimumTime(
    Array("...o..........................",
          "............................o.",
          ".o............................",
          "............o.................",
          ".................o............",
          "......................o.......",
          "......o.......................",
          "....o.........................",
          "...............o..............",
          ".......................o......",
          "...........................o..",
          ".......o......................")
    ) should equal (99) }
}