public class ThinkingTestingIncompleteString {

    public static String testIncompleteString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i += 2) {
            sb.append(Character.toChars((s.charAt(i) + s.charAt(i + 1)) / 2));
        }
        if (s.length() % 2 != 0) {
            sb.append(s.charAt(s.length() - 1));
        }
        return sb.toString();
    }
}
