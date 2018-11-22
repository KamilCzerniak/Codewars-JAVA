public class Kata {
    public static String getHonorPath(int honorScore, int targetHonorScore) {
        int honor = targetHonorScore - honorScore;
        return honor > 0 ? String.format("2kyus: %d, 1kyus: %d", honor % 2, honor / 2) : "";
    }
}
