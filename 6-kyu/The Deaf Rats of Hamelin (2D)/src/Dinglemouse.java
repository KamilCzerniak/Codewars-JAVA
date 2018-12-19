import java.util.HashMap;
import java.util.Map;

public class Dinglemouse {

    public static int countDeafRats(char[][] townSquare) {

        Map<Character, int[]> map = new HashMap<>();
        map.put('↙', new int[]{-1, 1});
        map.put('↗', new int[]{1, -1});
        map.put('↖', new int[]{-1, -1});
        map.put('↘', new int[]{1, 1});
        map.put('↑', new int[]{0, -1});
        map.put('↓', new int[]{0, 1});
        map.put('←', new int[]{-1, 0});
        map.put('→', new int[]{1, 0});

        int[] pCoordinate = new int[2];
        int deafRatCnt = 0;


        for (int i = 0; i < townSquare.length; i++) {
            for (int j = 0; j < townSquare[i].length; j++) {
                if (townSquare[i][j] == 'P') {
                    pCoordinate[0] = j;
                    pCoordinate[1] = i;
                }
            }
        }

        for (int i = 0; i < townSquare.length; i++) {
            for (int j = 0; j < townSquare[i].length; j++) {
                if (map.containsKey(townSquare[i][j])) {
                    int[] moves = map.get(townSquare[i][j]);
                    if (Math.sqrt(Math.pow(pCoordinate[0] - j, 2) + Math.pow(pCoordinate[1] - i, 2))
                            < Math.sqrt(Math.pow(pCoordinate[0] - (j + moves[0]), 2) + Math.pow(pCoordinate[1] - (i + moves[1]), 2))) {
                        deafRatCnt++;
                    }
                }
            }
        }

        return deafRatCnt;
    }
}