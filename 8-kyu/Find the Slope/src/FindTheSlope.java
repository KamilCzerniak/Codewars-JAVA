public class FindTheSlope {
    public static String slope(int[] points) {

        return points[0] - points[2] != 0
                ? String.valueOf(((points[1] - points[3]) / (points[0] - points[2])))
                : "undefined";
    }
}
