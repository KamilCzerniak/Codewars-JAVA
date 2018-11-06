public class ReversingFun {
    public static String funReverse(String s) {
        StringBuilder sb = new StringBuilder();
        if (s.length() == 0) {
            return s;
        }
        s = new StringBuilder(s).reverse().toString();
        sb.append(s.charAt(0));
        return sb.toString() + funReverse(s.substring(1));
    }
}
