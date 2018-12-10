public class Pizza {

    public static int maxPizza(int cut) {
        return cut < 0 ? -1 : ((1 + cut) * cut) / 2 + 1;
    }
}