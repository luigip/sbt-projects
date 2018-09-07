package topcoder.code.java;

import java.util.ArrayList;
import java.util.Arrays;

public class SRM534_2_1 {
    public String[] getFiles(String[] files) {
        ArrayList<String> a = new ArrayList<String>(Arrays.asList(files));
        int len = files.length;
        String last = files[len - 1];
        String pen = files[len - 2];
        if (last.equals(".") && pen.equals("..") || last.equals("..") && pen.equals("."))
            return files;
        int point = a.indexOf(".");
        int dbl = a.indexOf("..");
        int min = Math.min(point, dbl);
        String temp = files[min];
        files[min] = last;
        files[len - 1] = temp;
        last = files[len - 1];
        pen = files[len - 2];
        if (last.equals(".") && pen.equals("..") || last.equals("..") && pen.equals("."))
            return files;
        
        a = new ArrayList<String>(Arrays.asList(files));
        point = a.indexOf(".");
        dbl = a.indexOf("..");
        min = Math.min(point, dbl);
        temp = files[min];
        files[min] = pen;
        files[len - 2] = temp;
        
        
        
        return files;
    }

}

/*

Problem Statement
����
Elly wants to write a program that lists all the files in a given directory. She already has the list of all the files. You will be given this list as a String[] files. In addition to the names of files, the variable files will contain exactly two additional elements: the current directory (the String "."), and the parent directory (the String ".."). These two elements may be anywhere in files. However, Elly wants them to be the last two elements. In order to move the two directories to the last two positions in files, she wants you to perform the following steps:
If "." and ".." are the last two elements of files (in any order), you are done.
Find the first element of files that is either "." or "..". Swap it with the last element of files.
If "." and ".." are now the last two elements of files (in any order), you are done.
Find the first element of files that is either "." or "..". Swap it with the element of files that is one position before the last one.
Your method must perform the above steps and return a String[] containing the modified order of elements in files.
Definition
����
Class:
EllysDirectoryListing
Method:
getFiles
Parameters:
String[]
Returns:
String[]
Method signature:
String[] getFiles(String[] files)
(be sure your method is public)
����

Notes
-
Swapping elements at positions i and j means that the element at position i is moved to the position j and vice versa.
Constraints
-
files will contain between 2 and 50 elements, inclusive.
-
All elements of files will be distinct.
-
Exactly one element of files will be ".".
-
Exactly one element of files will be "..".
-
Each element of files will contain between 1 and 20 characters, inclusive.
-
Each element of files will contain only uppercase and lowercase letters and dots ('A'-'Z', 'a'-'z', '.').
Examples
0)

����
{"ContestApplet.jnlp", ".", "Image.jpg", "..", "Book.pdf", "Movie.avi"}
Returns: {"ContestApplet.jnlp", "Movie.avi", "Image.jpg", "Book.pdf", "..", "." }
The directories are not the last two elements, so we search for the first one (in this case "."), and swap it with the last element (in this case "Movie.avi"). As "." and ".." are still not the last two elements, we search for the second one (in this case "..") and swap it with "Book.pdf".
1)

����
{"Image.jpg", "..", "."}
Returns: {"Image.jpg", "..", "." }
In this case the directories are already the last two elements, so we do nothing.
2)

����
{"..", ".", "Image.jpg"}
Returns: {"Image.jpg", ".", ".." }
After swapping ".." with "Image.jpg", the directories are already the last two elements, so we are done.
3)

����
{"No", "..", "Zaphod", ".", "Just", "very", "very...", "Improbable"}
Returns: {"No", "Improbable", "Zaphod", "very...", "Just", "very", ".", ".." }

4)

����
{"www.topcoder.com", "Ever.tried", ".", "Ever.failed", "..", "No", "Matter.", "Try", "Again.", "Fail", "Again..", "Fail.Better"}
Returns: 
{"www.topcoder.com",
 "Ever.tried",
 "Fail.Better",
 "Ever.failed",
 "Again..",
 "No",
 "Matter.",
 "Try",
 "Again.",
 "Fail",
 "..",
 "." }

5)

����
{"This", ".", "is", "tricky", "test", ".."}
Returns: {"This", "test", "is", "tricky", "..", "." }
The first swap moves ".." to position 1, so we need to move it again to index 4 (indexed from zero).
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
*/