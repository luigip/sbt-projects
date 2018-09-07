//package laptoptc;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class SRM529_2_2 {
//    public static String[] getSortedList(String[] kings) {
//
//        List<King> kl = new ArrayList<King>();
//        for(String king: kings) {
//            String[] parts = king.split(" ");
//            String name = parts[0];
//            String ord = parts[1];
//
//        }
//    }
//
//    static int getOrd(String s) {
//        if (s.equals("L")) return 50;
//        String[] units = "I, II, III, IV, V, VI, VII, VIII, IX".split(", ");
//        String[] tens = "X, XX, XXX, XL".split(", ");
//        int n = 0;
//        int v = s.indexOf('V');
//        int i = s.indexOf('I');
//        if (i > -1) n = Arrays.binarySearch(units, s.substring(i)) + 1;
//        if (v > -1) n = Arrays.binarySearch(units, s.substring(v)) + 1;
//
//    }
//
//    class King {
//        String name;
//        int number;
//        King(String name, int number) {
//            this.name = name;
//            this.number = number;
//        }
//    }
//}
