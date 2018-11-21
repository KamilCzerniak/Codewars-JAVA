import java.util.stream.IntStream;

public class DecimalDecomposition {
    public static String decimalDecomposition(int number) {

        String[] num = String.valueOf(number).split("");
        IntStream.range(0, num.length)
                .forEach(i -> num[i] = String.valueOf(Integer.valueOf(num[i]) * (int) Math.pow(10, num.length - i - 1)));
        return String.join("+", num)
                .replaceAll("\\+0\\+", "+")
                .replaceAll("\\+0", "");
    }
}
