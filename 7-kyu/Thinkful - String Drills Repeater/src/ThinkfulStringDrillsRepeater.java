public class ThinkfulStringDrillsRepeater {
    public static String repeat(String string, long n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(string);
        }
        return sb.toString();
    }
}
