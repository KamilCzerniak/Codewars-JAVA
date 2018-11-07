public class EasyWallpaper {
    public static String wallpaper(double l, double w, double h) {

        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
                , "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};

        return l < 0 || w < 0 || h < 0 ? number[0] : number[(int) Math.ceil(1.15 * 2.0 * (l * h + w * h) / (10.0 * 0.52))];
    }
}
