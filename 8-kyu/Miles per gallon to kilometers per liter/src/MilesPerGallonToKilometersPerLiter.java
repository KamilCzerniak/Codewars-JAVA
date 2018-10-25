import java.util.Locale;

public class MilesPerGallonToKilometersPerLiter {
    public static final double GALLON = 4.54609188;
    public static final double MILE = 1.609344;

    public static float mpgToKPM(final float mpg) {
        return Float.parseFloat(String.format(Locale.US, "%.2f", mpg * (MILE / GALLON)));

    }

}
