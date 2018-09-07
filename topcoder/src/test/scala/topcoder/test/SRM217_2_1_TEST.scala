package topcoder.test

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM217_2_1._

class SRM217_2_1_TEST extends FunSuite with ShouldMatchers {
  test("Case 0") { maximalDistance(
    Array(100),
    Array(10000), 10000) should be (100.0 plusOrMinus 1E-9) }
  test("Case 1") { maximalDistance(
    Array(70, 80, 90, 100, 60, 110),
    Array(4000, 4000, 4000, 4000, 4000, 4000), 40000) should be (1100.0 plusOrMinus 1E-9) }
  test("Case 2") { maximalDistance(
    Array(250, 240, 230, 220, 210, 211),
    Array(5000, 4500, 4000, 3500, 3000, 3000), 50000) should be (3516.6666666666665 plusOrMinus 1E-9) }
  test("Case 3") { maximalDistance(
    Array(5, 10, 20, 40, 80),
    Array(1000, 2500, 6250, 9000, 18000), 47832) should be (239.16 plusOrMinus 1E-9) }
  test("Case 4") { maximalDistance(
    Array(5, 10, 20, 40, 80, 160),
    Array(1000, 2500, 6250, 8000, 9500, 20000), 47832) should be (402.79578947368424 plusOrMinus 1E-9) }
  test("Case 5") { maximalDistance(
    Array(240, 195, 130, 133, 15, 160, 111, 206, 72, 149,
          146, 115, 235, 183, 102, 96, 163, 61, 196, 52,
          87, 139, 33, 7, 90, 67, 118, 227, 197, 114),
    Array(14837, 2981, 17292, 18591, 4832, 7461, 17991, 18369, 18291, 9400,
          15179, 3317, 2595, 2441, 6936, 8028, 14973, 18981, 12503, 7816,
          2883, 6385, 6230, 18157, 16567, 9310, 2866, 4687, 14171, 4477), 31710) should be (2871.6184971098264 plusOrMinus 1E-9) }
}