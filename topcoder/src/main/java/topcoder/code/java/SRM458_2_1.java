package topcoder.code.java;

public class SRM458_2_1 {
    public int minDucks(int[] duckTypes) {
        
        int min = 0;
        int unique = 0;
        int counts[] = new int[51];
        for (int d : duckTypes) {
            if(counts[d] == 0) unique++;
            counts[d] += 1;
            if(counts[d] > min) min = counts[d];
        }
        
        
        return min * unique;
    }
}

/*

Problem Statement
    
King Dengklek received a container full of ducks as his birthday gift from his loyal subjects. Each duck is of a specific type, represented by an integer between 1 and 50, inclusive. He was told that the container contains the same number of ducks of each type that is present in the container.  King Dengklek wants to guess the total number of ducks in the container. He removed some of the ducks from the container and examined their types. These types are given in int[] duckTypes, where duckTypes[i] is the type of the i-th duck (0-based index) King Dengklek picked.  Compute and return the total number of ducks in the container in the beginning (before King Dengklek removed some of them). If there are multiple possibilities, return the smallest one.
Definition
    
Class:
KingdomAndDucks
Method:
minDucks
Parameters:
int[]
Returns:
int
Method signature:
int minDucks(int[] duckTypes)
(be sure your method is public)
    

Constraints
-
duckTypes will contain between 1 and 50 elements, inclusive.
-
Each element of duckTypes will be between 1 and 50, inclusive.
Examples
0)

    
{5, 8}
Returns: 2
The container might have contained one duck of each of types 5 and 8.
1)

    
{4, 7, 4, 7, 4}
Returns: 6
The container might have contained three ducks of each of types 4 and 7.
2)

    
{17, 17, 19, 23, 23, 19, 19, 17, 17}
Returns: 12

3)

    
{50}
Returns: 1
The container might have contained only one duck of type 50.
4)

    
{10, 10, 10, 10, 10}
Returns: 5

This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
*/