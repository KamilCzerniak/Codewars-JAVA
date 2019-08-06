import java.util.Arrays;

class JomoPipi {
    public static int[] mutationLocation(char[][] body) {


        for (int j = 0; j < body.length; j += 1) {
            if (!Arrays.equals(body[j], body[(j + 1) % body.length])
                    && !Arrays.equals(body[j], body[(j + 2) % body.length])) {
                for (int i = 0; i < body[j].length; i++) {
                    if (body[j][i] != body[(j + 1) % body.length][i]) {
                        return new int[]{j, i};
                    }
                }

            }
        }
        return new int[]{};
    }
}