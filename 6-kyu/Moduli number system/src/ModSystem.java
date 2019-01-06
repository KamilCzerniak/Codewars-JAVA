import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ModSystem {

    public static String fromNb2Str(int n, int[] sys) {
        if (IntStream.of(sys).reduce((a, b) -> a * b).getAsInt() < n
                || isNotApplicable(sys)) {
            return "Not applicable";
        }
        return "-" + IntStream.of(sys)
                .mapToObj(a -> String.valueOf(n % a))
                .collect(Collectors.joining("--")) + "-";
    }

    private static boolean isNotApplicable(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (!BigInteger.valueOf(arr[i]).gcd(BigInteger.valueOf(arr[j])).equals(BigInteger.ONE)) {
                    return true;
                }
            }

        }
        return false;
    }
}
