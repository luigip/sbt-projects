package topcoder.test.java

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.code.java.TCHS032_1

class TCHS032_1_TEST extends FunSuite with ShouldMatchers {

  val I = new TCHS032_1

  test("Case 0") { I.winner(
    Array("9191", "9911"), 38
    ) should equal (1) }

  test("Case 1") { I.winner(
    Array("23", "1254", "81111", "3141"), 24
    ) should equal (1) }

  test("Case 2") { I.winner(
    Array("1234", "1144", "4411", "2323", "4321"), 100
    ) should equal (0) }

  test("Case 3") { I.winner(
    Array("1", "112", "1113"), 12
    ) should equal (2) }

  test("Case 4") { I.winner(
    Array("1234", "2341", "3412", "4123", "4321"), 24
    ) should equal (3) }

  test("Case 5") { I.winner(
    Array("88", "99", "77"), 12
    ) should equal (0) }

}