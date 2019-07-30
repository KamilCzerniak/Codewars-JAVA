import java.util.Arrays;

public class TheOffice {
    public static String outed(Person[] meet, String boss) {

        double happiness = Arrays.stream(meet)
                .mapToInt(p -> p.name.equals(boss) ? p.happiness * 2 : p.happiness)
                .average().orElse(0);

        return happiness <= 5 ? "Get Out Now!" : "Nice Work Champ!";
    }
}