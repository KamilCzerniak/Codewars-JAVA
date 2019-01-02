import java.util.Arrays;
import java.util.Random;

public class LOTTO {
    public static int[] numberGenerator() {

        Random random = new Random();

        int[] res = Arrays.copyOf(random
                .ints(1, 50)
                .distinct()
                .limit(6)
                .sorted().toArray(), 7);
        res[6] = random.nextInt(10);
        return res;
    }

    public static int checkForWinningCategory(int[] checkCombination, int[] winningCombination) {
        int matchCnt = 0;
        boolean superzahlMatch = false;

        if (checkCombination[6] == winningCombination[6]) {
            superzahlMatch = true;
        }

        for (int i = 0; i < checkCombination.length - 1; i++) {
            for (int j = 0; j < winningCombination.length - 1; j++) {
                if (checkCombination[i] == winningCombination[j]) {
                    matchCnt++;
                }
            }
        }

        switch (matchCnt) {
            case 6: {
                return superzahlMatch ? 1 : 2;
            }
            case 5: {
                return superzahlMatch ? 3 : 4;
            }
            case 4: {
                return superzahlMatch ? 5 : 6;
            }
            case 3: {
                return superzahlMatch ? 7 : 8;
            }
            case 2: {
                return superzahlMatch ? 9 : -1;
            }
            default: {
                return -1;
            }
        }

    }

}