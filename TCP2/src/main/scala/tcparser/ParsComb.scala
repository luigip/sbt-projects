package tcparser

import scala.util.parsing.combinator.RegexParsers

case class Example(index: Int, text: String)

//class ParsComb extends RegexParsers {
//  def examples: Parser[List[Example]] = rep(divider~example) ^^ {_ map {case d~e => Example(d,e)}}
//  def divider:  Parser[Int]           = "[0-9]+".r <~ ")"    ^^ (_.toInt)
//  def example:  Parser[String]        = """(?s)^((?![0-9]+\)|END).)+$""".r <~ (divider | "END") 
//}

//class ParsComb2 extends RegexParsers {
//  def examples: Parser[List[Example]] = rep(divider ~ example) <~ end       ^^ { _ map { case d ~ e => Example(d, e) } }
//  def divider: Parser[Int] = "[0-9]+".r <~ ")" ^^ (_.toInt)
//  def example: Parser[String] = rep(""".*?(?=[\r\n])""".r) ^^ {_ mkString "\n"}
//  def end: Parser[String] = "END"
//}

//object Pars3 extends RegexParsers { 
//  def strings: Parser[List[String]] = rep(str) <~ """END(\r?\n)?""".r 
//  def str: Parser[String] = """.*\r?\n""".r ^? { 
//    case s if !(s matches """END\r?\n""") => s.replaceAll("""[\r\n]""", "")
//  }
//}
//
//object Pars4 extends RegexParsers { 
//  def strings: Parser[List[String]] = rep(str) <~ "END"
//  def str: Parser[String] = """((?!END).)*\r?\n""".r ^^ {_.replaceAll("""[\r\n]""", "") }
//}

object Pars5 extends RegexParsers {
  def strings: Parser[List[String]] = 
    ( "END" ^^^ Nil 
    | ".+".r ~ strings ^^ { case head ~ tail => head :: tail }
    )
}
object Pars6 extends RegexParsers { 
  def strings: Parser[List[String]] = rep(str) <~ """END(\r?\n)?""".r 
  def str: Parser[String] = ".*".r
}

object Test extends App {
val input = """
0)
blah1
blah2
blah3
1)

blah4
blah5
END
  fdsgsdfgs
"""
  
val input2 = input.split("\r\n|\n|\r")

  println(Pars5.parse(Pars5.strings, input))
}