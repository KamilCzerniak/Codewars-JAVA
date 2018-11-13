public class RoboticTattooRemoval {
    public static String[][] robot(String[][] skinScan) {
        for (int i = 0; i < skinScan.length; i++) {
            for (int j = 0; j < skinScan[i].length; j++) {
                if (skinScan[i][j].equals("X")) {
                    skinScan[i][j] = "*";
                }
            }
        }
        return skinScan;
    }
}
