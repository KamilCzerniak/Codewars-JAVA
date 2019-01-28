import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

class KprimesSteps {

    public static List<long[]> kprimesStep(int k, int step, long start, long nd) {

        List<long[]> list = new ArrayList<>();

        long[] primes = LongStream.rangeClosed(start, nd)
                .filter(a -> isKPrime(k, a))
                .toArray();

        for (int i = 0; i < primes.length - 1; i++) {
            for (int j = 1; j < primes.length; j++) {
                if (primes[j] - primes[i] == step) {
                    list.add(new long[]{primes[i], primes[j]});
                }
            }
        }
        return list;
    }

    private static boolean isKPrime(int k, long num) {

        int cnt = 0;
        for (int i = 2; i <= Math.sqrt(num); i += i == 2 ? 1 : 2) {
            while (num % i == 0) {
                cnt++;
                num /= i;
            }
        }
        return num > 1 ? cnt + 1 == k : cnt == k;
    }
}