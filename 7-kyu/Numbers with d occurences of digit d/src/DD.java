public class DD {
    public static boolean isDD(int n) {

        String[] d = String.valueOf(n).split("");
        for (String digits : d) {
            if (String.valueOf(n).replaceAll("[^" + digits + "]", "").length() == Integer.valueOf(digits)) {
                return true;
            }
        }
        return false;
    }
}
