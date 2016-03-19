// import an external class.
import java.util.Scanner;   // to accept user input

// import an entire java library
// import java.util.*;

// Note: name must be same as Java file
public class Main {
    // System.in is the user's keyboard
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is your favorite number? ");
        // is the next thing type into the keyboard an integer?
        if (userInput.hasNextInt()) {
            int numberEntered = userInput.nextInt();
            System.out.println("You entered " + numberEntered);

            // How to find absolute value of an integer.
            int numberABS = Math.abs(numberEntered);

            // How to find the greater or lesser integer between 2 integers.
            int whichIsBigger = Math.max(5, 7);     // 7
            int whichIsSmaller = Math.min(5, 7);    // 5

            // How to find the square root
            double squareRoot = Math.sqrt(9);

            // How to round numbers in Java.
            int numCeiling = (int)Math.ceil(5.23);  // 6
            int numFloor = (int)Math.floor(5.23);   // 5
            int numRound = (int)Math.round(5.23);   // 5

            // How to create a random number.
            // .random() creates a random number between 0.0 and 0.9999.
            // so for a random number between 1 and 10, do this.
            int randomNumber = (int)(Math.random() * 11);
            System.out.println("Random number: " + randomNumber);
        } else {
            System.out.println("Enter an integer next time.");
        }
    }
}
