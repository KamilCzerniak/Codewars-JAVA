public class CatYearsDogYears {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int[] years = {humanYears, 0, 0};

        for (int i = 1; i <= humanYears; i++) {
            years[1] += (i == 1) ? 15 : (i == 2) ? 9 : 4;
            years[2] += (i == 1) ? 15 : (i == 2) ? 9 : 5;
        }
        return years;
    }

    public static void main(String[] args) {

    }
}
