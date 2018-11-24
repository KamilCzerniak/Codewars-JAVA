public class Kata {
    public static double travel(int totalTime, int runTime, int restTime, int speed) {

        return speed * runTime * (totalTime / (restTime + runTime)) + speed * Math.min(totalTime % (restTime + runTime), runTime);
    }
}
