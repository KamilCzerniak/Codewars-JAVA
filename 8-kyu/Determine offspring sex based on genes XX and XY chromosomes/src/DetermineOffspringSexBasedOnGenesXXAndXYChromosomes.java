public class DetermineOffspringSexBasedOnGenesXXAndXYChromosomes {

    public static String chromosomeCheck(String sperm) {
        return sperm.contains("XX") ? "Congratulations! You're going to have a daughter."
                : "Congratulations! You're going to have a son.";
    }

    public static void main(String[] args) {

    }
}
