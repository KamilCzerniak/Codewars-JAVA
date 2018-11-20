public class EightiesKids2 {

    public static String findSpaceship(String map) {
        String[] array = map.split("\n");
        for (int i = 0; i < array.length; i++) {
            if (array[array.length - 1 - i].contains("X")) {
                return String.format("[%d, %d]", array[array.length - 1 - i].indexOf("X"), i);
            }
        }
        return "Spaceship lost forever.";
    }
}
