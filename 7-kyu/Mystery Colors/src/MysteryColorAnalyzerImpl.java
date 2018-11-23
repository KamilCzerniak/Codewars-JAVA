import java.util.List;

public class MysteryColorAnalyzerImpl implements MysteryColorAnalyzer {
    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        return (int) mysteryColors.stream().distinct().count();

    }

    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {
        return (int) mysteryColors.stream().filter(c -> c == color).count();

    }
}
