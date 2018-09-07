package topcoder.manual

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM219_2_1._

class SRM219_2_TEST extends FunSuite with ShouldMatchers {
  maxPercent(500,10,600) should equal(10)
  maxPercent(500, 10, 604) should equal (10)
  maxPercent(850, 8, 870) should equal (-1)
  maxPercent(123, 52, 696) should equal (415)
  maxPercent(500, 10, 550) should equal (0)
}