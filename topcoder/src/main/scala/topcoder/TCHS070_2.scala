package topcoder

object TCHS070_2 {  
  // 500pt
  def terminalTimes(tasks: Array[Int]) = {
    val res = new Array[Int](tasks.length)
    var time = 0
    while (tasks.sum > 0) {
      val min = tasks.filter(_>0).min - 1
      if (min > 0) {
        time += min * tasks.count(_>0)
        tasks.transform(i => if(i > 0) i - min else i)
      }
      for(i <- 0 until tasks.size) {
        if (tasks(i) > 0)  {
          time += 1
          if (tasks(i) == 1) res(i) = time
          tasks(i) -= 1
        }
      }
    }
    res
  }
//  def terminalTimes1(tasks: Array[Int]) = {
//    case class Task(index: Int, timeLeft: Int, timeFinished: Option[Int])
//    val ts = tasks.zipWithIndex.map{case (v, i) => Task(i, v, None)}
//
//    def run(s: Seq[Task], time: Int): Array[Int] = {
//      if(s.forall(_.timeFinished.isDefined)) s.map(_.timeFinished.get).toArray
//      else {
//        val newseq = s map { t =>
//          t.timeLeft match {
//            case 0 => t
//            case 1 => t.copy(timeLeft = 0, timeFinished = Some(1 + time + s.take(t.index).filter(_.timeLeft > 0).length))
//            case x => t.copy(timeLeft = t.timeLeft - 1)
//          }
//        }
//        run(newseq, time + s.count(_.timeLeft > 0))
//      }
//    }
//    run(ts, 0)
//  }
}

