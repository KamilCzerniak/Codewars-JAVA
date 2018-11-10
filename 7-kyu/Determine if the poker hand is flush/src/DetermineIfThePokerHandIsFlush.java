public class DetermineIfThePokerHandIsFlush {
    public static boolean CheckIfFlush(String[] cards) {
        for (int i = 0; i < cards.length - 1; i++) {
            if (cards[i].charAt(cards[i].length() - 1) != cards[i + 1].charAt(cards[i + 1].length() - 1)) {
                return false;
            }
        }
        return true;
    }
}
