//package laptoptc;
//
//import java.util.Arrays;
//
//public class SRM530_2_2 {
//
//    public static String solve(String[] cake, String[] cutter) {
//        boolean [][] targ = new boolean[cake.length][cake[0].length()];
//        for(boolean [] b : targ) Arrays.fill(b, true);
//        boolean [][] c0 = conv2(cake);
////        print(c0);
//        boolean [][] ct = conv(cutter);
////        System.out.println();
////        print(ct);
////        System.out.println();
//        return cut(c0, ct, targ) ? "YES" : "NO";
//    }
//
//    static boolean cut(boolean[][] cake, boolean[][] cutter, boolean [][] target) {
//        System.out.println(compare(cake,target));
//        if(compare(cake, target)) return true;
//
//        for(int i = 0; i <= cake.length - cutter.length; i ++) {
//            for(int j = 0; j <= cake[i].length - cutter[0].length; j++) {
//                boolean cancut = true;
//                boolean [][] temp = cake.clone();
//                for(int x = 0; x < cutter.length; x++){
//                    for(int y = 0; y < cutter[x].length; y++) {
//                        if(cutter[x][y] && cake[i+x][j+y]) {
//                            cancut = false;
//                        }
//                        if(cutter[x][y])
//                            temp[i+x][j+y] = true;
//                    }
//                }
//                if(cancut)
//                    return cut(temp, cutter, target);
//            }
//        }
//        System.out.println("cake");
//        print(cake);
//        System.out.println("targ");
//        print(target);
//        System.out.println();
//        return false;
//    }
//
//    static boolean [][] conv(String[] s) {
//        boolean [][] r = new boolean[s.length][s[0].length()];
//        for(int i = 0; i < r.length; i++) {
//            for(int j = 0; j < r[i].length; j++) {
//                r[i][j] = s[i].charAt(j) == '.';
//            }
//        }
//        return r;
//    }
//    static boolean [][] conv2(String[] s) {
//        boolean [][] r = new boolean[s.length][s[0].length()];
//        for(int i = 0; i < r.length; i++) {
//            for(int j = 0; j < r[i].length; j++) {
//                r[i][j] = s[i].charAt(j) == 'X';
//            }
//        }
//        return r;
//    }
//    static boolean compare(boolean [][] a, boolean [][] b) {
//        for(int x = 0; x < a.length; x++) {
//            for(int y = 0; y < a.length; y++)
//                if(a[x][y] != b[x][y])
//                    return false;
//        }
//        return true;
//    }
//
//    static void print(boolean[][] b) {
//        for(boolean [] r: b) {
//            for(boolean s: r) {
//                System.out.print(s ? "X" : ".");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        String r = solve(
//            new String[] {"X.X"
//                 ,"..."
//                 ,"..."
//                 ,"X.X"},
//            new String[]{".X"
//                 ,".."
//                 ,"X."}
//            );
//        System.out.println(r);
//    }
//}
