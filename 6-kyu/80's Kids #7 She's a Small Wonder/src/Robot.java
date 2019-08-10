import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Robot {

    private Set<String> memory;

    private String[] answers = new String[]{
            "I do not understand the input"
            , "I already know the word"
            , "Thank you for teaching me"
    };

    public Robot() {
        memory = Arrays.stream(answers)
                .flatMap(a -> Arrays.stream(a.toLowerCase().split(" ")))
                .collect(Collectors.toSet());
    }

    public String learnWord(String word) {

        String temp = word.toLowerCase();
        if (!temp.matches("[a-z0-1]+")) {
            return answers[0];
        }
        return String.format("%s %s", memory.add(temp) ? answers[2] : answers[1], word);
    }
}
