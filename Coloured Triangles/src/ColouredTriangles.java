public class ColouredTriangles {
    public static char triangle(final String row) {
        String s = row;
        String temp;
        StringBuilder sb = new StringBuilder();
        while (s.length() > 1) {
            for (int i = 0; i < s.length() - 1; i++) {
                temp = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1));
                if (temp.matches("BR|RB|GG")) {
                    sb.append("G");
                } else if (temp.matches("BG|GB|RR")) {
                    sb.append("R");
                } else if (temp.matches("RG|GR|BB")) {
                    sb.append("B");
                }
            }
            s = sb.toString();
            sb = new StringBuilder();
        }
        return s.charAt(0);
    }
}
