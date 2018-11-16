import java.util.stream.IntStream;

public class ArraySumminator {

    public static long sumItUp(BasedNumbers[] numbersWithBases) {
        return IntStream.range(0, numbersWithBases.length)
                .map(i -> Integer.parseInt(numbersWithBases[i].number, numbersWithBases[i].base))
                .sum();
    }
}
