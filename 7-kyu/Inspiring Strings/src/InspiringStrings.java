public class InspiringStrings {
    public static String longestWord(String wordString) {

        String[] s = wordString.split(" ");
        String longest = s[0];
        for (int i = 1; i < s.length; i++) {
            if (s[i].length() >= longest.length()) {
                longest = s[i];
            }
        }
        return longest;
    }
}
