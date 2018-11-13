public class Fibonacci {
    public static long fib(int n) {

        long temp1 = 0;
        long temp2 = 1;
        long result = 0;
        for (int i = 0; i <= n - 2; i++) {
            result = temp1 + temp2;
            temp1 = temp2;
            temp2 = result;

        }
        return result;
    }
}
