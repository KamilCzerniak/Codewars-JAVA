public class PowersOfI {
    public static String pofi(int n) {
        return n % 4 == 0 ? "1" : n % 4 == 1 ? "i" : n % 4 == 2 ? "-1" : "-i";
    }
}
