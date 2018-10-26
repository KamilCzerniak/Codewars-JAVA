public class IsItANumber {

    public static boolean isDigit(String s) {

        try {
            float f = Float.parseFloat(s.trim());
        } catch (NumberFormatException n) {
            return false;
        }
        return true;
    }
}
