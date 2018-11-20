public class BullsAndCows {
    private String secretNumber;
    private int cnt = 0;
    private boolean result = false;

    public BullsAndCows(int n) {
        String temp = String.valueOf(n);
        if (!temp.matches("\\d{4}") || temp.chars().distinct().count() != 4) {
            throw new IllegalArgumentException();
        }
        this.secretNumber = temp;
    }

    public String compareWith(int n) {

        if (!result && cnt < 8) {
            String temp = String.valueOf(n);
            if (!temp.matches("\\d{4}") || temp.chars().distinct().count() != 4) {
                throw new IllegalArgumentException();
            }
            int bulls = 0;
            int cows = 0;
            for (int i = 0; i < temp.length(); i++) {
                if (secretNumber.charAt(i) == temp.charAt(i)) {
                    bulls++;
                } else if (secretNumber.contains(String.valueOf(temp.charAt(i)))
                        && secretNumber.charAt(i) != temp.charAt(i)) {
                    cows++;
                }
            }

            if (bulls == 4) {
                result = true;
                return "You win!";
            } else {
                cnt++;
                return String.format("%d %s and %d %s"
                        , bulls
                        , bulls == 1 ? "bull" : "bulls"
                        , cows
                        , cows == 1 ? "cow" : "cows");
            }
        }
        return cnt == 8 ? "Sorry, you're out of turns!" : "You already won!";
    }
}
