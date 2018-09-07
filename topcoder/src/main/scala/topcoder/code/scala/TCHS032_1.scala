package topcoder.code.scala

object TCHS032_1 {
  def winner(boulders: Array[String], distance: Int) = {
    val times = for {
      (b, i) <- boulders.zipWithIndex
    } yield (time(b, distance), i)
    times.minBy(_._1)._2
  }
  
  def time(s: String, distance: Int) = {
    val ints: Stream[Int] = Stream.continually(s).flatMap(_ map(_ - '0'))
    val times = ints.scanLeft(0){ case(i, total) => i + total }.takeWhile(_ < distance)
    times.length + 1
  }
}

/*

Problem Statement
    
Once every year, the town of Boulder has a boulder race. They place boulders along the side of a mountain at a predetermined height and watch them roll down. The boulder that reaches the bottom first is crowned the winner.  Each boulder has some number of sides, and as it travels down the mountain, it rolls through all of its sides, completing a cycle and repeating it until it reaches the bottom of the mountain. The boulder slides down the mountain for one time unit on each side. For instance, if a boulder has three sides A, B and C, it will travel down the mountain starting on side A. After sliding down for one time unit, it will roll to side B, and after one more time unit, it will roll to side C. After one more time unit, it will return to side A and repeat the cycle until it reaches the bottom. Each side has a number between 1 and 9, inclusive, indicating the number of feet the boulder will travel on that side in one time unit. All progress is measured only at the end of each time unit (see examples for further clarification).  You will be given a String[] boulders and an int distance. Each element of boulders contains the numbers on the sides of a single boulder. The first character represents side A, the second character represents side B, and so on. distance is the number of feet the boulders must roll to reach the bottom. Return the 0-based index of the boulder that reaches the bottom of the mountain first. In case of a tie, return the lower index.
Definition
    
Class:
BoulderRace
Method:
winner
Parameters:
String[], int
Returns:
int
Method signature:
int winner(String[] boulders, int distance)
(be sure your method is public)
    

Constraints
-
boulders will contain between 2 and 5 elements, inclusive.
-
Each element of boulders will contain between 1 and 5 characters, inclusive.
-
Each character in boulders will be a digit between '1' and '9', inclusive.
-
distance will be between 1 and 1000, inclusive.
Examples
0)

    
{"9191", "9911"}
38
Returns: 1
The boulders are placed 38 feet above the base of the mountain and roll down according to the table below: 
          1| 2| 3| 4| 5| 6
Boulder1| 9|10|19|20|29|30
Boulder2| 9|18|19|20|29|38
After 6 time units the second boulder reaches the bottom of the mountain and is crowned the winner.
1)

    
{"23", "1254", "81111", "3141"}
24
Returns: 1
          1| 2| 3| 4| 5| 6| 7| 8
Boulder1| 2| 5| 7|10|12|15|17|20
Boulder2| 1| 3| 8|12|13|15|20|24
Boulder3| 8| 9|10|11|12|20|21|22
Boulder4| 3| 4| 8| 9|12|13|17|18
2)

    
{"1234", "1144", "4411", "2323", "4321"}
100
Returns: 0
Note that all the boulders will reach the bottom at the same time. If a set of boulders tie, choose the boulder with the lower index from among the set.
3)

    
{"1", "112", "1113"}
12
Returns: 2

4)

    
{"1234", "2341", "3412", "4123", "4321"}
24
Returns: 3

5)

    
{"88", "99", "77"}
12
Returns: 0
Be careful! All boulders reach the bottom in the 2nd time unit. At first glance one might think the second boulder is the winner; however, since all three boulders reached the bottom in the same time unit, the first boulder wins. 1. All progress is measured at the end of a time unit. 2. In case of a tie, return the lower index.
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
*/