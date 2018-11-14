public class Kata {
    public static String alphabetWar(String fight) {
        String letter = "wpbs+zdqm";
        int points = fight.chars().reduce(0, (a, b) -> a + (letter.indexOf(b) == -1 ? 0
                : letter.indexOf(b) - 4));
        return points < 0 ? "Left side wins!"
                : points > 0 ? "Right side wins!" : "Let's fight again!";
    }
}
