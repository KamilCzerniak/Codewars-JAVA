public class ZebulansNightmare {
    public static String zebulansNightmare(final String functionName) {
        String[] s = functionName.split("_");
        StringBuilder sb = new StringBuilder(s[0]);
        for (int i = 1; i < s.length; i++) {
            sb.append(s[i].substring(0, 1).toUpperCase()).append(s[i].substring(1));
        }
        return sb.toString();
    }
}
