public class RockPaperScissors {

    public static String rps(String p1, String p2) {
        return p1.equals("scissors") && p2.equals("paper")
                || p1.equals("rock") && p2.equals("scissors")
                || p1.equals("paper") && p2.equals("rock")
                ? "Player 1 won!"
                : p1.equals("scissors") && p2.equals("rock")
                || p1.equals("paper") && p2.equals("scissors")
                || p1.equals("rock") && p2.equals("paper")
                ? "Player 2 won!"
                : "Draw!";
    }

    public static void main(String[] args) {

    }
}
