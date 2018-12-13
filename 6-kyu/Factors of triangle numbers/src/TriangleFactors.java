public class TriangleFactors {
    public int calculate(int n) {

        int number = 0;
        for (int i = 1; getFactorNumbers(number) <= n; i++) {
            number = ((1 + i) * i) / 2;
        }
        return number;
    }

    private int getFactorNumbers(int num) {
        int res = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                res += i != Math.sqrt(num) ? 2 : 1;
            }
        }
        return res;
    }
}