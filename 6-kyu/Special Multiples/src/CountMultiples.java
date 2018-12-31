public class CountMultiples {

    public static long countSpecMult(long n, long mxval) {

        long temp = 2;
        for (int i = 3; n > 1; i += 2) {
            if (isPrime(i)) {
                temp *= i;
                n--;
            }
        }

        return (long) Math.floor((double) mxval / temp);
    }


    private static boolean isPrime(long num) {
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}