package topcoder.manual

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM221_2_1._
import topcoder.SRM221_2_2._

class SRM221_2_TEST extends FunSuite with ShouldMatchers {

  test("SRM 154 250pt") {
    getSubstrings("aaaaaa") should equal (Array("",  "aaaaaa"))
    getSubstrings("abjlkbjalkbjaljsbljbalb") should equal (Array("abjlkbjalkbjaljs",  "bljbalb"))
  }

  test("SRM 154 650pt") {
    simulate(
      Array(0,0,10,10),
      Array(0,10,0,10),
      1
    ) should equal ("0005.0000 0010.0000")

//    simulate(
//      Array(0,0,10,10),
//      Array(0,10,0,10),
//      10
//    ) should equal ("0005.0097 0007.5000")

    simulate(
      Array(0,10,20),
      Array(0,10,0),
      1
    ) should equal ("0015.0000 0005.0000")


  }
}