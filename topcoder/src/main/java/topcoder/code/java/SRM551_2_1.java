package topcoder.code.java;

import java.util.HashSet;
import java.util.Set;

public class SRM551_2_1 {
    public int countLayouts(String bricks) {
        Set<Character> xs = new HashSet<Character>();
        for (char c: bricks.toCharArray()) {
            xs.add(c);
        }
        return xs.size() == 1 ? 1 : xs.size() == 2 ? 2 : 0;
    }
}

/*

Problem Statement
    
Beaver Bindu has some colored bricks. Each color is described by an uppercase letter. Bricks of each color all look exactly the same. You are given a String bricks. Each character of bricks represents the color of one of Bindu's bricks.  Bindu wants to arrange all her bricks into a row. A row of bricks is nice if there is at most one pair of adjacent bricks which have different colors.  Return the number of ways in which Bindu can form a nice row, using all her bricks. (Two ways are considered identical if they correspond to the same sequence of brick colors.)  
Definition
    
Class:
ColorfulBricks
Method:
countLayouts
Parameters:
String
Returns:
int
Method signature:
int countLayouts(String bricks)
(be sure your method is public)
    

Constraints
-
bricks will contain between 1 and 50 characters, inclusive.
-
Each character of bricks will be an uppercase letter ('A'-'Z').
Examples
0)

    
"ABAB"
Returns: 2
There are six possible ways to arrange all the bricks into a row: "AABB", "ABAB", "ABBA", "BAAB", "BABA" and "BBAA". Out of these, only "AABB" and "BBAA" have at most one pair of adjacent bricks with different colors.
1)

    
"AAA"
Returns: 1
In this test case, all bricks have the same color. Hence, there is only one way to arrange them into a row. That row is nice, because it has no adjacent bricks of different colors.
2)

    
"WXYZ"
Returns: 0
Since all four bricks are of different colors, the bricks at positions 0 and 1 will have different colors. Similarly, the bricks at positions 1 and 2 will also have different colors. Hence, no matter how the bricks are arranged in a row, the row will not be nice.
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
*/