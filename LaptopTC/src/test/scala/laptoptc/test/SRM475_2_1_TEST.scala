package laptoptc.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import laptoptc.SRM475_2_1.getWinner

class SRM475_2_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { getWinner(
    Array( "Alice", "Bill", "Carol", "Dick" ),
    Array( "Bill", "Dick", "Alice", "Alice" )
    ) should equal ("Alice") }
  test("Case 1") { getWinner(
    Array( "Alice", "Bill", "Carol", "Dick" ),
    Array( "Carol", "Carol", "Bill", "Bill" )
    ) should equal ("") }
  test("Case 2") { getWinner(
    Array( "Alice", "Bill", "Carol", "Dick" ),
    Array( "Alice", "Alice", "Bill", "Bill" )
    ) should equal ("Bill") }
  test("Case 3") { getWinner(
    Array( "Alice", "Bill" ),
    Array( "Alice", "Bill" )
    ) should equal ("") }
  test("Case 4") { getWinner(
    Array( "WhiteRabbit", "whiterabbit", "whiteRabbit", "Whiterabbit" ),
    Array( "whiteRabbit", "whiteRabbit", "whiteRabbit", "WhiteRabbit" )
    ) should equal ("whiteRabbit") }
}