public class Kata {
    public static String dative(String word) {

        for (int i = word.length() - 2; i >= 0; i--) {
            char character = word.charAt(i);
            if ("eéiíöõüû".indexOf(character) != -1) {
                return word + "nek";
            } else if ("aáoóuú".indexOf(character) != -1) {
                return word + "nak";
            }
        }
        return word;
    }
}
