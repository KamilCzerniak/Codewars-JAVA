import java.util.stream.IntStream;

public class BingoOrNot {
    public static String bingo(int[] numberArray) {
        return IntStream.of(numberArray)
                .distinct()
                .filter(a -> String.valueOf((char) ('A' + a - 1))
                        .matches("[BINGO]"))
                .count() == 5 ? "WIN" : "LOSE";
    }
}
