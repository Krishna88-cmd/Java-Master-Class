package TheForStatement;

public class Main {
    public static void main(String[] args) {
        System.out.println("10000 at 2% interat = " + calculateInterest((10000.0), 2.0));
        System.out.println("10000 at 3% interat = " + calculateInterest((10000.0), 3.0));
        System.out.println("10000 at 4% interat = " + calculateInterest((10000.0), 4.0));
        System.out.println("10000 at 5% interat = " + calculateInterest((10000.0), 5.0));
        System.out.println("10000 at 6% interat = " + calculateInterest((10000.0), 5.0));
        for (int i=0; i < 6; i++) {
            System.out.println("Loop " + i + "hello!");

        }
        for (int i=2; i < 9; i++) {
            System.out.println(String.format("10000 at  " + i + "% interst =" + String.format("%2f", calculateInterest(1000, i))));

        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}



