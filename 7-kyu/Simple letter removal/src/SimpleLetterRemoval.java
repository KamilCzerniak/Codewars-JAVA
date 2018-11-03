public class SimpleLetterRemoval {
    public static String solve(String s, int k) {

        int cnt = 0;
        for (int i = 97; i < 123 && cnt < k; i++) {
            String letter = String.valueOf((char) i);
            while (s.contains(letter) && cnt < k) {
                s = s.replaceFirst(letter, "");
                cnt++;
            }
        }
        return s;
    }
}
