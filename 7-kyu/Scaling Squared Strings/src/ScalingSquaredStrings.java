public class ScalingSquaredStrings {
    public static String scale(String strng, int k, int v) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String[] s1 = strng.split("\n");
        for (int i = 0; i < s1.length; i++) {
            String[] s2 = s1[i].split("");
            for (int j = 0; j < s2.length; j++) {
                for (int l = 0; l < k; l++) {
                    sb1.append(s2[j]);
                }
            }
            sb1.append("\n");
            for (int j = 0; j < v; j++) {
                sb2.append(sb1);
            }
            sb1 = new StringBuilder();
        }
        return sb2.toString().trim();
    }
}
