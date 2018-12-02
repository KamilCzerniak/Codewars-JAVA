import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata {
    public static int[] DataReverse(int[] data) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i += 8) {
            sb.append(IntStream.of(data).mapToObj(String::valueOf).collect(Collectors.joining()), data.length - i - 8, data.length - i);
        }
        return Arrays.stream(sb.toString().split("")).mapToInt(Integer::valueOf).toArray();
    }
}
