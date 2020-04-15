package SwitchChallange;

public class Main {
    public static void main(String[] args) {
        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);


    }

    private static void printDayOfTheWeek(int day) {
        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thuresday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("invalid day");
        }



//        switch (day){
//            case 0 :
//                System.out.println("sunday");
//                break;
//            case 1 :
//                System.out.println("monday");
//            case 3 :
//                System.out.println("tuesday");
//                break;
//            case 4 :
//                System.out.println("wednesday");
//                break;
//            case 5 :
//                System.out.println("thresday");
//                break;
//            case 6 :
//                System.out.println("friday");
//                break;
//
//       default:
//           System.out.println("invalid day");
//           break;
//        }
    }
}


