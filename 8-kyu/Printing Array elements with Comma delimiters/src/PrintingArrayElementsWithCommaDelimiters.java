import java.util.Arrays;
import java.util.stream.Collectors;

public class PrintingArrayElementsWithCommaDelimiters {

    public static String printArray(Object array[]) {


        return Arrays.stream(array).map(String::valueOf).collect(Collectors.joining(","));
    }

    public static void main(String[] args) {
        System.out.println(printArray(new Integer[]{2, 4, 5, 2}));
    }
}
