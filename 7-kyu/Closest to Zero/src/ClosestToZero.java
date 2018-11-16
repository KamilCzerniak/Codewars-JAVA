import java.util.stream.IntStream;

public class ClosestToZero {
    public static Integer find(int[] arr) {
        int min = IntStream.of(arr).map(Math::abs).min().getAsInt();
        int[] a = IntStream.of(arr).filter(i -> Math.abs(i) == min).toArray();
        return a.length > 1 ? null : a[0];
    }
}
