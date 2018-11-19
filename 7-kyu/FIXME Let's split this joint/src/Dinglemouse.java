public class Dinglemouse {
    public static String[] split(String joint) {
        return joint.length() == 0 ? new String[]{} : joint.split("\\.", -1);
    }
}
