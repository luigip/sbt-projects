package topcoder.manual

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM219_1_1
import SRM219_1_1._

class SRM219_1_TEST extends FunSuite with ShouldMatchers {
  test("250 pt test") {
//    assert(
      val s = selectMeals(
        Array(3, 4),
      Array(2, 8),
      Array(5, 2),
      Array("P", "p", "C", "c", "F", "f", "T", "t")
      )
      s should equal (Array (1,  0,  1,  0,  0,  1,  1,  0)
    )
    
    assert(
      selectMeals(
        Array(18, 86, 76,  0, 34, 30, 95, 12, 21),
        Array(26, 56,  3, 45, 88,  0, 10, 27, 53),
        Array(93, 96, 13, 95, 98, 18, 59, 49, 86),
        Array("f", "Pt", "PT", "fT", "Cp", "C", "t", "",
              "cCp", "ttp", "PCFt", "P", "pCt", "cP", "Pc")
      ) === Array (2,  6,  6,  2,  4,  4,  5,  0,  5,  5,  6,  6,  3,  5,  6)
    )

    selectMeals (
      Array(3,4,1,5),
      Array(2,8,5,1),
      Array(5,2,4,4),
      Array("tFc", "tF", "Ftc")

    ) should equal (Array(3,2,0))
  }


}