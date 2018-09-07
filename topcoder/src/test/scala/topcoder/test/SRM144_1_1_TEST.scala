package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM144_1_1._

class SRM144_1_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { decode("123210122") should equal (Array( "011100011",  "NONE" )) }
  test("Case 1") { decode("11") should equal (Array( "01",  "10" )) }
  test("Case 2") { decode("22111") should equal (Array( "NONE",  "11001" )) }
  test("Case 3") { decode("123210120") should equal (Array( "NONE",  "NONE" )) }
  test("Case 4") { decode("3") should equal (Array( "NONE",  "NONE" )) }
  test("Case 5") { decode("12221112222221112221111111112221111") should equal (
    Array( "01101001101101001101001001001101001",
           "10110010110110010110010010010110010" )) }
}