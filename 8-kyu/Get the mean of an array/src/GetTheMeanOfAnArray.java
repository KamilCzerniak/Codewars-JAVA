import java.util.Arrays;

public class GetTheMeanOfAnArray {

    public static int getAverage(int[] marks) {
        return (int) Arrays.stream(marks).average().getAsDouble();
    }

    public static void main(String[] args) {

    }
}
