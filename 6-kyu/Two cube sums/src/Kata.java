public class Kata {
    public static boolean hasTwoCubeSums(int n) {
        int cnt = 0;
        int limit = (int) Math.cbrt(n);
        int sum;

        for (int i = 1; i <= limit; i++) {
            for (int j = i; j <= limit; j++) {
                sum = (int) (Math.pow(i, 3) + Math.pow(j, 3));
                if (sum == n) {
                    cnt++;
                }
            }
        }
        return cnt == 2;
    }
}