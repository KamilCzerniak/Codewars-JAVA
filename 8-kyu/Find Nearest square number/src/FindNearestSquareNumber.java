public class FindNearestSquareNumber {
    public static int nearestSq(final int n) {
        return (int)Math.pow(Math.round(Math.sqrt(n)), 2);
    }

    public static void main(String[] args) {
        System.out.println(nearestSq(9999));
    }
}
