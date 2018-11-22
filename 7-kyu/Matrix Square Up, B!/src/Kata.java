public class Kata {
    public static String[][] matrixSquareUp(int b) {
        String[][] matrix = new String[b][b];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = j < b - i - 1 ? "x" : String.valueOf(b - j);
            }
        }
        return matrix;
    }
}
