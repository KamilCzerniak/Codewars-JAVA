public class DuckDuckGoose {

    public static String duckDuckGoose(Player[] players, int goose) {
        return players[(goose - 1) % players.length].name;
    }
}

class Player {
    public String name;
}