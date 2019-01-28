public class Kata {
    public static String simpleTransposition(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            for (int j = i; j < text.length(); j += 2) {
                sb.append(text.charAt(j));
            }
        }
        return sb.toString();
    }
}