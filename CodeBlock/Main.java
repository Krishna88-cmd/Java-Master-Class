package CodeBlock;

public class Main {
    public static void main(String[] args) {
        Boolean gameOver=true;
        int score=5000;
        int levelCompleted=5;
        int bouns=100;
       if (score < 5000 &&  score > 100) {
           System.out.println("your score  is less than 5000");     } else if (score < 1000){
           System.out.printf("your score less than 1000");
      } else {
            System.out.println("go here");
       }
        if (gameOver=true) {
            int finalScore=score + (levelCompleted * bouns);
            finalScore+=10000;
            System.out.println("your final score " + finalScore);
        }
        score = 10000;
        levelCompleted = 8;
        bouns = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted * bouns);
            System.out.println("your final score was" + finalScore);
        }
    }
}
