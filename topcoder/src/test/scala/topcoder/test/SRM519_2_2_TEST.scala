package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM519_2_2.shortestDistance

class SRM519_2_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { shortestDistance(3, 3, 4, 5,
    Array("1000 1001 1000 1002", "1000 1003 1000 1004", "1000 1005 1000 1006")
    ) should equal (3) }
  test("Case 1") { shortestDistance(0, 0, 20, 20,
    Array("1 1 18 20", "1000 1003 1000 1004", "1000 1005 1000 1006")
    ) should equal (14) }
  test("Case 2") { shortestDistance(0, 0, 20, 20,
    Array("1000 1003 1000 1004", "18 20 1 1", "1000 1005 1000 1006")
    ) should equal (14) }
  test("Case 3") { shortestDistance(10, 10, 10000, 20000,
    Array("1000 1003 1000 1004", "3 3 10004 20002", "1000 1005 1000 1006")
    ) should equal (30) }
  test("Case 4") { shortestDistance(3, 7, 10000, 30000,
    Array("3 10 5200 4900", "12212 8699 9999 30011", "12200 8701 5203 4845")
    ) should equal (117) }
  test("Case 5") { shortestDistance(0, 0, 1000000000, 1000000000,
    Array("0 1 0 999999999", "1 1000000000 999999999 0", "1000000000 1 1000000000 999999999")
    ) should equal (36) }
}