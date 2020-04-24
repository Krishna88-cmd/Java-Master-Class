package ReadingUserInput;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter your year of birth : ");
        boolean hasNextInt=scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth=scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name : ");
            String name=scanner.nextLine();
            int age=2018 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("your name is : " + name + "and you are " + age + "year old.");
            } else {
                System.out.println("invalid date of birth");
            }
        } else {
            System.out.println("Unable to parse years of birth");


            scanner.nextLine();
        }

    }
}
