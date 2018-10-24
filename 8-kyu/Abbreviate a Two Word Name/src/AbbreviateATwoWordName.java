public class AbbreviateATwoWordName {

    public static String abbrevName(String name) {
        String[] s = name.toUpperCase().split(" ");
        return String.format("%s.%s",s[0].charAt(0),s[1].charAt(0));
    }

}
