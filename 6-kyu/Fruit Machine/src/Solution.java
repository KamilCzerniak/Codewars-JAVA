import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int fruit(final String[][] reels, final int[] spins) {
        List<String> items = Arrays.asList("Wild", "Star", "Bell", "Shell", "Seven", "Cherry", "Bar", "King", "Queen", "Jack");
        String[] reel = {reels[0][spins[0]], reels[1][spins[1]], reels[2][spins[2]]};
        int res = 0;
        if (Arrays.stream(reel).distinct().count() == 2) {
            String temp = "";
            for (int i = 0; i < reel.length; i++) {
                if (reel[i].equals(reel[(i + 1) % 3])) {
                    temp = reel[i];
                }
            }
            int score = (10 - (items.indexOf(temp)));
            res = Arrays.asList(reel).contains("Wild") && !temp.equals("Wild") ? 2 * score : score;
        } else if (Arrays.stream(reel).distinct().count() == 1) {
            res = (100 - (items.indexOf(reel[0])) * 10);
        }
        return res;
    }
}
