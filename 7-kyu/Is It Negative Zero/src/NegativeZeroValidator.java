public class NegativeZeroValidator {
    public static boolean isNegativeZero(Float n) {
        return String.valueOf(n).equals("-0.0");
    }
}