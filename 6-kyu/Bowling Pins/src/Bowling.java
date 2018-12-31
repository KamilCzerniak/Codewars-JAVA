import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bowling {
    public static String bowlingPins(int[] arr) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = Arrays
                .stream(arr)
                .map(a -> new int[]{27, 18, 20, 9, 11, 13, 0, 2, 4, 6}[a - 1])
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (j <= 7 - i - 1
                        && j >= i
                        && (i % 2 == 0 ? j % 2 == 0 : j % 2 != 0)
                        && !list.contains(i*8 + j)) {
                    sb.append("I");
                } else {
                    sb.append(" ");
                }
            }
            if (i != 3) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}