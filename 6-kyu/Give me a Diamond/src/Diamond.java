public class Diamond {
    public static String print(int n) {
        if (n < 0 || n % 2 == 0) {
            return null;
        }
        String temp = "";
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n / 2 - i) {
                    temp += " ";
                } else if (j > n / 2 + i) {
                    temp += "\n";
                    break;
                } else {
                    temp += "*";
                }
            }
        }
        temp += "\n";
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    temp += " ";
                } else if (j >= n - i - 1) {
                    temp += "\n";
                    break;
                } else {
                    temp += "*";
                }
            }
        }
        return temp;
    }
}