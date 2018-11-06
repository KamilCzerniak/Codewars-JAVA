import java.util.Arrays;

public class EANValidation {
    public static boolean validate(final String eanCode) {

        int[] code = Arrays.stream(eanCode.substring(0, eanCode.length() - 1)
                .split(""))
                .mapToInt(Integer::valueOf)
                .toArray();
        for (int i = 0; i < code.length; i++) {
            code[i] *= i % 2 == 0 ? 1 : 3;
        }
        int sum = Arrays.stream(code).sum();
        int checkSum = sum % 10 == 0 ? 0 : 10 - sum % 10;
        return eanCode.length() == 13 && checkSum == Integer.valueOf(eanCode.substring(eanCode.length() - 1));

    }
}
