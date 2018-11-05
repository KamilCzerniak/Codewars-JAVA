
public class DeltaBits {
    public static int convertBits(int a, int b) {

        String first = Integer.toBinaryString(a);
        String sec = Integer.toBinaryString(b);
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < Math.abs(first.length() - sec.length()); i++) {
            temp.append("0");
        }
        if (first.length() > sec.length()) {
            sec = temp.append(sec).toString();
        } else {
            first = temp.append(first).toString();
        }
        int cnt = 0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != sec.charAt(i)) {
                cnt++;
            }
        }
        return cnt;
    }
}
