public class BlackOrWhiteKey {
    public static String blackOrWhiteKey(int keyPressCount) {

        return String.valueOf("wbwwbwbwwbwb".charAt(((keyPressCount - 1) % 88) % 12))
                .replace("w", "white")
                .replace("b", "black");
    }
}
