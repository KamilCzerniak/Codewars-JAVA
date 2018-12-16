public class Quicksum {
    public int quicksum(String packet) {
        if (!packet.chars().allMatch(a -> Character.isUpperCase(a) || Character.isSpaceChar(a))) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < packet.length(); i++) {
            if (Character.isLetter(packet.charAt(i))) {
                sum += (packet.charAt(i) - 'A' + 1) * (i + 1);
            }
        }
        return sum;
    }
}