
public class ReversedWords {

    public static String reverseWords(String str) {

        String[] array = str.split(" ");
        String temp;
        for (int i = 0; i < array.length / 2; i++) {

            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        return String.join(" ", array);
    }

    public static void main(String[] args) {

    }
}
