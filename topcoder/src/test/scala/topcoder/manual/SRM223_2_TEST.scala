package topcoder.manual

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM223_2_1._
import topcoder.SRM223_2_2._

class SRM223_2_TEST extends FunSuite with ShouldMatchers {

  test("SRM158 250") {
    bestItem(Array(100,120,150,1000), Array(110,110,200,2000), Array(20,100,50,3),
      Array("Video Card","256M Mem","CPU/Mobo combo","Complete machine")) should
      equal ("Complete machine")

    bestItem(Array(100), Array(100), Array(134), Array("Service, at cost")) should
    equal ("")

    bestItem(Array(10, 10), Array(11, 12), Array(2,1), Array("A", "B")) should
    equal ("A")
  }

  test("SRM158 500") {
    cut("BRBRBR") should equal(0)
    cut("RBRBRB") should equal(1)
    cut("BBBRRRRB") should equal(7)
    cut("RBRBBRRRRBBBRBBRRBRBBRRRBRBBBRBRBRBRBRRB") should equal (9)
    cut("BR") should equal(0)
  }

}