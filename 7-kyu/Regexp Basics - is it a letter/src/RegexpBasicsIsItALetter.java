public class RegexpBasicsIsItALetter {
    public static boolean isLetter(String s) {
        return s.length() == 1 && Character.isLetter(s.charAt(0));
    }
}
