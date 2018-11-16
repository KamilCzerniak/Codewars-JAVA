public class Kata {
    public static int[] squareUp(int n) {
        int[] arr = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < i + 2; j++) {
                arr[n * (1 + i) - j] = j;
            }
        }
        return arr;
    }
}
