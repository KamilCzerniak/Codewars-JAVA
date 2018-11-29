public class SmokingTimmy {
    public static int startSmoking(int bars, int boxes) {
        double cigarettes = bars * 180 + boxes * 18;
        double temp = cigarettes;
        while (temp > 1) {
            temp = (temp / 5.0);
            cigarettes += temp;
        }
        return (int) cigarettes;
    }
}
