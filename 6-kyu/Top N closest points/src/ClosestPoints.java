import java.util.Arrays;
import java.util.Comparator;

public class ClosestPoints {

    public static int[][] getTopN(int[][] points, int n) {

        Arrays.sort(points, Comparator.comparingInt(a -> a[0] * a[0] + a[1] * a[1]));
        return n < points.length ? Arrays.copyOf(points, n) : points;
    }
}