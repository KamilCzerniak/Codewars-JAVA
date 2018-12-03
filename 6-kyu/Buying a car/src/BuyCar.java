
public class BuyCar {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int month = 0;
        double money = startPriceOld;
        double priceNewCar = startPriceNew;
        double priceOldCar = startPriceOld;

        while (money < priceNewCar) {
            month++;
            percentLossByMonth += month > 0 && month % 2 == 0 ? 0.5 : 0;
            priceOldCar = (priceOldCar * (100 - percentLossByMonth) / 100.0);
            priceNewCar = (priceNewCar * (100 - percentLossByMonth) / 100.0);
            money = savingperMonth * month + priceOldCar;
        }
        return new int[]{month, (int) Math.round(money - priceNewCar)};
    }
}
