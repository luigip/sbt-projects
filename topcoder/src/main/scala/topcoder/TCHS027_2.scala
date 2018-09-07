package topcoder

object TCHS027_2 {
  def findOrder(army1: Array[String], army2: Array[String]) = {

    case class Creature(name: String, might: Int) extends Comparable[Creature] {
      def compareTo(that: Creature) = this.might compare that.might
    }
    
    val List(a1, a2) = List(army1, army2).map(_.map{ i =>
      val s = i.split(" ")
      Creature(s(0), s(1).toInt)
    }.sortWith(_.might > _.might))
   
    def go(one: Array[Creature], two: Array[Creature], oneLast: Boolean): Array[String] = {
      if(one.isEmpty && two.isEmpty) Array[String]()
      else {
        val c = (one.headOption.getOrElse(Creature("", -1))).compareTo(
                 two.headOption.getOrElse(Creature("", -1)))
        
        if(c < 0 || (c == 0 && oneLast)) two.head.name +: go(one, two.tail, false)
                                    else one.head.name +: go(one.tail, two, true) 
      }
    }
    
    go(a1, a2, false)
    
  }
}