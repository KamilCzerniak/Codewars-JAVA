public class Kata extends Arrays {
    public static String chineseZodiac(int year) {
        return String.format("%s %s"
                , elements[((year - 1924) / 2) % 5]
                , animals[(year - 1924) % 12]);
    }

    public static void main(String[] args) {
        System.out.println(chineseZodiac(1965));
    }
}
