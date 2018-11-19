public class Solution {
    public static int[] splitByValue(int k, int[] elements) {
        int[] array = new int[elements.length];
        int right = 0;
        int left = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (elements[i] < k) {
                array[right++] = elements[i];
            }
            if (elements[elements.length - 1 - i] >= k) {
                array[left--] = elements[elements.length - 1 - i];
            }
        }
        return array;
    }
}
