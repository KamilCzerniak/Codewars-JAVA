public class CountOfPositivesSumOfNegatives {

    public static int[] countPositivesSumNegatives(int[] input) {

        if (input != null && input.length > 0) {
            int[] array = new int[2];
            for (int n : input
            ) {
                if (n > 0) {
                    array[0]++;
                } else if (n < 0) {
                    array[1] += n;
                }
            }
            return array;
        }
        return new int[]{};
    }

    public static void main(String[] args) {

    }
}
