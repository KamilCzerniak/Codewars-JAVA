import java.util.Arrays;

public class AntiVirus {
    private int scanIntensity = 0;

    public void setScanIntensity(int level) {
        scanIntensity = level;
    }

    public String scanFile(File file, VirusDB database) {
        String result = "is safe";
        for (int i = 1; i <= scanIntensity; i++) {
            if (Arrays.stream(database.getSignatures(i))
                    .anyMatch(s -> file.getData().toLowerCase().contains(s.toLowerCase()))) {
                result = "is not safe";
            }
        }
        return String.format("%s %s", file.getName(), result);
    }
}
