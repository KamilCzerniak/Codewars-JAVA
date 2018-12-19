import java.util.Arrays;

public class AlphabetWars {

    public static String reinforcesMassacre(String[] reinforces, String[] airstrikes) {

        int[] cnt = new int[reinforces[0].length()];
        String[][] arr = new String[airstrikes.length][reinforces[0].length() + 2];
        for (int i = 0; i < arr.length; i++) {
            String[] temp = airstrikes[i].split("");
            Arrays.fill(arr[i], "0");
            for (int j = 1; j <= temp.length; j++) {
                if (temp[j - 1].equals("*")) {
                    arr[i][j - 1] = "1";
                    arr[i][j] = "1";
                    arr[i][j + 1] = "1";
                }
            }
            arr[i] = Arrays.copyOfRange(arr[i], 1, arr[i].length - 1);
        }

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                cnt[i] += Integer.valueOf(arr[j][i]);
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] >= reinforces.length) {
                sb.append("_");
            } else {
                sb.append(reinforces[cnt[i]].charAt(i));
            }
        }
        return sb.toString();

    }
}