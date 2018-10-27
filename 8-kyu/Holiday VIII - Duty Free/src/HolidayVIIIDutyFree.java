public class HolidayVIIIDutyFree {
    public static int dutyFree(int normPrice, int discount, int hol) {
        return (int) (hol / (normPrice * discount / 100.0));
    }
}
