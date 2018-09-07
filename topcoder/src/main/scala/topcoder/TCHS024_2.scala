package topcoder

object TCHS024_2 {
  def complete(word1: String, word2: String): Array[String] = {
    val ep = (c: Char) => c == '.'
    
    var l1 = word1 diff word2 filterNot ep 
    var l2 = word2 diff word1 filterNot ep
    
    if((word2 count ep) < l1.length) return Array[String]()
    else l1 = l1.padTo((word2 count ep), 'A').sorted
    
    if((word1 count ep) < l2.length) return Array[String]()
    else l2 = l2.padTo((word1 count ep), 'A').sorted
    
    val res1 = word1.scanLeft((l2, "")){case ((ls, acc), c ) => c match {
      case '.' => (ls.tail, acc + ls.head)
      case x   => (ls, acc + x)
    }} .last._2
      
    val res2 = word2.scanLeft((l1, "")){case ((ls, acc), c ) => c match {
      case '.' => (ls.tail, acc + ls.head)
      case x   => (ls, acc + x)
    }} .last._2
    
    Array(res1, res2)
  }
}