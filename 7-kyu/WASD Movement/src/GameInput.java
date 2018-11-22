public class GameInput {

    public static float[] getVector(boolean[] wasd) {

        float x = 0;
        float y = 0;
        if (wasd[0]) {
            y++;
        }
        if (wasd[1]) {
            x--;
        }
        if (wasd[2]) {
            y--;
        }
        if (wasd[3]) {
            x++;
        }
        if (x != 0 && y != 0) {
            float oneOverSqrt2 = (float) (1 / Math.sqrt(2));
            return new float[]{x * oneOverSqrt2, y * oneOverSqrt2};
        }
        return new float[]{x, y};
    }
}