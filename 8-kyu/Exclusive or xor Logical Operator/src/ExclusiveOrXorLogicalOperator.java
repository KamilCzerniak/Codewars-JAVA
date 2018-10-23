public class ExclusiveOrXorLogicalOperator {

    public static boolean xor(boolean a, boolean b) {
        return a != b;
    }

    public static void main(String[] args) {
        System.out.println(xor(true, true));
    }
}
