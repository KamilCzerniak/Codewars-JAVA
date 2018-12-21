public class Diamond {
    public static String print(int n) {
        if (n < 0 || n % 2 == 0) {
            return null;
        }
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n / 2 - i) {
                    temp.append(" ");
                } else if (j > n / 2 + i) {
                    temp.append("\n");
                    break;
                } else {
                    temp.append("*");
                }
            }
        }
        temp.append("\n");
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    temp.append(" ");
                } else if (j >= n - i - 1) {
                    temp.append("\n");
                    break;
                } else {
                    temp.append("*");
                }
            }
        }
        return temp.toString();
    }
}