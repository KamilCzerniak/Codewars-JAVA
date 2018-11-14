import java.util.Arrays;

public class LuckyNumber {
    public static boolean isLucky(long n) {
        return n == 0 || Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::valueOf)
                .sum() % 9 == 0;
    }
}
