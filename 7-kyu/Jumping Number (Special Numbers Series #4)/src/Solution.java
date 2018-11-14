public class Solution {
    public static String jumpingNumber(int number) {
        int[] a = String.valueOf(number).chars().toArray();
        for (int i = 0; i < a.length - 1; i++) {
            if (Math.abs(a[i] - a[i + 1]) != 1) {
                return "Not!!";
            }
        }
        return "Jumping!!";
    }
}
