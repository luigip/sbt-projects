package topcoder.manual

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import topcoder.SRM222_2_1._

class SRM222_2_TEST extends FunSuite with ShouldMatchers {

  longestRepeat("ABCDABCFG") should equal ("ABC")
  longestRepeat("ABABA") should equal ("AB")
  longestRepeat("This is a test.") should equal ("is ")
  longestRepeat("Testing testing 1 2 3.") should equal("esting ")
  longestRepeat("The quick brown fox jumps over the lazy dog.") should equal ("he ")
  longestRepeat("abd") should equal ("")
}