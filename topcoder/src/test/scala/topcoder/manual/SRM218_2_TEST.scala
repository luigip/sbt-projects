package topcoder.manual

import org.scalatest.junit.ShouldMatchersForJUnit
import org.scalatest.junit.JUnitSuite
import org.junit.Test
import topcoder.SRM218_2_1
import SRM218_2_1._

class SRM218_2_TEST extends JUnitSuite with ShouldMatchersForJUnit {
  @Test
  def test1 = {
    canAccess(
      Array(0,1,2,3,4,5),
      2
    ) should equal ("DDAAAA")

    canAccess(
      Array(34,78,9,52,11,1),
      49
    ) should equal ("DADADD")

    canAccess(
      Array(),
      20
    ) should equal ("")
  }

}