package topcoder

object SRM219_1_1 {
  def selectMeals(prot: Array[Int], carb: Array[Int], fat: Array[Int], plans: Array[String]) = {

    val tot = (prot, carb, fat).zipped.map(_ * 5 + _ * 5 + _ * 9)

    case class Menu(i: Int, p: Int, c: Int, f: Int, t: Int)

    val allmenus = for {
      i <- 0 until prot.length
    } yield Menu(i, prot(i), carb(i), fat(i), tot(i))

    def best(s: String, menus: Seq[Menu]): Int = {
      val ms = s.head match {
        case 'C' => menus.filter{_.c == menus.map(_.c).max}
        case 'c' => menus.filter{_.c == menus.map(_.c).min}
        case 'P' => menus.filter{_.p == menus.map(_.p).max}
        case 'p' => menus.filter{_.p == menus.map(_.p).min}
        case 'F' => menus.filter{_.f == menus.map(_.f).max}
        case 'f' => menus.filter{_.f == menus.map(_.f).min}
        case 'T' => menus.filter{_.t == menus.map(_.t).max}
        case 't' => menus.filter{_.t == menus.map(_.t).min}
      }
      if(ms.length == 1 || s.length == 1) ms.head.i
      else best(s.tail, ms)
    }

    for {
      p <- plans
      r = if(p.length == 0) 0 else best(p, allmenus)
    } yield r
  }
}