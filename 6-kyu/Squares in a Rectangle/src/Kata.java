public class Kata {
    public static int findSquares(int x, int y) {
        int res = 0;
        while (y > 0) {
            res += x * y;
            x--;
            y--;
        }
        return res;
    }
}