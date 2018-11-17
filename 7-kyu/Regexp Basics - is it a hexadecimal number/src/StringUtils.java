public class StringUtils {
    public static boolean isHexNumber(String s) {
        return s.matches("(0[xX])?[0-9a-fA-F]+");
    }
}
