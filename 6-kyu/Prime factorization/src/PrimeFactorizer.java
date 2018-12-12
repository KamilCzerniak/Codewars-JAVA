import java.util.LinkedHashMap;
import java.util.Map;

public class PrimeFactorizer {
    public java.util.Map<Long, Integer> factor(long n) {
        Map<Long, Integer> map = new LinkedHashMap<>();
        for (long i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                map.putIfAbsent(i, 0);
                map.put(i, map.get(i) + 1);
                n /= i;
            }
        }
        if (n != 1) {
            map.putIfAbsent(n, 0);
            map.put(n, map.get(n) + 1);
        }
        return map;
    }
}
