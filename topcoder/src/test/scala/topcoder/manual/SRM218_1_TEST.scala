package topcoder.manual

import topcoder.SRM218_1_1._

import org.scalatest.junit.ShouldMatchersForJUnit
import org.scalatest.junit.JUnitSuite
import org.junit.{Test}

class SRM218_1_TEST extends JUnitSuite with ShouldMatchersForJUnit {
  @Test
  def theTest() {
    calculateWaste(
    Array("0 55", "0 47", "1 86"),
    3,
    50 ) should equal (
      Array(48, 14, 0))

    calculateWaste(
    Array("0 93842", "1 493784", "2 43212", "3 99327", "4 456209",
      "5 947243", "6 59348", "7 58237", "8 5834", "9 492384",
      "0 58342", "3 538432", "6 1432", "9 453983", "2 4321",
      "4 583729", "6 6974", "8 9864", "4 43211", "8 38437"),
    10,
    22485) should equal (
      Array(27696,  886,  19922,  14306,  18616,  19612,  44671,  9218,  35805,  20488))
  }


}