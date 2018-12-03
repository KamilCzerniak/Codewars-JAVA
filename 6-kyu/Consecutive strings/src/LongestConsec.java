public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {

        StringBuilder sb;
        String result = "";
        for (int i = 0; i <= strarr.length - k; i++) {
            sb = new StringBuilder();
            for (int j = i; j < i + k; j++) {
                sb.append(strarr[j]);
            }
            if (sb.length() > result.length()) {
                result = sb.toString();
            }
        }
        return result;
    }
}
