import java.util.Arrays;

public class Kata {
    public static Double[] sortItOut(Double[] array) {

        Double[] arr = new Double[array.length];
        Arrays.sort(array);
        int odd = 0;
        int even = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (Math.floor(array[i]) % 2 != 0) {
                arr[odd++] = array[i];
            } else if (Math.floor(array[i]) % 2 == 0) {
                arr[even--] = array[i];
            }
        }
        return arr;
    }
}
