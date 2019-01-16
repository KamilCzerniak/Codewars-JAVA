public class GrillIt {

    public static String grille(String message, int code) {

        String binNumber = Integer.toBinaryString(code);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Math.min(message.length(), binNumber.length()); i++) {
            if (binNumber.charAt(binNumber.length() - i - 1) == '1') {
                sb.append(message.charAt(message.length() - i - 1));
            }
        }
        return sb.reverse().toString();
    }
}