import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sumpowdig {
    public static long[] eqSumPowDig(long hmax, int exp) {
        List<Long> list = new ArrayList<>();
        for (long i = 2; i <= hmax; i++) {
            long sum = Arrays.stream(String.valueOf(i).split(""))
                    .mapToLong(Long::valueOf)
                    .map(l -> (long) Math.pow(l, exp))
                    .sum();
            if (i == sum) {
                list.add(i);
            }
        }
        return list.stream().mapToLong(Long::valueOf).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(eqSumPowDig(400, 3)));
    }
}
