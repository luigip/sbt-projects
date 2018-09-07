package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM523_2_2.countThem

class SRM523_2_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { countThem(1, 1, 1, 2, 1000) should equal (1000) }
  test("Case 1") { countThem(3, 3, 1, 2, 1000) should equal (343) }
  test("Case 2") { countThem(40, 77, 40, 100000, 40) should equal (1) }
  test("Case 3") { countThem(452, 24, 4, 5, 600) should equal (10) }
  test("Case 4") { countThem(234, 24, 377, 1, 10000) should equal (408) }
}