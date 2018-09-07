package topcoder

import annotation.tailrec

object SRM222_2_1 {
  def longestRepeat1(sourceText: String ) = {
    val subs = for {
      i <- 0 to sourceText.length - 1
      en <- i + 1 to sourceText.length
      sub = sourceText.substring(i, en)
      if sourceText.substring(en, sourceText.length).contains(sub)
    } yield sub

    if(subs.isEmpty) "" else subs.sortWith(_.length > _.length).head
  }

  // works a bit differently; works backwards in length and returns as soon as it hits
  def longestRepeat2(sourceText: String ): String = {
    for {
      len <- Range.inclusive(sourceText.length / 2 , 0, -1)
      i <- 0 to sourceText.length - len
    }{
      val sub = sourceText.substring(i, i + len)
      if (sourceText.substring(i + len, sourceText.length).contains(sub)) return sub
    }
    ""
  }

  // tail recursive version
  def longestRepeat3(sourceText: String) = {
    def find(len: Int, i:Int): String = {
      val sub = sourceText.substring(i, i + len)
      if (len == 0) ""
      else if (sourceText.substring(i + len, sourceText.length).contains(sub)) sub
      else if (i < sourceText.length - len) find(len, i + 1)
      else find(len - 1, 0)
    }
    find(sourceText.length/2, 0)
  }

  // imperative loops
  def longestRepeat(sourceText: String): String = {
    var len = sourceText.length / 2
    while(len > 0) {
      var i = 0
      while(i <= sourceText.length - len) {
        val sub = sourceText.substring(i, i + len)
        if (sourceText.substring(i + len, sourceText.length).contains(sub)) return sub
        else i += 1
      }
      len -= 1
    }
    ""
  }

}