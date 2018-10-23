import java.util.Random;

public class Ghost {
    private String color;

    public String getColor() {
        String[] colors = {"white", "yellow", "purple", "red"};
        Random random = new Random();
        return colors[random.nextInt(4)];
    }
}
