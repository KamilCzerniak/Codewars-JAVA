public class RepeatIt {

    public static String repeatString(final Object toRepeat, final int n) {

        if (toRepeat instanceof String) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(toRepeat);
            }
            return sb.toString();
        }
        return "Not a string";
    }

    public static void main(String[] args) {
        System.out.println(repeatString("Hello", 2));
    }
}
