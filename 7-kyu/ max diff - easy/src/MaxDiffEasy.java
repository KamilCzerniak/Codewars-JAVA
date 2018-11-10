import java.util.Arrays;

public class MaxDiffEasy {
    public static int maxDiff(int[] lst) {
        Arrays.sort(lst);
        return lst.length > 1 ? lst[lst.length - 1] - lst[0] : 0;
    }
}
