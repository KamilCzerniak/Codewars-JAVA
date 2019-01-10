import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collatz {
    public static String collatz(int n) {
        List<String> list = new ArrayList<>(Arrays.asList(String.valueOf(n)));
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            list.add(String.valueOf(n));
        }
        return String.join("->", list);
    }
}