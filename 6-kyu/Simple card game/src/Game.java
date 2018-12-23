import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Game {

    public String winner(String[] deckSteve, String[] deckJosh) {

        String cards = Stream.of('2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A')
                .map(String::valueOf).collect(Collectors.joining());

        int stevePoints = 0;
        int joshPoints = 0;

        for (int i = 0; i < deckSteve.length; i++) {

            if (cards.indexOf(deckSteve[i]) > cards.indexOf(deckJosh[i])) {
                stevePoints++;
            } else if (cards.indexOf(deckSteve[i]) < cards.indexOf(deckJosh[i])) {
                joshPoints++;
            }


        }

        return stevePoints > joshPoints
                ? String.format("Steve wins %d to %d"
                , stevePoints
                , joshPoints)
                : stevePoints < joshPoints
                ? String.format("Josh wins %d to %d"
                , joshPoints
                , stevePoints)
                : "Tie";
    }
}