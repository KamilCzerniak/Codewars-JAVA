public class THB {
    public static String testing(String initial) {
        return initial == null ? "" : initial.replaceAll("[^tThHbB]", "");

    }
}
