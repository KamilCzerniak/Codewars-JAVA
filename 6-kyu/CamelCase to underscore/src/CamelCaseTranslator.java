public class CamelCaseTranslator {
    public static String toUnderScore(String name) {
        if (name.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(name);
        for (int i = 0; i < sb.length() - 1; i++) {
            String temp = sb.substring(i, i + 2);
            if (temp.matches("\\d[A-Z]|[A-Za-z]\\d|[a-z][A-Z]|[A-Z][A-Z]")) {
                sb.insert(i + 1, '_');
                i++;
            }
        }
        return sb.toString();
    }
}
