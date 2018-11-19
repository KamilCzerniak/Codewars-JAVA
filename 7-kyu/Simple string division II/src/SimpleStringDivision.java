public class SimpleStringDivision {
    public static int solve(String s, int k) {
        int cnt = 0;
        String[] array = s.split(" ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (Integer.valueOf(array[i] + array[(i + j) % array.length]) % k == 0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
