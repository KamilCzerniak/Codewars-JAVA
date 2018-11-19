import java.util.stream.IntStream;

public class ElectionWinners {
    static int find(final int[] votes, final int k) {
        int maxVotes = IntStream.of(votes).max().getAsInt();
        int result = (int) IntStream.of(votes)
                .map(i -> i + k)
                .filter(i -> k > 0 ? i > maxVotes : i == maxVotes)
                .count();
        return k == 0 && result > 1 ? 0 : result;
    }
}
