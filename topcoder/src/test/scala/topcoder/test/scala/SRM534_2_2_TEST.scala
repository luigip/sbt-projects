package topcoder.test.scala

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.code.scala.SRM534_2_2.getWinner

class SRM534_2_2_TEST extends FunSuite with ShouldMatchers {

  test("Case 0") { getWinner(".o...") should equal ("YES") }

  test("Case 1") { getWinner("..o..o") should equal ("YES") }

  test("Case 2") { getWinner(".o...ooo..oo..") should equal ("NO") }

  test("Case 3") { getWinner("......o.ooo.o......") should equal ("YES") }

  test("Case 4") { getWinner(".o..o...o....o.....o") should equal ("NO") }

}