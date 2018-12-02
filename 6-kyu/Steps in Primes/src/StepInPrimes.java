class StepInPrimes {

    public static long[] step(int g, long m, long n) {
        for (long i = m; i <= n - g; i++) {
            if (i % 2 != 0 && isPrime(i) && isPrime(i + g)) {
                return new long[]{i, i + g};
            }
        }
        return null;
    }

    public static boolean isPrime(long num) {
        for (long i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}