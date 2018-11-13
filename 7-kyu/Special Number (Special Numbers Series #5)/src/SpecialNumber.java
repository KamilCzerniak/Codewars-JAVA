public class SpecialNumber {
    public static String specialNumber(int number) {
        return String.valueOf(number).matches("[0-5]*") ? "Special!!" : "NOT!!";
    }
}
