public class Kata {
    public static int[] multiples(int m, int n) {

        int[] arr = new int[m];

        for (int i = 1; i < m + 1; i++) {
            arr[i - 1] = n * i;
        }

        return arr;
    }
}