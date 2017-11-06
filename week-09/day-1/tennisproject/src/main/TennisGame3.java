package main;

public class TennisGame3 implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGame3(String p1N, String p2N) {
        this.player1 = new Player(p1N, 0);
        this.player2 = new Player(p2N, 0);
    }

    public String getScore() {
        String s;
        if (player1.getScore() < 4 && player2.getScore() < 4) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            s = p[player1.getScore()];
            return (player1.getScore() == player2.getScore()) ? s + "-All" : s + "-" + p[player2.getScore()];
        } else {
            if (player1.getScore() == player2.getScore())
                return "Deuce";
            s = player1.getScore() > player2.getScore() ? player1.getName() : player2.getName();
            return ((player1.getScore()-player2.getScore())*(player1.getScore()-player2.getScore()) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            player1.setScore(1);
        else
            player2.setScore(1);

    }

}
