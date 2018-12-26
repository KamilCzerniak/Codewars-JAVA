import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Plugboard {

    private Map<String, String> config;

    public Plugboard(String wires) throws InvalidPlugboardWiresException {
        String[] arr = wires.split("");

        if (wires.length() > 20
                || wires.length() % 2 != 0
                || Stream.of(arr).distinct().count() != wires.length()) {

            throw new InvalidPlugboardWiresException();
        }

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < wires.length() - 1; i += 2) {
            map.put(String.valueOf(wires.charAt(i)), String.valueOf(wires.charAt(i + 1)));
            map.put(String.valueOf(wires.charAt(i + 1)), String.valueOf(wires.charAt(i)));

        }
        this.config = map;
    }

    public String process(String wire) {
        return config.getOrDefault(wire, wire);
    }
}
