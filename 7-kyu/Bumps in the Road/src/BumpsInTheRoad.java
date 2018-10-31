public class BumpsInTheRoad {
    public static String bumps(final String road) {
        return road.replaceAll("[^n]", "").length() > 15 ? "Car Dead" : "Woohoo!";
    }
}
