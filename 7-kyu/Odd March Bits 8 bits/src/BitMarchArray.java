public class BitMarchArray {
    public static int[][] BitMarch(int n) {
        int[][] march = new int[9 - n][8];
        for (int i = 0; i < march.length; i++) {
            for (int j = 0; j < march[i].length; j++) {
                march[i][j] = j >= march[i].length - n - i && j <= march[i].length - 1 - i ? 1 : 0;
            }
        }
        return march;
    }
}
