import java.util.Arrays;

public class Solution {
    public static String alphaSeq(String s) {
        String[] arr = s.toLowerCase().split("");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(arr[i].toUpperCase());
            for (int j = 1; j < arr[i].charAt(0) - 96; j++) {
                sb.append(arr[i]);
            }
            arr[i] = sb.toString();
        }
        return String.join(",", arr);
    }
}
