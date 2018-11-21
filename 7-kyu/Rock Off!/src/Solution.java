public class Solution {
    public static String solveRockOff(final int[] alice, final int[] bob) {
        int alicePoints = 0;
        int bobPoints = 0;
        for (int i = 0; i < alice.length; i++) {
            alicePoints += alice[i] > bob[i] ? 1 : 0;
            bobPoints += bob[i] > alice[i] ? 1 : 0;
        }
        return String.format("%d, %d: %s"
                , alicePoints
                , bobPoints
                , alicePoints > bobPoints
                        ? "Alice made \"Kurt\" proud!"
                        : alicePoints < bobPoints
                        ? "Bob made \"Jeff\" proud!"
                        : "that looks like a \"draw\"! Rock on!");
    }
}
