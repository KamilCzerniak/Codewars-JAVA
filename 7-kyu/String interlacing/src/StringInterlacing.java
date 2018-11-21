public class StringInterlacing {
    public static String interlace(final String first, final String second) {

        String temp1 = first.replaceAll("\\s", "");
        String temp2 = second.replaceAll("\\s", "");
        if (temp1.length() < temp2.length()) {
            return interlace(temp2, temp1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp1.length(); i++) {
            sb.append(temp1.charAt(i)).append(temp2.charAt(i % temp2.length()));
        }
        return sb.toString();
    }
}
