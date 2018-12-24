import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static List<Integer> notPrimes(int a, int b) {

        return IntStream
                .range(a, b)
                .filter(x -> String.valueOf(x).replaceAll("[2357]", "").length() == 0 && !isPrime(x))
                .boxed()
                .collect(Collectors.toList());


    }

    private static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }

}