public class EightiesKids5 {
    public static String bucketOf(String said) {
        String temp = said.toLowerCase();
        boolean water = temp.contains("water") || temp.contains("wet") || temp.contains("wash");
        boolean slime = temp.contains("i don't know") || temp.contains("slime");

        return water && slime ? "sludge"
                : water ? "water"
                : slime ? "slime"
                : "air";
    }
}
