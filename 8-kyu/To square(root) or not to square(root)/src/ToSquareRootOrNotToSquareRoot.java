public class ToSquareRootOrNotToSquareRoot {

    public static int[] squareOrSquareRoot(int[] array) {
        int[] a = new int[array.length];
        for (int i = 0; i < a.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                a[i] = (int) Math.sqrt(array[i]);
            } else {
                a[i] = (int) Math.pow(array[i], 2);
            }
        }
        return a;
    }

    public static void main(String[] args) {

    }
}
