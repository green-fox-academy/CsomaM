package main;

import java.util.Arrays;
import java.util.List;

public class TennisGame1 implements TennisGame {

    private Player player1;
    private Player player2;

    private List<String> scoreNames = Arrays.asList("Love", "Fifteen", "Thirty", "Forty", "Deuce");

    public TennisGame1(String player1Name, String player2Name) {
        this.player1 = new Player(player1Name, 0);
        this.player2 = new Player(player2Name, 0);
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            player1.setScore(1);
        else
            player2.setScore(1);
    }

    public String getScore() {
        if (player1.getScore() == player2.getScore()) {
            return drawScore(player1.getScore());
        }
        else if (player1.getScore() >=4 || player2.getScore() >=4) {
            return biggerThanFour();
        }
        else {
            return defaultCase();
        }
    }

    public String defaultCase () {
        int tempScore;
        String tempString = "";
        for (int i=1; i<3; i++)
        {
            if (i==1) tempScore = player1.getScore();
            else { tempString += "-"; tempScore = player2.getScore();}
            tempString += scoreNames.get(tempScore);
        }
        return tempString;
    }

    public String drawScore (int score) {
        if (score < 4) {
            return scoreNames.get(score) + "-All";
        } else {
            return scoreNames.get(score);
        }
    }

    public String biggerThanFour () {
        int minusResult = player1.getScore() - player2.getScore();
        if (minusResult==1) return "Advantage player1";
        else if (minusResult ==-1) return "Advantage player2";
        else if (minusResult>=2) return "Win for player1";
        else return "Win for player2";
    }
}
