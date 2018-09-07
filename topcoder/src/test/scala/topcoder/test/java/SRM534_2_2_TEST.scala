package topcoder.test.java

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.code.java.SRM534_2_2

class SRM534_2_2_TEST extends FunSuite with ShouldMatchers {

  val I = new SRM534_2_2

  test("Case 0") { I.getWinner(".o...") should equal ("YES") }

  test("Case 1") { I.getWinner("..o..o") should equal ("YES") }

  test("Case 2") { I.getWinner(".o...ooo..oo..") should equal ("NO") }

  test("Case 3") { I.getWinner("......o.ooo.o......") should equal ("YES") }

  test("Case 4") { I.getWinner(".o..o...o....o.....o") should equal ("NO") }

}