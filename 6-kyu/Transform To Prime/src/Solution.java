import java.util.stream.IntStream;

public class Solution {
    public static int minimumNumber(int[] numbers) {

        int sum = IntStream.of(numbers).sum();
        int res = 0;
        while (!isPrime(sum + res)) {
            res++;
        }
        return res; // Do your magic!
    }

    public static boolean isPrime(int res) {

        for (int i = 2; i < res; i++) {
            if (res % i == 0) {
                return false;
            }
        }
        return true;
    }
}
