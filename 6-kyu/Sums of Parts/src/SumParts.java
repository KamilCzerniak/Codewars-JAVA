import java.util.stream.IntStream;

class SumParts {

    public static int[] sumParts(int[] ls) {

        int[] res = new int[ls.length + 1];

        res[0] = IntStream.of(ls).sum();

        for (int i = 1; i < res.length; i++) {
            res[i] = res[i - 1] - ls[i - 1];
        }
        return res;
    }
}