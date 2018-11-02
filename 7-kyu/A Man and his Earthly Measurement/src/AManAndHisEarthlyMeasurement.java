public class AManAndHisEarthlyMeasurement {
    public static double circumference(double rodHeight, double shadowLength, double distanceToWell) {
        return (360 / Math.toDegrees(Math.atan2(shadowLength, rodHeight))) * distanceToWell;
    }
}
