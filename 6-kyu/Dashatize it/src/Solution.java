public class Solution {
    public static String dashatize(int num) {
        String temp = String.valueOf(num).replace("-", "");
        StringBuilder sb = new StringBuilder().append(temp.charAt(0));
        for (int i = 0; i < temp.length() - 1; i++) {
            if ((int)temp.charAt(i) % 2 != 0 || (int)temp.charAt(i + 1) % 2 != 0) {
                sb.append("-");
            }
            sb.append(temp.charAt(i + 1));
        }
        return sb.toString();
    }
}
