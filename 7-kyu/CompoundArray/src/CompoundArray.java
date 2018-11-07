public class CompoundArray {
    public static int[] compoundArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        while (i < c.length) {
            if (j < a.length) {
                c[i] = a[j];
                i++;
            }
            if (j < b.length) {
                c[i] = b[j];
                i++;
            }
            j++;
        }
        return c;
    }
}
