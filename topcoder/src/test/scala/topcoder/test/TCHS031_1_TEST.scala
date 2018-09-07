package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS031_1.bestRoute

class TCHS031_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { bestRoute(
    Array("1 A","2 B", "3 C"),
    Array()
    ) should equal (6) }
  test("Case 1") { bestRoute(
    Array("1 A", "2 B", "3 C"),
    Array("5 A", "2 B", "1 C")
    ) should equal (14) }
  test("Case 2") { bestRoute(
    Array("1 NJTPK","2 B","3 C"),
    Array("1 NJTPK", "2 GSP")
    ) should equal (7) }
  test("Case 3") { bestRoute(
    Array("1 A","2 B", "3 C"),
    Array("4 D", "5 E", "6 F")
    ) should equal (6) }
  test("Case 4") { bestRoute(
    Array("55 RTNONE",
          "64 RTNFVE",
          "8 CBRONX",
          "5 GWB",
          "44 NJTPK", 
          "30 RTONE"),
    Array("23 RTNFVE","57 GSP",
         "24 GWB","12 BRUCK",
         "94 NJTPK","12 RTONE",
         "39 TAPPAN","24 LIE",
         "30 HTUNL","5 LTUNL")
    ) should equal (359) }
}