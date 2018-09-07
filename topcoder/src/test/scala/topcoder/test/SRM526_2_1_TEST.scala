package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM526_2_1.howMany

class SRM526_2_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { howMany("AAAAA") should equal (Array(1, 1, 1, 1, 1 )) }
  test("Case 1") { howMany("AAABBB") should equal (Array(2, 2, 2, 1, 1, 1 )) }
  test("Case 2") { howMany("CAAAAAC") should equal (Array(2, 2, 2, 2, 2, 2, 1 )) }
  test("Case 3") { howMany("BBCA") should equal (Array(3, 3, 2, 1 )) }
  test("Case 4") { howMany("BACACABCBBBBCAAAAACCCABBCAA") should equal (
    Array(3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
          3, 2, 1, 1 )) }
}