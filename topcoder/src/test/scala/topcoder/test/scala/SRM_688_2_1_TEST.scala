package topcoder.test.scala

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.code.scala.SRM_688_2_1.getDepth

class SRM_688_2_1_TEST extends FunSuite with ShouldMatchers {

  test("Case 0") { getDepth("(())") should equal (2) }

  test("Case 1") { getDepth("()()()") should equal (1) }

  test("Case 2") { getDepth("(())()") should equal (2) }

  test("Case 3") { getDepth("((())())(((())(()))())") should equal (4) }

  test("Case 4") { getDepth("()") should equal (1) }

}