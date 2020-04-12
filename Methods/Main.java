package Methods;

public class Main {
    public static void main(String[] args) {
        Boolean gameOver=true;
        int score=8000;
        int levelCompleted=5;
        int bouns=100;


        calculatesScore(true, 8000, levelCompleted, bouns);

        calculatesScore(true, 1000, 8, 200);
    }

    public static int calculatesScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore=score + (levelCompleted * bonus);
            finalScore+=1000;
            System.out.println("your final score scope was" + finalScore);

            return finalScore;
        }
        return -1;
    }
}

