public class SortAnArrayByValueAndIndex {
    public static int[] sortByValueAndIndex(int[] array1) {

        int[] array2 = new int[array1.length];
        for (int i = 1; i <= array2.length; i++) {
            array2[i - 1] = array1[i - 1] * i;
        }

        int temp1;
        int temp2;

        for (int j = 0; j < array2.length; j++) {
            for (int i = 0; i < array2.length - 1; i++) {
                if (array2[i] > array2[i + 1]) {
                    temp2 = array2[i];
                    temp1 = array1[i];
                    array2[i] = array2[i + 1];
                    array1[i] = array1[i + 1];
                    array2[i + 1] = temp2;
                    array1[i + 1] = temp1;
                }
            }
        }
        return array1;
    }
}
