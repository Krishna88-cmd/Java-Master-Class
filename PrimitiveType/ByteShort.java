package PrimitiveType;

public class ByteShort {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        // int data type
        System.out.println(" Integer Mixmum Value =  " + myMaxIntValue);
        System.out.println(" Integer Minmum Value =" + myMinIntValue);
        System.out.println("Bust Max Value =" + (myMaxIntValue + 1));
        System.out.println("Bust Min Value =" + (myMinIntValue - 1));

        // Byte data type
        int myMaxIntTest = 2147483647;
        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("Byte max value = " + myMaxByteValue);
        System.out.println("Byte min value = " + myMinByteValue);

        // long data type
        long myLongValue = 100L;
        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Long Max Value = " + myMaxLongValue);
        System.out.println("Long Min Value = " + myMinLongValue);
        long bigLongLiteralValue = 2147483647L;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMaxIntValue / 2);

        byte myNewByteValue = (byte)(myMinByteValue /2);
        short myNewShortValue = (short)(myMinByteValue /2);

    }


}

