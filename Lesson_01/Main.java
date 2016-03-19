// public means it is available to all other classes. Everyone should be able to execute this.
public class Main {
    // How to make a class variable that's available to any other method defined in this class.
    static String myString = "This is my string.";
    // How to make a constant class variable
    static final double PI = 3.14;
    // static means only a class can call for this function to execute.
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(PI);

        // Primitive types in Java
        byte biggestByte = 127;                     // smallest byte is -128.
        short biggestShort = 32767;                 // smallest is -32768.
        int biggestInt = 2147483647;                // -2147483648.
        long biggestLong = 9223372036854775807L;    // -9223372036854775808.
        float biggestFloat = Float.MAX_VALUE;       // -Float.MAX_VALUE would be the largest negative float.
        double biggestDouble = Double.MAX_VALUE;    // -Double.MAX_VALUE.

        System.out.println(biggestFloat);           // floats are precise to 6 decimal places.
        System.out.println(biggestDouble);          // doubles are precise to 15 decimal places.

        boolean trueOrFalse = true;                 // can not be 1 or 0 like in other languages.

        char randomChar = 65;                       // must be surrounded by single quotes.
        char anotherChar = 'A';

        // Because the character code for A is 65, randomChar is equal to anotherChar.
        if (randomChar == anotherChar) {
            System.out.println("The character code for A is 65!");
        }

        // How to convert from 1 type to another :
        // X to String
        String byteToString = Byte.toString(biggestByte);
        String floatToString = Float.toString(biggestFloat);

        // String to X
        Byte stringToByte = Byte.parseByte(byteToString);
        Float stringToFloat = Float.parseFloat(floatToString);

        // Typecasting
        double myDouble = PI;
        int doubleToInt = (int) myDouble;
        System.out.print(doubleToInt);
    }
}
