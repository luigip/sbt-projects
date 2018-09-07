package topcoder.java;

public class SRM419_2_1 {
    public static int getPerimiter(int[] a) {
        
        int t = a[0] + a[a.length - 1] + a.length * 2;
        for(int i = 1; i < a.length; i++) {
            t += Math.abs(a[i] - a[i - 1]);
        }
        return t;
    }
    
}
