package topcoder.code.java;

public class SRM546_2_2 {
    public String describeIntersection(int[] A, int[] B) {
        Rect r1 = new Rect(A[0], A[2], A[1], A[3]);
        Rect r2 = new Rect(B[0], B[2], B[1], B[3]);
        
        return (r1.contains(r2.x1, r2.y1) || r1.contains(r2.x2, r2.y2) ||
                r1.contains(r2.x1, r2.y2) || r1.contains(r2.x2, r2.y1)) ? "rectangle" :
                r1.segment(r2) ? "segment" :
                r1.point(r2) ? "point" :
                "none";
                
    }

    class Rect {
        int x1;
        int x2;
        int y1;
        int y2;

        Rect(int x1, int x2, int y1, int y2) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }

        boolean contains(int a, int b) {
            return a > x1 && a < x2 && b > y1 && b < y2;
        }

        boolean segment(Rect r) {
            return ((r.x1 == x2 || r.x2 == x1) && (r.y1 >= y1 && r.y1 < y2 || r.y2 > y1 && r.y2 <= y2))
                || ((r.y1 == y2 || r.y2 == y1) && (r.x1 >= x1 && r.x1 < x2 || r.x2 > y1 && r.x2 <= x2));
        }
        
        boolean point(Rect r) {
            return (r.x1 == x2 || r.x2 == x1) && (r.y1 == y2 || r.y2 == y1); 
        }    
    }
}




/*

Problem Statement
    
You are given two rectangles in the plane. The sides of each rectangle are parallel to the coordinate axes. Each rectangle is given by the coordinates of its lower left corner and its upper right corner. You are given two int[]s: A and B. A describes the first rectangle: its lower left corner has coordinates (A[0],A[1]) and its upper right corner has coordinates (A[2],A[3]). B describes the second rectangle in the same way.
Your task is to determine how their intersection looks like. There are four options:
If the rectangles have a non-zero area in common, return "rectangle".
Otherwise, if they have a common line segment with non-zero length, return "segment".
Otherwise, if they have a point in common, return "point".
Otherwise, return "none" (in all four cases, the quotes are just for clarity).
Definition
    
Class:
TwoRectangles
Method:
describeIntersection
Parameters:
int[], int[]
Returns:
String
Method signature:
String describeIntersection(int[] A, int[] B)
(be sure your method is public)
    

Notes
-
The Constraints guarantee that both rectangles lie in the first quadrant of the coordinate plane, and each rectangle has a positive area.
Constraints
-
A will contain exactly 4 elements.
-
The elements of A will satisfy 0 <= A[0] < A[2] <= 1000 and 0 <= A[1] < A[3] <= 1000.
-
B will contain exactly 4 elements.
-
The elements of B will satisfy 0 <= B[0] < B[2] <= 1000 and 0 <= B[1] < B[3] <= 1000.
Examples
0)

    
{0,0,3,2}
{1,1,5,3}
Returns: "rectangle"
These two rectangles overlap partially:   
1)

    
{0,0,5,3}
{1,2,2,3}
Returns: "rectangle"
The second rectangle is completely inside the first one.   
2)

    
{1,1,6,2}
{3,2,5,4}
Returns: "segment"
The second rectangle sits on top of the first one.   
3)

    
{0,1,2,3}
{2,0,5,2}
Returns: "segment"
 
4)

    
{0,0,1,1}
{1,1,5,2}
Returns: "point"
 
5)

    
{1,1,2,2}
{3,1,4,2}
Returns: "none"
 
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
*/