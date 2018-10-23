import java.util.Arrays;

public class HowGoodAreYouReally {

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return yourPoints > (Arrays.stream(classPoints).sum() + yourPoints) / (classPoints.length + 1);
    }

    public static void main(String[] args) {

    }
}
