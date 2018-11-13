public class Solution {
    public static boolean tidyNumber(int number) {
        String[] s = String.valueOf(number).split("");
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i].compareTo(s[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }
}
