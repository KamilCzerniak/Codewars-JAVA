import java.util.List;

public class OsAndXsAdjudicator {
    public static String judge(List<Integer> history) {
        String[] array = new String[9];
        for (int i = 0; i < history.size(); i++) {
            array[history.get(i)] = i % 2 == 0 ? "X" : "O";
        }
        for (int i = 0; i < 8; i++) {
            String result = "";
            switch (i) {
                case 0: {
                    result = array[0] + array[1] + array[2];
                    break;
                }
                case 1: {
                    result = array[3] + array[4] + array[5];
                    break;
                }
                case 2: {
                    result = array[6] + array[7] + array[8];
                    break;
                }
                case 3: {
                    result = array[0] + array[3] + array[6];
                    break;
                }
                case 4: {
                    result = array[1] + array[4] + array[7];
                    break;
                }
                case 5: {
                    result = array[2] + array[5] + array[8];
                    break;
                }
                case 6:
                    result = array[0] + array[4] + array[8];
                    break;
                case 7: {
                    result = array[2] + array[4] + array[6];
                    break;
                }
            }

            if (result.equals("XXX")) {
                return "X_WIN";
            } else if (result.equals("OOO")) {
                return "O_WIN";
            }
        }
        return "NO_WINNER";
    }
}