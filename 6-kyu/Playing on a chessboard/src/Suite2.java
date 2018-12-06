public class Suite2 {
    public static String game(long n) {

        return n % 2 == 0 ? String.format("[%s]", n * n / 2) : String.format("[%s, 2]", n * n);
    }
}
