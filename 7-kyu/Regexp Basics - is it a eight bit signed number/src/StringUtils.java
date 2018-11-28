public class StringUtils {
    public static boolean isSignedEightBitNumber(String s) {

        return s.matches("-128|-?1(2[0-7]|[01]\\d)|-?([1-9]\\d|[1-9])|0");

    }
}
