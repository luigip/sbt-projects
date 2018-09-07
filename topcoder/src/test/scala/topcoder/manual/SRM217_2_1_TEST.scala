package topcoder.manual

import topcoder.SRM217_2_1._
import org.junit.Assert._
import org.scalatest.junit.JUnitSuite
import org.junit.{Before, Test}


class SRM217_2_1_TEST extends JUnitSuite {
  @Before
  def init() {
    println("Starting Test...")
  }

  @Test
  def maxDistanceTest() {
    // ScalaTest assert, === is like == but provides values upon fail
    assert(239.16 === maximalDistance(
      Array(5, 10, 20, 40, 80),
      Array(1000, 2500, 6250, 9000, 18000),
      47832))

    // ScalaTest expect
    expect(239.16){
      maximalDistance(
        Array(5, 10, 20, 40, 80),
        Array(1000, 2500, 6250, 9000, 18000),
        47832)
    }

    // JUnit assert(double, double, delta)
    assertEquals(2871.6184971098264, maximalDistance(
      Array(240, 195, 130, 133, 15, 160, 111, 206, 72, 149,
      146, 115, 235, 183, 102, 96, 163, 61, 196, 52,
      87, 139, 33, 7, 90, 67, 118, 227, 197, 114),
      Array(14837, 2981, 17292, 18591, 4832, 7461, 17991, 18369, 18291, 9400,
        15179, 3317, 2595, 2441, 6936, 8028, 14973, 18981, 12503, 7816,
        2883, 6385, 6230, 18157, 16567, 9310, 2866, 4687, 14171, 4477),
      31710),
      1e-9)
  }
}