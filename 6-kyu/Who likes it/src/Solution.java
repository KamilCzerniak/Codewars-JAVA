class Solution {
    public static String whoLikesIt(String... names) {
        String temp;
        switch (names.length) {
            case 0: {
                temp = "no one likes this";
                break;
            }
            case 1: {
                temp = String.format("%s likes this", names[0]);
                break;
            }
            case 2: {
                temp = String.format("%s and %s like this", names[0], names[1]);
                break;
            }
            case 3: {
                temp = String.format("%s, %s and %s like this", names[0], names[1], names[2]);
                break;
            }
            default: {
                temp = String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
                break;
            }
        }
        return temp;
    }
}