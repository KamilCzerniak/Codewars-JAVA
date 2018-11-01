
public class ShadesOfGrey {
    static String[] shadesOfGrey(int num) {

        if (num > 0) {
            String[] array = new String[num < 254 ? num : 254];
            for (int i = 0; i < array.length; i++) {
                array[i] = String.format("#%02x%02x%02x", i + 1, i + 1, i + 1);
            }
            return array;
        }
        return new String[]{};
    }
}
