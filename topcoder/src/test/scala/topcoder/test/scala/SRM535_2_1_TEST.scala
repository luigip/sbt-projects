package topcoder.test.scala

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.code.scala.SRM535_2_1.get

class SRM535_2_1_TEST extends FunSuite with ShouldMatchers {

  test("Case 0") { get(1, -2, 3, 4) should equal (Array(2, 1, 3 )) }

  test("Case 1") { get(0, 0, 5, 5) should equal (Array( )) }

  test("Case 2") { get(10, -23, -10, 3) should equal (Array(0, -10, 13 )) }

  test("Case 3") { get(-27, 14, 13, 22) should equal (Array( )) }

  test("Case 4") { get(30, 30, 30, -30) should equal (Array(30, 0, -30 )) }

}