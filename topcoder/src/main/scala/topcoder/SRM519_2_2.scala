package topcoder

object SRM519_2_2 {
  def shortestDistance(xMe: Int, yMe: Int, xHome: Int, yHome: Int, teleports: Array[String]) = {
    lazy val nodes: List[Node] = (
      for {
        t <- teleports
        ps = t.split(" ").map(_.toInt)
        ts = {
          lazy val a: Teleport = new Teleport(ps(0), ps(1), b)
          lazy val b: Teleport = new Teleport(ps(2), ps(3), a)
          List(a,b)
        } 
      } yield ts
    ).toList.flatten :+ home    
    
    abstract class Node (val x: Int, val y: Int) {
      var shortestToGetHere = Long.MaxValue
      def timeToHome(total: Long, best: Int): Long
    }
    
    class Home(x: Int, y: Int) extends Node(x, y) {
      override def timeToHome(total: Long, best: Int) = total
    }
    
    class Teleport(x: Int, y: Int, t: => Teleport) extends Node(x, y) {
      lazy val target = t
      
      override def timeToHome(total: Long, best: Int) = {
        if(total >= shortestToGetHere) Long.MaxValue
        else {
          shortestToGetHere = total
//          println("Evaluating " + x + y)
          if(total >= best) best
          else nodes.map(n => n.timeToHome(total + dist(target, n) + 10, best)).min
        }
      }
    }
    
    class Me(x: Int, y: Int) extends Node(x, y) {
      override def timeToHome(total: Long, best: Int) = 
        nodes.map(n => n.timeToHome(total + dist(this, n), best)).min
    }
    
    def dist(a: Node, b: Node) = math.abs(a.x - b.x) +  math.abs(a.y - b.y)
    
    lazy val me = new Me(xMe, yMe)
    lazy val home = new Home(xHome, yHome)
    me.timeToHome(0L, dist(me, home))
  }
}