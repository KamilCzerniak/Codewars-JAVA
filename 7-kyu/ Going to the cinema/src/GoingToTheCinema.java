public class GoingToTheCinema {
    public static int movie(int card, int ticket, double perc) {
        double systemA = 0;
        double systemB = card;
        double price = ticket;
        int cnt = 0;
        while (systemA <= Math.ceil(systemB)) {
            systemA += ticket;
            systemB += price * perc;
            price *= perc;
            cnt++;
        }
        return cnt;
    }
}
