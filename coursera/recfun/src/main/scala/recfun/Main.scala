package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    def next(xs: Seq[Int]): Seq[Int] = (0 +: xs, xs :+ 0).zipped map (_ + _)
    def rows(n: Int): Seq[Seq[Int]] = 
      if (n == 0) Vector(Vector(1))
      else {
        val r = rows(n - 1)
        r :+ next(r.last)
      }
    val p = rows(r)
    p(r)(c)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    @annotation.tailrec
    def go(chars: List[Char], n: Int): Boolean = 
      if (chars.isEmpty) n == 0
      else if (chars.head == '(') go(chars.tail, n + 1)
      else if (chars.head == ')') n > 0 && go(chars.tail, n - 1)
      else go(chars.tail, n)
    go(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = 
    if (money == 0) 1
    else if (money < 0 || coins.isEmpty) 0
    else countChange(money, coins.tail) + countChange(money - coins.head, coins)
}



