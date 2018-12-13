import java.util.stream.IntStream;

public class ArcParabLen {

    public static double lenCurve(int n) {
        double dx = 1.0 / n;
        return IntStream.range(0, n)
                .mapToDouble(i -> Math.sqrt(Math.pow(dx, 2) + Math.pow(Math.pow(dx * (i + 1), 2) - Math.pow(dx * i, 2), 2)))
                .sum();

    }
}