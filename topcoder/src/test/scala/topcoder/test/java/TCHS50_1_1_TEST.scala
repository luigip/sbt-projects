package topcoder.test.java

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.code.java.TCHS50_1_1

class TCHS50_1_1_TEST extends FunSuite with ShouldMatchers {

  val I = new TCHS50_1_1

  test("Case 0") { I.gameTime(1) should equal (1) }

  test("Case 1") { I.gameTime(3) should equal (2) }

  test("Case 2") { I.gameTime(4) should equal (3) }

  test("Case 3") { I.gameTime(14) should equal (7) }

  test("Case 4") { I.gameTime(100) should equal (18) }

}