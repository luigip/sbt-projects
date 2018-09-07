package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS029_2.shortestRoute

class TCHS029_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { shortestRoute(100,
    Array(10,50),
    Array(60,90),
    Array(40,20)
    ) should equal (80) }
  test("Case 1") { shortestRoute(1000,
    Array(),
    Array(),
    Array()
    ) should equal (1000) }
  test("Case 2") { shortestRoute(150,
    Array(0,0,50,100,110),
    Array(50,50,100,151,140),
    Array(10,20,10,10,90)
    ) should equal (70) }
  test("Case 3") { shortestRoute(900,
    Array(0,20,80,50,160,140,420,450),
    Array(10,60,190,70,180,160,901,900),
    Array(9,45,100,15,14,14,5,0)
    ) should equal (432) }
}