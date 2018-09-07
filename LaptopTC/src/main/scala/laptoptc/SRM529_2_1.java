package laptoptc;

public class SRM529_2_1 {
    public static int savedPawnCount(int[] start) {
        int len = start.length;
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 1; i < len; i++) {
                if(start[i] >= 2) {
                    start[i-1] += 1;
                    start[i] -= 2;
                    changed = true;
                }
            }
        }
        return start[0];
    }
}