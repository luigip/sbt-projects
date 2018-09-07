//package laptoptc.test
//
//import org.scalatest.FunSuite
//import org.scalatest.matchers.ShouldMatchers
//import laptoptc.SRM529_2_2.getSortedList
//
//class SRM529_2_2_TEST extends FunSuite with ShouldMatchers {
//  test("Case 0") { getSortedList(
//    Array("Louis IX", "Louis VIII")
//    ) should equal (Array("Louis VIII", "Louis IX" )) }
//  test("Case 1") { getSortedList(
//    Array("Louis IX", "Philippe II")
//    ) should equal (Array("Louis IX", "Philippe II" )) }
//  test("Case 2") { getSortedList(
//    Array("Richard III", "Richard I", "Richard II")
//    ) should equal (Array("Richard I", "Richard II", "Richard III" )) }
//  test("Case 3") { getSortedList(
//    Array("John X", "John I", "John L", "John V")
//    ) should equal (Array("John I", "John V", "John X", "John L" )) }
//  test("Case 4") { getSortedList(
//    Array("Philippe VI", "Jean II", "Charles V", "Charles VI", "Charles VII", "Louis XI")
//    ) should equal (
//    Array("Charles V",
//          "Charles VI",
//          "Charles VII",
//          "Jean II",
//          "Louis XI",
//          "Philippe VI" )) }
//  test("Case 5") { getSortedList(
//    Array("Philippe II", "Philip II")
//    ) should equal (Array("Philip II", "Philippe II" )) }
//}