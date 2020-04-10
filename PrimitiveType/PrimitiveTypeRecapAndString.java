package PrimitiveType;

public class PrimitiveTypeRecapAndString {
    public static void main(String[] args) {


        //byte
        //short
        //int
        // double
        //float
        //char
        //boolean
        //long
        String myString = "This is the string";
        System.out.println("this is the string = " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u0044 2019";
        System.out.println("myString is equel to " + myString);
        String numberString = "250.55";
        numberString = numberString + 250.55;
        System.out.println("the string number " + numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("the last string " + lastString);

        double myDoubleNumber = 120.47d;
        lastString = lastString + myDoubleNumber;
        System.out.println("last string id equal to " + lastString);


    }
}
