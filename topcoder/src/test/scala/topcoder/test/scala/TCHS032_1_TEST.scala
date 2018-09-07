package topcoder.test.scala

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.code.scala.TCHS032_1.winner

class TCHS032_1_TEST extends FunSuite with ShouldMatchers {

  test("Case 0") { winner(
    Array("9191", "9911"), 38
    ) should equal (1) }

  test("Case 1") { winner(
    Array("23", "1254", "81111", "3141"), 24
    ) should equal (1) }

  test("Case 2") { winner(
    Array("1234", "1144", "4411", "2323", "4321"), 100
    ) should equal (0) }

  test("Case 3") { winner(
    Array("1", "112", "1113"), 12
    ) should equal (2) }

  test("Case 4") { winner(
    Array("1234", "2341", "3412", "4123", "4321"), 24
    ) should equal (3) }

  test("Case 5") { winner(
    Array("88", "99", "77"), 12
    ) should equal (0) }

}