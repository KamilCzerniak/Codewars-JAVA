public class PascalsTriangle {
    public static int[][] pascal(int depth) {

        int[][] result = new int[depth][];

        for (int i = 0; i < result.length; i++) {
            int[] temp = new int[i + 1];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = binCoe(i, j);
            }
            result[i] = temp;
        }
        return result;
    }

    public static int binCoe(int n, int k) {
        int res = 1;
        for (int i = 0; i < k; i++) {
            res = (res * (n - i)) / (i + 1);
        }
        return res;
    }
}
