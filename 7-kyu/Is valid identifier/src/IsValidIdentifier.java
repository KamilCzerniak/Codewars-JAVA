public class IsValidIdentifier {
    public static boolean isValid(String idn) {

        return idn.matches("[a-zAZ_$][\\da-zA-Z_$]*");
    }
}
