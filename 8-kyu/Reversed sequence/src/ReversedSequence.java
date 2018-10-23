public class ReversedSequence {

    public static int[] reverse(int n) {

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = n - i;
        }
        return a;
    }

    public static void main(String[] args) {
        reverse(5);
    }
}
