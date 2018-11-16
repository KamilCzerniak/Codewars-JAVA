public class Generator {
    private int cnt = 1;

    public int next() {
        return cnt++;
    }

    public int next(int num) {
        return cnt = num;
    }
}
