import java.util.stream.IntStream;

public class MontyHall {
    public static int montyHallCase(int correctDoorNumber, int[] participantGuesses) {
        return (int) Math.round((double) IntStream.of(participantGuesses)
                .filter(i -> i != correctDoorNumber)
                .count() * 100
                / participantGuesses.length);

    }
}
