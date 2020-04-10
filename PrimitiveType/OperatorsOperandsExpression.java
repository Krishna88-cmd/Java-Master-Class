package PrimitiveType;

public class OperatorsOperandsExpression<isCar> {
    public static void main(String[] args) {


        int result=1 + 3; //1+3=4
        System.out.println("1+3 = " + result);
        int previousResult=result;
        System.out.println("previous result = " + previousResult);
        result=result - 1;
        System.out.println("3-1 = " + result);
        System.out.println("Previous Result = " + previousResult);

        result=result * 10; // 2* 10 = 20
        System.out.println("2 * 10 = " + result);

        result=result / 5;  // 20/5
        System.out.println(" 20/5 = " + result);

        result=result % 3; // the reminder of 4 %3
        System.out.println("4 % 3 = " + result);
        // result = result +1
        result++;
        System.out.println("1+1 = " + result);
        result--;
        System.out.println(" 1 - 1 = " + result);

        // result = result + 2;
        result+=2; // 1+2 1
        System.out.println("1 + 2 =" + result);
        boolean asAlien=false;
        if (asAlien == false) {

            System.out.println("it was not alien!");
            System.out.println("i'm scared of alien!");

        }
        int topScore=100;
        if (topScore > 80) {
            System.out.println("You get the high score");
        }
        int secondTopScore=81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Grater then second ");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) ;
        System.out.println("either or both are true");
    }


}

