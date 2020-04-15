package Switch;

public class Main {
    public static void main(String[] args) {
//        int value = 1;
//        if(value ==1) {
//            System.out.println("value was 1");
//        } else if(value ==2) {
//            System.out.println("value was 2");
//        }else{
//            System.out.println(" no value was");
        int switchValue=6;
        switch (switchValue) {
            case 1:
                System.out.println(" value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("was a 3 or was a 4 or  was a 5");
                System.out.println("Actually it  was a " + switchValue);
                break;
            default:
                System.out.println("was not value 1,2,3 or 4 or 5a");
                break;
        }
        char charValue='A';
        switch (charValue) {
            case 'a':
                System.out.println('A');
                break;
            case 'B':
                System.out.println('B');
                break;
            case 'c':
            case 'D':
            case 'E':
                System.out.println(" was founf " + charValue);
                break;
            default:
                System.out.println("could not found A,B,C,D or E ");
                break;



        }

    }
}
