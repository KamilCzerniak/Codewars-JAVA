import java.util.stream.IntStream;

public class SimpsonIntegration {

    public static double simpson(int n) {
        return (Math.PI / (3.0 * n)) * (getF(Math.PI)
                + 4 * IntStream.rangeClosed(1, n / 2)
                .mapToDouble(i -> getF((2 * i - 1) * Math.PI / n))
                .sum() + 2 * IntStream.rangeClosed(1, n / 2 - 1)
                .mapToDouble(i -> getF((double) 2 * i * Math.PI / n))
                .sum());
    }

    private static double getF(double num) {
        return 3 / 2.0 * Math.pow(Math.sin(num), 3);
    }
}
