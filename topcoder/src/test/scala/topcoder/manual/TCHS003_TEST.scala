package topcoder.manual

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

import topcoder.TCHS003_2
import TCHS003_2._

class TCHS003_TEST extends FunSuite with ShouldMatchers {
  test("450 pt") {
    getCheater(Array("e", "ello"), Array("el", "hello"), Array("ell", "ello")) should
      equal (2)
    getCheater(Array("de","coder","topcoder"), Array("der","pcoder","tipcoder"), Array("oder","opcoder","cheatcoder")) should
      equal (1)
    getCheater(Array("world","sworld"), Array("word"), Array("sword")) should
      equal (1)
    getCheater(Array(""), Array(), Array()) should
      equal (-1)
    getCheater(Array(""), Array(""), Array("")) should
      equal (1)
//    getCheater(Array(), Array(), Array()) should
//      equal ()
  }
}