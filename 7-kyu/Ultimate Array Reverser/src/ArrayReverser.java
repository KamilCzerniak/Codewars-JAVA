public class ArrayReverser {
    public static String[] reverse(String[] a) {

        String s = new StringBuilder(String.join("", a)).reverse().toString();
        int length = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = s.substring(length, length + a[i].length());
            length += a[i].length();
        }
        return a;
    }
}