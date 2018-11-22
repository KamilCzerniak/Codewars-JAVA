import java.util.Arrays;

public class Swappairs {
    public Object[][][] swapp(Object[][] input) {

        Object[][] output = new Object[input.length][2];
        for (int i = 0; i < output.length; i++) {
            output[i] = Arrays.copyOf(input[i], input[i].length);
        }

        Object temp;
        for (Object[] oe : output) {
            temp = oe[0];
            oe[0] = oe[1];
            oe[1] = temp;
        }
        return new Object[][][]{input, output};
    }
}
