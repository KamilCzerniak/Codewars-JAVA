public class StringyStrings {
    public static String stringy(int size) {
        if (size == 0) {
            return "";
        } else if (size == 1) {
            return "1";
        }
        String temp = (size % 2 == 0) ? "0" : "1";
        return stringy(size - 1) + temp;
    }

    public static void main(String[] args) {
        System.out.println(stringy(1));
    }
}
