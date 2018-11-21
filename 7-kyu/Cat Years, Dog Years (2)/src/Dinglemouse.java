public class Dinglemouse {

    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        int[] result = new int[2];
        for (int i = 0; i < 2; i++) {
            int temp = i == 0 ? catYears : dogYears;
            result[i] = temp < 15 ? 0 : temp < 24 ? 1 : 2 + (temp - 24) / (i + 4);
        }
        return result;
    }
}

