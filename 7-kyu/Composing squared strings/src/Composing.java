public class Composing {
    public static String compose(String s1, String s2) {
        String[] arr = (s1 + "\n" + s2).split("\n");
        String[] result = new String[arr.length / 2];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i].substring(0, i + 1)
                    + arr[arr.length - 1 - i].substring(0, arr[arr.length - 1 - i].length() - i);
        }
        return String.join("\n", result);
    }
}
