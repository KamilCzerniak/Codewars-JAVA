public class ExclamationMarksSeries {
    public static String removeBang(String str) {
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            while (s[i].endsWith("!")) {
                StringBuilder sb = new StringBuilder(s[i]);
                sb.deleteCharAt(sb.length() - 1);
                s[i] = sb.toString();
            }
        }
        return String.join(" ", s);
    }
}
