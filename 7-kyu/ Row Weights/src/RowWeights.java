public class RowWeights {
    public static int[] rowWeights(final int[] weights) {
        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                sumA += weights[i];
            } else {
                sumB += weights[i];
            }
        }
        return new int[]{sumA, sumB};
    }
}
