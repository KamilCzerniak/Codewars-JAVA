public class Kata {
    public static int snail(int column, int day, int night) {
        return night < column ? (int) Math.ceil(((double) column - night) / (day - night)) : 1;
    }
}