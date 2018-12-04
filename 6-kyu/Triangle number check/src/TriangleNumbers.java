public class TriangleNumbers {

    public static Boolean isTriangleNumber(long number) {
        long res = 0;
        for (int i = 1; res < number; i++) {
            res = ((1 + i) * i) / 2;
        }
        return res == number;
    }
}
