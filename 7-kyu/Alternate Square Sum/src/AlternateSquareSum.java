public class AlternateSquareSum {
    public static int alternateSqSum(int[] arr) {

        int sum = 0;
        for (int i = 0; i <= arr.length; i++) {
            sum += i % 2 == 0 ? arr[i] : Math.pow(arr[i], 2);
        }
        return sum;

    }
}
