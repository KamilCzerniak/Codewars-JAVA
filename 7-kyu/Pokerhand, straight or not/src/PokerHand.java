import java.util.ArrayList;
import java.util.Arrays;


public class PokerHand {
    public static boolean IsStraight(ArrayList<Integer> cards) {
        if (cards.size() < 5) {
            return false;
        }
        int[] template = {14, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int cnt = 0;
        for (int i = 0; i < template.length; i++) {
            if (cards.contains(template[i])) {
                cnt++;
            } else {
                cnt = 0;
            }
            if (cnt == 5) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        ArrayList<Integer> hand = new ArrayList<Integer>();
        hand.add(7);
        hand.add(7);
        hand.add(12);
        hand.add(11);
        hand.add(3);
        hand.add(4);
        hand.add(14);
        System.out.println(IsStraight(hand));

        int[] one = {1, 2};
        int[] two = {1, 2};


    }
}
