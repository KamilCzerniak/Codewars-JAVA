public class Kata {
    public static int getCount(int n) {
        int cnt = 0;
        String num = String.valueOf(n);
        for (int i = 1; i < num.length(); i++) {
            for (int j = 0; j + i <= num.length(); j++) {
                int temp = Integer.valueOf(num.substring(j, j + i));
                if (temp != 0 && n % temp == 0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}