import java.util.Arrays;

public class Summy {
    static long summy(String stringOfInts) {
        return Arrays.stream(stringOfInts.split(" ")).mapToLong(Long::valueOf).sum();
    }
}
