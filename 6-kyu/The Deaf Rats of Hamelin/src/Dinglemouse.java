public class Dinglemouse {

    public static int countDeafRats(final String town) {

        String[] arr = town.replace(" ", "").split("P");
        int deafRat = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length() - 1; j += 2) {
                if (i == 0 && arr[i].substring(j, j + 2).matches("O~")
                        || i == 1 && arr[i].substring(j, j + 2).matches("~O")) {
                    deafRat++;
                }
            }
        }
        return deafRat;
    }
}
