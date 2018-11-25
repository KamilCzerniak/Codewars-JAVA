public class SetBits {
    public long eliminateUnsetBits(String number) {
        return Long.parseLong(!number.contains("1") ? "0" : number.replace("0", ""), 2);
    }
}
