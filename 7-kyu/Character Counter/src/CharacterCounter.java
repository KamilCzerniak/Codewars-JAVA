import java.util.Arrays;

public class CharacterCounter {
    public static boolean validateWord(String word) {

        String[] chars = Arrays.stream(word.toLowerCase().split("")).distinct().toArray(String[]::new);
        int temp = word.toLowerCase().replaceAll("[^" + chars[0] + "]", "").length();
        int cnt;
        for (int i = 1; i < chars.length; i++) {
            cnt = word.toLowerCase().replaceAll("[^" + chars[i] + "]", "").length();
            if (temp != cnt) {
                return false;
            }
            temp = cnt;
        }
        return true;
    }
}
