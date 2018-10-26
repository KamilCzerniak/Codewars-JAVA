
public class LarioAndMuigiPipeProblem {

    public static int[] pipeFix(int[] numbers) {
        int[] digits = new int[numbers[numbers.length - 1] - numbers[0] + 1];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = numbers[0]++;
        }
        return digits;
    }
}
