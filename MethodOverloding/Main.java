package MethodOverloding;

public class Main {
    public static void main(String[] args) {
        int newScore=calcuatescore("krishna", 500);
        System.out.println("new score is " + newScore);
        calcuatescore(75);
        calcuatescore(23);
        calcuatescore();

    }

    public static int calcuatescore(String playerName, int score) {
        System.out.println("player " + playerName + "score" + score + "points");
        return score * 1000;
    }

    public static int calcuatescore(int score) {
        System.out.println("unnamed player score  " + "score" + score + "points");
        return score * 1000;
    }

    public static int calcuatescore() {
        System.out.println("no player name" + "no score.");
        return 0;
    }


}
