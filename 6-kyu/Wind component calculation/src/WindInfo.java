public class WindInfo {

    public static String message(String rwy, int windDirection,int windSpeed) {
        int A = windDirection - Integer.valueOf(rwy.replaceAll("[^\\d]", "")) * 10;
        int CW = (int) Math.round(Math.sin(Math.toRadians(A)) * windSpeed);
        int HW = (int) Math.round(Math.cos(Math.toRadians(A)) * windSpeed);

        return String.format("%swind %d knots. Crosswind %d knots from your %s."
                , HW < 0 ? "Tail" : "Head"
                , Math.abs(HW)
                , Math.abs(CW)
                , CW < 0 ? "left" : "right");
    }
}