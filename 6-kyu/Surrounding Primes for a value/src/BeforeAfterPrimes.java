class BeforeAfterPrimes {

    public static long[] primeBefAft(long num) {

        long before = num - 1;
        long after = num + 1;

        while (!isPrime(before)) {
            before--;
        }

        while (!isPrime(after)) {
            after++;
        }
        return new long[]{before, after};
    }

    private static boolean isPrime(long n) {

        if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}