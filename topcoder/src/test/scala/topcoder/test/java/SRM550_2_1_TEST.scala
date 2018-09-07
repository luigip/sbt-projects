package topcoder.test.java

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.code.java.SRM550_2_1

class SRM550_2_1_TEST extends FunSuite with ShouldMatchers {

  val I = new SRM550_2_1

  test("Case 0") { I.isItPossible("aababba", "bbbbbbb", 2) should equal ("IMPOSSIBLE") }

  test("Case 1") { I.isItPossible("aabb", "aabb", 1) should equal ("IMPOSSIBLE") }

  test("Case 2") { I.isItPossible("aaaaabaa", "bbbbbabb", 8) should equal ("POSSIBLE") }

  test("Case 3") { I.isItPossible("aaa", "bab", 4) should equal ("POSSIBLE") }

  test("Case 4") { I.isItPossible("aababbabaa", "abbbbaabab", 9) should equal ("IMPOSSIBLE") }

}