package PrimitiveType;


public class FloteDouble {
    public static void main(String[] args) {
        float myMaxFloatValue = Float.MAX_VALUE;
        float myMinFloatValue = Float.MIN_VALUE;
        System.out.println("Max float Value= " + myMaxFloatValue);
        System.out.println("Min float Value= " + myMinFloatValue);


        double myMaxDoubleValue = Float.MAX_VALUE;
        double myMinDoubleValue = Float.MIN_VALUE;
        System.out.println("Max float Value= " + myMaxDoubleValue);
        System.out.println("Min float Value= " + myMinDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        // float data type
        System.out.println("My int value = " + myIntValue);
        System.out.println("My float value = " + myFloatValue);
        System.out.println("My double  value = " + myDoubleValue);


        // Challange question
        double numberOfPound = 200d;
        double convertKilograms = numberOfPound * 0.45359237d;
        System.out.println("convert to kilograms = " + convertKilograms);

        double p1 = 3.1415927d;
        double anotherNumber = 3000000.4567890d;
        System.out.println(p1);
        System.out.println(convertKilograms);
    }


}
