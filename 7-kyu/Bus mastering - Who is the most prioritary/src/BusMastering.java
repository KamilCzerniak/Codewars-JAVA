public class BusMastering {
    public static String arbitrate(String input, int n) {
        int index = input.indexOf("1");
        return index == -1 ? input : input.substring(0, index + 1) + input.substring(index + 1).replace("1", "0");
    }
}
