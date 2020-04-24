package WhileStatement;

public class Main {
    public static void main(String[] args) {
        int count=1;
        while (count != 6) {
            System.out.println("count the value " + count);
            count++;
        }
        count=1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("count the value is " + count);
            count++;
        }
        do {
            System.out.println("count the value " + count);

        } while (count != 6);


    }
}

