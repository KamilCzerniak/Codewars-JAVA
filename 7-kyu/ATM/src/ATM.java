public class ATM {
    public int solve(int n) {
        int[] nominal = {500, 200, 100, 50, 20, 10};
        if (n % 10 == 0) {
            int cnt = 0;
            for (int i = 0; n > 0; i++) {
                cnt += n / nominal[i];
                n %= nominal[i];
            }
            return cnt;
        }
        return -1;
    }
}
