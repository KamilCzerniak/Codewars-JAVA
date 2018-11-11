public class HouseNumbersSum {
    public static int houseNumbersSum(final int[] arr) {
        int sum = 0;
        for (int digit : arr) {
            if (digit == 0) {
                break;
            }
            sum += digit;
        }
        return sum;
    }
}
