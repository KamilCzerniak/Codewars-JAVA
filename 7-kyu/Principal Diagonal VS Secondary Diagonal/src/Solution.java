public class Solution {
    public static String diagonal(int[][] matrix) {
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            result += matrix[i][i] - matrix[i][matrix[i].length - 1 - i];
        }
        return result > 0
                ? "Principal Diagonal win!"
                : result < 0
                ? "Secondary Diagonal win!"
                : "Draw!";
    }
}