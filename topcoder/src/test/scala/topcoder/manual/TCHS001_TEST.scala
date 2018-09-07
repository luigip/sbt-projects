package topcoder.manual

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.{TCHS001_1, TCHS001_2}
import TCHS001_1._
import TCHS001_2._

class TCHS001_TEST extends FunSuite with ShouldMatchers {
  test("250 pt") {
    averageSpeed(1,50,Array(45, 40, 50)) should equal(45.0)
    averageSpeed(1,50,Array(42,43,44,45,46,47,48,49,50,51)) should equal(46.0)
    averageSpeed(1,50,Array(42,46,48,50,52)) should equal(0.0)
    averageSpeed(20,60,Array(25,45,45,43,24,9,51,55,60,34,61,23,40,40,47,49,33,23,47,54,54)
      ) should equal(41.68421052631579)
  }

  test("500pt #0") {language(Array("a30b30c40","a20b40c40"), Array("aa bbbb cccc")) should
    equal (0.0)}
  test("500pt #2") {language(Array("a10b10c10d10e10f50"), Array("abcde g")) should
    be (10.8 plusOrMinus 1e-9)}
  test("500pt #3") {language(Array("a09b01c03d05e20g01h01i08l06n08o06r07s09t08u07x01"
,"a14b02c05d06e15g01h01i07l05n07o10r08s09t05u04x01"), Array("this text is in english"
,"the letter counts should be close to"
,"that in the table")) should
    be (130.6578 plusOrMinus 1e-9)}
  test("500pt #4") {language(Array("a09b01c03d05e20g01h01i08l06n08o06r07s09t08u07x01"
,"a14b02c05d06e15g01h01i07l05n07o10r08s09t05u04x01"), Array("en esta es una oracion en castellano"
,"las ocurrencias de cada letra"
,"deberian ser cercanas a las dadas en la tabla")) should
    be (114.9472 plusOrMinus 1e-9)}
    test("500pt cust") {language(Array("a10b90"), Array("a","bbb bbbbb b")) should
    be (0.0 plusOrMinus 1e-9)}
}