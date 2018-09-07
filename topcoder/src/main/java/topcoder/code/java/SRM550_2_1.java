package topcoder.code.java;

public class SRM550_2_1 {
    public String isItPossible(String originalWord, String finalWord, int k) {
        
        int len = originalWord.length();
        int diffs = 0;
        
        for (int i = 0; i < len; i++ ) {
            if (originalWord.charAt(i) != finalWord.charAt(i)) diffs++;
        
        }
        
        return diffs <= k && (diffs - k) %2 == 0 ? "POSSIBLE" : "IMPOSSIBLE";
    }
}

/*

Problem Statement
    
We have a String originalWord. Each character of originalWord is either 'a' or 'b'. Timmy claims that he can convert it to finalWord using exactly k moves. In each move, he can either change a single 'a' to a 'b', or change a single 'b' to an 'a'.  You are given the Strings originalWord and finalWord, and the int k. Determine whether Timmy may be telling the truth. If there is a possible sequence of exactly k moves that will turn originalWord into finalWord, return "POSSIBLE" (quotes for clarity). Otherwise, return "IMPOSSIBLE".
Definition
    
Class:
EasyConversionMachine
Method:
isItPossible
Parameters:
String, String, int
Returns:
String
Method signature:
String isItPossible(String originalWord, String finalWord, int k)
(be sure your method is public)
    

Notes
-
Timmy may change the same letter multiple times. Each time counts as a different move.
Constraints
-
originalWord will contain between 1 and 50 characters, inclusive.
-
finalWord and originalWord will contain the same number of characters.
-
Each character in originalWord and finalWord will be 'a' or 'b'.
-
k will be between 1 and 100, inclusive.
Examples
0)

    
"aababba"
"bbbbbbb"
2
Returns: "IMPOSSIBLE"
It is not possible to reach finalWord in fewer than 4 moves.
1)

    
"aabb"
"aabb"
1
Returns: "IMPOSSIBLE"
The number of moves must be exactly k=1.
2)

    
"aaaaabaa"
"bbbbbabb"
8
Returns: "POSSIBLE"
Use each move to change each of the letters once.
3)

    
"aaa"
"bab"
4
Returns: "POSSIBLE"
The following sequence of 4 moves does the job: aaa -> baa -> bab -> aab -> bab
4)

    
"aababbabaa"
"abbbbaabab"
9
Returns: "IMPOSSIBLE"

This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
*/