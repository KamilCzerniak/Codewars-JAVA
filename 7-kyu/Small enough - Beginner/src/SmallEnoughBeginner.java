import java.util.Arrays;

public class SmallEnoughBeginner {
    public static boolean smallEnough(int[] a, int limit) {
        return Arrays.stream(a).noneMatch(i -> i > limit);
    }
}
