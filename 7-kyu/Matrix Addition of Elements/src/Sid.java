import java.util.stream.IntStream;

public class Sid {
    public static int sumOfElements(int matrix[][]) {
        return IntStream.range(0, matrix.length)
                .reduce(0, (a, b) -> a + IntStream.of(matrix[b]).sum());
    }
}
