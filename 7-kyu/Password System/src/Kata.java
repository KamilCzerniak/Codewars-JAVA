public class Kata {
    public static String helpZoom(final int[] key) {
        for (int i = 0; i < key.length / 2; i++) {
            if (key[i] != key[key.length - 1 - i]) {
                return "No";
            }
        }
        return "Yes";
    }
}