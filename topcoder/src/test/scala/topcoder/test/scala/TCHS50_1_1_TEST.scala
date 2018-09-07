package topcoder.test.scala

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.code.scala.TCHS50_1_1.gameTime

class TCHS50_1_1_TEST extends FunSuite with ShouldMatchers {

  test("Case 0") { gameTime(1) should equal (1) }

  test("Case 1") { gameTime(3) should equal (2) }

  test("Case 2") { gameTime(4) should equal (3) }

  test("Case 3") { gameTime(14) should equal (7) }

  test("Case 4") { gameTime(100) should equal (18) }

}