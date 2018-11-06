public class CartesianNeighbors {
    public static int[][] cartesianNeighbor(int x, int y) {

        int[][] m = new int[8][2];
        int a = x - 1;
        int b = y - 1;

        for (int i = 0; i < m.length; i++) {
            if (a == x && b == y) {
                b++;
            } else if (b > y + 1) {
                a++;
                b = y - 1;
            }
            m[i] = new int[]{a, b};
            b++;

        }
        return m;
    }
}

