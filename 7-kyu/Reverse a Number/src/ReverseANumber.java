
public class ReverseANumber {
    public static int reverse(int number) {
        int result = Integer.parseInt(new StringBuilder(String.valueOf(Math.abs(number))).reverse().toString());
        return number > 0 ? result : -result;
    }
}
