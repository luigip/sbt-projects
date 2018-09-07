package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS030_1.getList

class TCHS030_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { getList(
    Array("igor 13 6"), "14 6"
    ) should equal (Array( )) }
  test("Case 1") { getList(
    Array("sasha 12 5"), "12 5"
    ) should equal (Array("sasha" )) }
  test("Case 2") { getList(
    Array("larisa 27 3", "kira 7 4", "max 12 3", "kirill 27 3"), "27 3"
    ) should equal (Array("kirill", "larisa" )) }
  test("Case 3") { getList(
    Array("zoro 31 2", "pokemon 16 12", "spiderman 31 12", "dragon 13 7", "elf 31 12"), "31 12"
    ) should equal (Array("elf", "spiderman" )) }
  test("Case 4") { getList(
    Array("ann 6 6", "tanya 6 6", "gudi 6 6", "ruslik 6 6", "alla 6 6", "serge 10 10"), "6 6"
    ) should equal (Array("alla", "ann", "gudi", "ruslik", "tanya" )) }
  test("Case 5") { getList(
    Array("ahdjakdd 31 12", "fhdfjha 1 1", "wefhjks 13 6", "fkajahsdaaajj 6 7"), "5 12"
    ) should equal (Array( )) }
}