package TheWhileAndDoWhile;

public class main {
    public static void main(String[] args) {
        int count=0;
        while (count != 5) {
            System.out.println("count value is " + count);
            count++;
        }
        while ((true)) {
            if (count == 6) {
                break;
            }
            System.out.println("count value is " + count);
            count++;
        }
    }
}
