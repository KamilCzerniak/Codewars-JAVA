public class PositionAverage {
    public static double posAverage(String s) {

        String[] arr = s.split(", ");

        double commonPosition = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = 0; k < arr[i].length(); k++) {
                    if (arr[i].charAt(k) == arr[j].charAt(k)) {
                        commonPosition++;
                    }
                }
            }
        }
        return ((commonPosition / (double) ((arr.length * (arr.length - 1)) / 2)) * 100) / arr[0].length();
}
}