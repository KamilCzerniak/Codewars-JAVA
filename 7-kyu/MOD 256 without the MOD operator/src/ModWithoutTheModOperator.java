public class ModWithoutTheModOperator {
    public static int mod256WithoutMod(int number) {
        return number - (number / 256) * 256;

    }
}
