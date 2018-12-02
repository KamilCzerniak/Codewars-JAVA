import java.util.ArrayList;
import java.util.List;

public class BackWardsPrime {
    public static String backwardsPrime(long start, long end) {
        List<String> list = new ArrayList<>();
        for (long i = start; i <= end; i++) {
            String reversed = new StringBuilder(String.valueOf(i)).reverse().toString();
            if (i % 2 != 0
                    && isPrime(i)
                    && !String.valueOf(i).equals(reversed)
                    && isPrime(Long.valueOf(reversed))) {
                list.add(String.valueOf(i));
            }
        }
        return String.join(" ", list);
    }


    public static boolean isPrime(long number) {
        for (long i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
