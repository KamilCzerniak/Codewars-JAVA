public class ILoveYouALittleALotPassionatelyNotAtAll {

    public static String howMuchILoveYou(int nb_petals) {

        String[] s = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
        return nb_petals == 0 ? s[5] : s[(nb_petals - 1) % 6];
    }

    public static void main(String[] args) {
      
    }
}
