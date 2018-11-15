public class Kata {
    public static int[] addingShifted(int[][] arrayOfArrays, int shift) {
        int[] res = new int[arrayOfArrays[0].length + (arrayOfArrays.length - 1) * shift];
        for (int i = 0; i < arrayOfArrays.length; i++) {
            for (int j = 0; j < arrayOfArrays[i].length; j++) {
                res[j + shift * i] += arrayOfArrays[i][j];
            }
        }
        return res;
    }
}
