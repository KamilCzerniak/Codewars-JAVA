import java.util.Locale;

public class FuelCalculator {

    public static double fuelPrice(int litres, double pricePerLiter) {

        double discount = litres < 10 ? (litres / 2) * 0.05 : 0.25;
        return Double.parseDouble(String.format(Locale.US, "%.2f", litres
                * (pricePerLiter - discount)));

    }
}
