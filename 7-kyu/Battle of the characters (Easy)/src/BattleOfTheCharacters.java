public class BattleOfTheCharacters {
    public static String battle(final String x, final String y) {
        int points = x.chars().reduce(0, (a, b) -> a + (b - 64))
                - y.chars().reduce(0, (a, b) -> a + (b - 64));
        return points == 0 ? "Tie!" : points > 0 ? x : y;
    }
}
