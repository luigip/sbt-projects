package topcoder

object TCHS030_2 {
  def whoIsWho(white: Array[String], black: Array[String]) = {
    
    val good  = white.flatMap(_.split(" ")).toSet
    
    val bad   = black.map(_.split(" ").filterNot(good.contains))
                     .filter(_.size == 1).flatten.toSet
    
    val maybe = black.flatMap(_.split(" ")).toSet
                     .filterNot(i => good.contains(i) || bad.contains(i) )
    
    Array(good.size, bad.size, maybe.size)
  }
}