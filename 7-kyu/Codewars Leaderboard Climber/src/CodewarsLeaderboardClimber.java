public class CodewarsLeaderboardClimber {

    public static String leaderBoard(String user, int userScore, int yourScore) {

        if (yourScore > userScore) {
            return "Winning!";
        } else if (yourScore == userScore) {
            return "Only need one!";
        }

        int difference = userScore - yourScore;
        int betaKatas = difference / 3;
        int eightKyuKatas = difference % 3;

        return String.format("To beat %s's score, I must complete %d Beta kata and %d 8kyu kata.%s"
                , user
                , betaKatas
                , eightKyuKatas
                , betaKatas + eightKyuKatas > 1000 ? " Dammit!" : "");
    }

}
