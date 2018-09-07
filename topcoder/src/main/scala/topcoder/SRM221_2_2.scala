package topcoder

/*
  Problem too difficult - performance, output rounding - and not interesting enough to merit solution
 */

object SRM221_2_2 {
  def simulate(xs: Array[Int], ys: Array[Int], rnds: Int) = {

    case class Point(x: Double, y: Double) extends Ordered[Point] {
      def compare(that: Point) = if (this.y == that.y) this.x compare that.x else this.y compare that.y
    }
    case class Board(points: Array[Point]) {
    }

    val ps = (xs,ys).zipped.map((a,b) => Point(a.toFloat,b.toFloat)).toArray
    val b0 = Board(ps)

    def maxPt(b: Board) = {
      b.points.sorted.last
    }

    def go(b: Board, rnds: Int): String = {
      rnds match {
        case 0 => "%09.4f %09.4f".format(maxPt(b).x, maxPt(b).y)
        case x => go(update(b), rnds - 1)
      }
    }

    def update(b: Board): Board = {
      val ab = new collection.mutable.HashSet[Point]
      var i = 0
      for {
        i <- 0 until b.points.length - 1
        j <- i + 1 until b.points.length
        pt1 = b.points(i)
        pt2 = b.points(j)
        x = (pt2.x + pt1.x) / 2
        y = (pt2.y + pt1.y) / 2
        if !ab.contains(Point(x,y))
      } ab += (Point(x,y))

      Board(ab.toArray)
    }


    go(b0, rnds)
  }
}