class Nba {

    public static String nbaCup(String resultSheet, String toFind) {

        if (toFind.equals("")) {
            return "";
        }
        String[] matches = resultSheet.split(",");
        int wins = 0;
        int losses = 0;
        int draws = 0;
        int pointsScored = 0;
        int pintsConceded = 0;
        int pointsA = 0;
        int pointsB = 0;
        String[] arr;

        for (int i = 0; i < matches.length; i++) {
            if (matches[i].contains(".")) {
                return "Error(float number):" + matches[i];
            }

            arr = matches[i]
                    .substring(0, matches[i].lastIndexOf(" "))
                    .replaceAll(" \\d+ ", "@")
                    .split("@");

            if (arr[0].equals(toFind) || arr[1].equals(toFind)) {

                String temp1 = matches[i].substring(arr[0].length() + 1, matches[i].indexOf(arr[1]) - 1);
                String temp2 = matches[i].substring(matches[i].lastIndexOf(" ") + 1);

                if (matches[i].indexOf(toFind) == 0) {
                    pointsA = Integer.valueOf(temp1);
                    pointsB = Integer.valueOf(temp2);
                } else if (matches[i].indexOf(toFind) > 0) {
                    pointsA = Integer.valueOf(temp2);
                    pointsB = Integer.valueOf(temp1);

                }

                if (pointsA > pointsB) {
                    wins++;
                } else if (pointsA < pointsB) {
                    losses++;
                } else {
                    draws++;
                }

                pointsScored += pointsA;
                pintsConceded += pointsB;

            }
        }

        return wins + losses + draws > 0 ? String.format("%s:W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d"
                , toFind
                , wins
                , draws
                , losses
                , pointsScored
                , pintsConceded
                , wins * 3 + draws) : toFind + ":This team didn't play!";

    }
}