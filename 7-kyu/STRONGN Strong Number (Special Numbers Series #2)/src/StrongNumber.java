import java.util.Arrays;

public class StrongNumber {
    public static String isStrongNumber(int num) {
        return Arrays.stream(String.valueOf(num).split(""))
                .mapToInt(Integer::valueOf)
                .map(d -> factorial(d)).sum() == num ? "STRONG!!!!" : "Not Strong !!";
    }

    public static int factorial(int n) {
        return n == 0 ? 1 : n * factorial(n - 1);
    }
}
