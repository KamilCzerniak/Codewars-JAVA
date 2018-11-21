public class FirstNonRepeated {
    public static Character firstNonRepeated(String source) {
        for (int i = 0; i < source.length(); i++) {
            char letter = source.charAt(i);
            if (source.chars().filter(c -> c == letter).count() == 1) {
                return letter;
            }
        }
        return null;
    }
}
