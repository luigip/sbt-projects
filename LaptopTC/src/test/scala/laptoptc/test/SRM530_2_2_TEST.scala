//package laptoptc.test
//
//import org.scalatest.FunSuite
//import org.scalatest.matchers.ShouldMatchers
//import laptoptc.SRM530_2_2.solve
//
//class SRM530_2_2_TEST extends FunSuite with ShouldMatchers {
//  test("Case 0") { solve(
//    Array("X.X"
//         ,"..."
//         ,"..."
//         ,"X.X"),
//    Array(".X"
//         ,".."
//         ,"X.")
//    ) should equal ("YES") }
//  test("Case 1") { solve(
//    Array("..XX"
//         ,"...X"
//         ,"X..."
//         ,"XX.."),
//    Array(".."
//         ,"..")
//    ) should equal ("NO") }
//  test("Case 2") { solve(
//    Array("...X..."),
//    Array("...")
//    ) should equal ("YES") }
//  test("Case 3") { solve(
//    Array(".X."
//         ,"X.X"
//         ,".X."),
//    Array(".")
//    ) should equal ("YES") }
//  test("Case 4") { solve(
//    Array("XXXXXXX"
//         ,"X.....X"
//         ,"X.....X"
//         ,"X.....X"
//         ,"XXXXXXX"),
//    Array(".X."
//         ,"XXX"
//         ,".X.")
//    ) should equal ("NO") }
//  test("Case 5") { solve(
//    Array(".."
//         ,"X."
//         ,".X"),
//    Array(".."
//         ,".X"
//         ,"X.")
//    ) should equal ("NO") }
//  test("Case 6") { solve(
//    Array("X.."
//         ,".XX"
//         ,".XX"),
//    Array(".XX"
//         ,".XX"
//         ,"X..")
//    ) should equal ("NO") }
//}