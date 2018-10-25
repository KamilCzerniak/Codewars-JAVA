public class HowOldWillIBeIn2099 {
    public static String CalculateAge(int birth, int yearTo) {
        int age = birth - yearTo;
        String s = Math.abs(age) == 1 ? "" : "s";
        return age < 0 ? String.format("You are %d year%s old.", Math.abs(age), s)
                : age > 0 ? String.format("You will be born in %d year%s.", age, s)
                : "You were born this very year!";
    }
}
