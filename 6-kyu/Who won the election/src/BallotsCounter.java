import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BallotsCounter {

    public static String getWinner(final List<String> listOfBallots) {
        return listOfBallots
                .stream()
                .distinct()
                .collect(Collectors.toMap(
                        a -> a
                        , b -> (int) listOfBallots.stream()
                                .filter(s -> s.equals(b))
                                .count()))
                .entrySet()
                .stream()
                .filter(s -> s.getValue() > listOfBallots.size() / 2)
                .findFirst().map(Map.Entry::getKey).orElse(null);
    }
}