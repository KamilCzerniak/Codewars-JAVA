import java.util.stream.IntStream;

public class DiceDotCount {
    public static int totalAmountVisible(int topNum, int numOfSides) {

        return IntStream.rangeClosed(1, numOfSides).sum() - numOfSides - 1 + topNum;
    }
}
