public class StringTask {
    public static String perform(String word) {
        String result = word.toLowerCase().replaceAll("[aeiouy]", "")
                .replaceAll("", ".");
        return result.substring(0, result.length() - 1);
    }
}
