public class Kata {
    public static boolean primeString(String s) {

        for (int i = 1; i < s.length() / 2 + 1; i++) {
            if (s.replace(s.substring(0, i), "").length() == 0) {
                return false;
            }
        }
        return true;
    }
}
