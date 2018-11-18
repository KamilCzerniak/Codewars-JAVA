public class Trigrams {
    public static String trigrams(String phrase) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phrase.length() - 2; i++) {
            sb.append(phrase.replace(" ", "_"), i, i + 3).append(" ");
        }
        return sb.toString().trim();
    }
}
