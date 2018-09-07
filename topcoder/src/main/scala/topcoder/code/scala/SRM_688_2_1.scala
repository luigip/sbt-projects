package topcoder.code.scala

object SRM_688_2_1 {
  def getDepth_imperative(s: String) = {
    var maxDepth = 0
    var depth = 0
    for (c <- s) {
      c match {
        case '(' => depth += 1; maxDepth = maxDepth max depth
        case ')' => depth -= 1
      }
    }
    maxDepth
  }

  def getDepth(s: String) = {
    s.foldLeft((0,0)){
      case ((maxDepth, depth), c) => c match {
        case '(' => (maxDepth max (depth + 1), depth + 1)
        case ')' => (maxDepth, depth - 1)
      }
    }._1
  }

}

/*

Problem Statement
    
Correct parentheses sequences can be defined recursively as follows:
The empty string "" is a correct sequence.
If "X" and "Y" are correct sequences, then "XY" (the concatenation of X and Y) is a correct sequence.
If "X" is a correct sequence, then "(X)" is a correct sequence.
Each correct parentheses sequence can be derived using the above rules.
Examples of correct parentheses sequences include "", "()", "()()()", "(()())", and "(((())))".   We can define the depth of a correct parentheses sequence recursively as follows:
The empty string "" has depth 0.
If the depth of "X" is x and the depth of "Y" is y then the depth of "XY" is max(x,y).
If the depth of "X" is x then the depth of "(X)" is x+1.
For example, the depth of "(((())))" is 4, the depth of "()()()" is 1, and the depth of "(())()" is 2.  Note that the depth of each correct parentheses sequence is uniquely defined using the above rules. For example, when evaluating the depth of "()()()" it does not matter whether we take X = "()" and Y = "()()" or we take X = "()()" and Y = "()", the result will be the same in both cases.  Given a String s that is a correct parentheses sequence, calculate and return the depth of s.
Definition
    
Class:
ParenthesesDiv2Easy
Method:
getDepth
Parameters:
String
Returns:
int
Method signature:
int getDepth(String s)
(be sure your method is public)
Limits
    
Time limit (s):
2.000
Memory limit (MB):
256
Stack limit (MB):
256
Constraints
-
s will contain between 2 and 50 characters, inclusive.
-
Each character in s will be '(' or ')'.
-
s will be a correct parentheses sequence.
Examples
0)

    
"(())"
Returns: 2
The depth of "" is 0.
Therefore, the depth of "()" is 1.
Next, the depth of "(())" is the depth of "()" plus 1, which makes it 1+1 = 2.
1)

    
"()()()"
Returns: 1
The depth of "()()" is the maximum of the depth of "()" and the depth of "()". In other words, it is max(1,1) = 1.
The depth of "()()()" is the maximum of the depth of "()()" and the depth of "()". Hence, this also equals max(1,1) = 1.
2)

    
"(())()"
Returns: 2
The answer is max(2, 1) = 2.
3)

    
"((())())(((())(()))())"
Returns: 4

4)

    
"()"
Returns: 1

This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
*/