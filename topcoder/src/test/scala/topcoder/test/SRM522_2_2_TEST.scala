package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM522_2_2.getWinner

class SRM522_2_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { getWinner("ABBB") should equal ("Alice") }
  test("Case 1") { getWinner("BBBB") should equal ("Bob") }
  test("Case 2") { getWinner("BA") should equal ("Alice") }
  test("Case 3") { getWinner("BABBABBB") should equal ("Bob") }
  test("Case 4") { getWinner("ABABBBABAABBAA") should equal ("Alice") }
  test("Case 5") { getWinner("BBBAAABBAAABBB") should equal ("Bob") }
}