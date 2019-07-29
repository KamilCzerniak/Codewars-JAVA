public class Kata {
    public static final String generateShape(int n) {

        StringBuilder square = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                square.append("+");
            }
            if (i < n - 1) {
                square.append("\n");
            }
        }
        return square.toString();
    }
}
