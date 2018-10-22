public class altERnaTIngcAsEALTerNAtiNGCaSe {

    public static String toAlternativeString(String string) {

        StringBuilder sb = new StringBuilder();
        for (String s : string.split("")) {
            if (s.charAt(0) >= 65 && s.charAt(0) <= 90) {
                sb.append(s.toLowerCase());
            } else if (s.charAt(0) >= 97 && s.charAt(0) <= 122) {
                sb.append(s.toUpperCase());
            } else {
                sb.append(s);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
