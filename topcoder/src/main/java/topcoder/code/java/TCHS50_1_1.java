package topcoder.code.java;

public class TCHS50_1_1 {
    public int gameTime(int n) {
        int total = 0;
        for (int i = 1; n > 0;) {
            if (n < i) {
                i = 1;
            }
            else {
                total++;
                n -= i;
                i++;
            }
        }
        return total;
    }
}

/*

Problem Statement
����
n birds on a tree want to learn natural numbers. They start singing all natural numbers in the increasing order starting from 1. When a number K is sung, K birds fly away from the tree. If, at any second, the number of birds on the tree is strictly less than the number which must be sung, the birds restart the game and start singing the numbers from 1 again.
You are given an int n � the number of birds on the tree. Taking into account that singing a number takes exactly one second, return the total time elapsed before all birds fly away.
Definition
����
Class:
FunnyBirds
Method:
gameTime
Parameters:
int
Returns:
int
Method signature:
int gameTime(int n)
(be sure your method is public)
����

Constraints
-
n will be between 1 and 10^9, inclusive.
Examples
0)

����
1
Returns: 1
There is just one bird who flies at the first second.
1)

����
3
Returns: 2
One bird flies away at the first second, the other two at the next one.
2)

����
4
Returns: 3
At second 1, birds sing "one" and one of four birds flies away (with 3 birds remaining on the tree). At second 2, birds sing "two" and two of three birds fly away. At the third, the birds restart the game from 1 and the last bird flies away.
3)

����
14
Returns: 7
During the first four seconds the birds will count from 1 to 4, so (1 + 2 + 3 + 4) = 10 birds will fly away, with 4 birds left on the tree. The game will be restarted from 1, so 1 and 2 birds will fly away on seconds 5 and 6 respectively. On second 7, the birds will restart the game again and the only remaining bird will fly away.
4)

����
100
Returns: 18

This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
*/