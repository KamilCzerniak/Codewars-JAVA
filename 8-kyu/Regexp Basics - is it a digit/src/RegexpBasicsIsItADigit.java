public class RegexpBasicsIsItADigit {
    public static boolean isDigit(String s) {
        return s.length() == 1 && Character.isDigit(s.charAt(0));
    }
}
