import java.util.Arrays;

class JomoPipi {
    public static int[] mutationLocation(char[][] body) {
        int[] arr = Arrays.stream(body)
                .mapToInt(c -> String.valueOf(c)
                        .chars()
                        .sum())
                .toArray();

        for (int i = 0; i < arr.length; i++) {
            int row = arr[i];
            if (Arrays.stream(arr).filter(n -> n == row).count() == 1) {
                for (int j = 0; j < body[0].length; j++) {
                    if (body[i][j] != body[i == body.length - 1 ? i - 1 : i + 1][j]) {
                        return new int[]{i, j};
                    }
                }
            }
        }

        return new int[]{};
    }
}