package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.TCHS027_2._

class TCHS027_2_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { findOrder(
    Array( "DRAGON 10" ),
    Array( "BOAR 1", "ELF 3" )
    ) should equal (Array("DRAGON", "ELF", "BOAR" )) }
  test("Case 1") { findOrder(
    Array( "SWORDSMAN 5", "ARCHER 3" ),
    Array( "CENTAUR 2", "ELF 3" )
    ) should equal (Array("SWORDSMAN", "ELF", "ARCHER", "CENTAUR" )) }
  test("Case 2") { findOrder(
    Array( "ARCHER 5", "PIXIE 3" ),
    Array( "OGRE 10", "WOLF 10", "GOBLIN 3" )
    ) should equal (Array("OGRE", "WOLF", "ARCHER", "GOBLIN", "PIXIE" )) }
  test("Case 3") { findOrder(
    Array( "A 6", "B 7" ),
    Array( )
    ) should equal (Array("B", "A" )) }
}