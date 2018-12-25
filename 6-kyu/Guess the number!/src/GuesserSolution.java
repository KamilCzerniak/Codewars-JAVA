public class GuesserSolution extends Guesser {

    public int getNumber() {
        int start = 1;
        int end = 1000;
        int num = 500;
        String result = "";

        while (!result.equals("Correct!")) {

            result = guess(num);
            if (result.equals("Too high!")) {
                end = num;
            } else if (result.equals("Too low!")) {
                start = num;
            }
            num = (start + end) / 2;
        }
        return num;
    }
}