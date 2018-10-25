public class NoZerosForHeros {

    public static int noBoringZeros(int n) {
        if (n != 0) {
            int num = n;
            while (num % 10 == 0) {
                num /= 10;
            }
            return num;
        }
        return n;
    }
}


