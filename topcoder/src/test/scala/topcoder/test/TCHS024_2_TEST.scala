package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS024_2._

class TCHS024_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { complete("AB.AC.", "ABD..E") should equal (Array("ABDACE", "ABDACE" )) }
  test("Case 1") { complete("ABC...", "DEF...") should equal (Array("ABCDEF", "DEFABC" )) }
  test("Case 2") { complete("......", "......") should equal (Array("AAAAAA", "AAAAAA" )) }
  test("Case 3") { complete("TOPCODER", "D.E..TR.") should equal (Array("TOPCODER", "DCEOOTRP" )) }
  test("Case 4") { complete("ABC.", "DEF.") should equal (Array( )) }
  test("Case 5") { complete("TEFAT..PVSKKJT.QBJEB..NPN..NBL", "...B...E.ND.LNE...HW.ANTB.TKBD") should equal (Array("TEFATAAPVSKKJTAQBJEBDDNPNHWNBL", "AAABFJJEKNDPLNEPQSHWTANTBVTKBD" )) }
}