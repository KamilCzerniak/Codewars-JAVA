public class Lucas {
    public static int lucasnum(int n) {
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 1;
        }
        return n >= 0 ? lucasnum(n - 2) + lucasnum(n - 1) : lucasnum(n + 2) - lucasnum(n + 1);

    }
}