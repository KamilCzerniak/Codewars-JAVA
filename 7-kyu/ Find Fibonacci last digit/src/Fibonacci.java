public class Fibonacci {

    public static double getFibNumb(int n) {
        int result = 0;
        int temp1 = 0;
        int temp2 = 1;
        for (int i = 2; i <= n; i++) {
            result = (temp1 + temp2) % 10;
            temp1 = temp2;
            temp2 = result;
        }
        return result;
    }
}
