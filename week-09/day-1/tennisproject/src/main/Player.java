package main;

public class Player {

    private String name;
    private int score;
    private int point;
    private String result;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
        this.result="";
    }

    public String getName() {
        return name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
