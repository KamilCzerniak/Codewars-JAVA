import java.util.Arrays;

public class SumDigNth {

    public static long sumDigNthTerm(long initval, long[] patternl, int nthterm) {

        int cnt = 1;
        long res = initval;
        while (cnt < nthterm) {
            res += patternl[(cnt - 1) % patternl.length];
            cnt++;
        }
        return Arrays.stream(String.valueOf(res).split("")).mapToInt(Integer::valueOf).sum();
    }
}