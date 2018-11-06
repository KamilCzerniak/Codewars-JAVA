public class CountTheCharacters {
    public static int charCount(String str, char c) {
        return str.length() - str.toLowerCase()
                .replaceAll(String.valueOf(c).toLowerCase(), "")
                .length();
    }
}
