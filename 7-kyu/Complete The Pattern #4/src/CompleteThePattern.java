public class CompleteThePattern {
    public static String pattern(int n) {

        if (n > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    sb.append(String.valueOf(j));
                }
                if (i != n) {
                    sb.append("\n");
                }
            }
            return sb.toString();
        }
        return "";
    }
}
