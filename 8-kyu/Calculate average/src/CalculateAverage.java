import java.util.Arrays;

public class CalculateAverage {

    public static double find_average(int[] array) {

        return (double) Arrays.stream(array).sum() / array.length;

    }

    public static void main(String[] args) {

    }
}
