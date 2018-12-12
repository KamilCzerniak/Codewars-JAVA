public class Dinglemouse {

    public static int howManyBees(final char[][] hive) {
        if (hive == null || hive.length == 0) {
            return 0;
        }
        int cnt = 0;
        for (int i = 0; i < hive.length; i++) {
            for (int j = 0; j < hive[i].length - 2; j++) {
                String row = String.valueOf(hive[i][j]) + String.valueOf(hive[i][j + 1]) + String.valueOf(hive[i][j + 2]);
                if (row.matches("bee|eeb")) {
                    cnt++;
                }
            }
        }

        for (int i = 0; i < hive[0].length; i++) {
            for (int j = 0; j < hive.length - 2; j++) {
                String column = String.valueOf(hive[j][i]) + String.valueOf(hive[j + 1][i]) + String.valueOf(hive[j + 2][i]);
                if (column.matches("bee|eeb")) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}