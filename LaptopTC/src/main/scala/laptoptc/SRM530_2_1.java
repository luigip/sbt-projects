package laptoptc;

public class SRM530_2_1 {

    public static int solve(int[] T) {
        int r = 0;
        for(int i = 0; i < T.length/2; i++) r += T[T.length - i - 1] - T[i];
        return r;
    }
}
