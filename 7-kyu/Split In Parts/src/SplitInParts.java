public class SplitInParts {
    public static String splitInParts(String s, int partLength) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += partLength) {
            sb.append(s, i, Math.min(i + partLength, s.length())).append(" ");
        }
        return sb.toString().trim();

    }
}
