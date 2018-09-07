package topcoder

object TCHS027_1 {
  def createPattern(message: String) = {

    ("\0" + message + "\0").map { c =>
      "x" + Integer.toString(c, 2).reverse.padTo(7, '0').reverse.map {
        case '0' => '.'
        case '1' => 'x'
      } + "x"
    }.toArray
  }
}