public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result = new int[]{i, j};
                    break;
                }
            }
        }
        return result;
    }

}
