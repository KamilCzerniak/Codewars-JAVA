public class ReplaceEveryNth {
    public static String replaceNth(String text, int n, char oldValue, char newValue) {

        if (n > 0 && n <= text.length()) {
            String[] array = text.split("");
            int cnt = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(String.valueOf(oldValue))) {
                    cnt++;
                    if (cnt % n == 0) {
                        array[i] = String.valueOf(newValue);
                    }
                }
            }
            return String.join("", array);
        }
        return text;
    }
}
