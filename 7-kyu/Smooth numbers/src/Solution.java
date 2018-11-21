public class Solution {
    public static String isSmooth(long n) {
        String result = "";
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
                result = "power of 2";
            } else if (n % 3 == 0) {
                n /= 3;
                result = "3-smooth";
            } else if (n % 5 == 0) {
                n /= 5;
                result = "Hamming number";
            } else if (n % 7 == 0) {
                n /= 7;
                result = "humble numbers";
            } else {
                return "non-smooth";
            }
        }
        return result;
    }
}
