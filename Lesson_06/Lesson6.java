// java.lang.RunTimeException - location of executions to catch during run time
// java.lang.Exception - location of compile-time exceptions
// Arithmetic Exception - Eg. Divide/0
// ClassNotFoundException - called when class is called that doesn't exist
// IllegalArgumentException - called whenever a method is passed illegal argument
// IndexOutOfBoundsException - thrown when accessing index in array that doesn't exist
// InputMismatchException - called when you try to input wrong data type with Scanner
// IOException - Any I/O problems
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;

public class Lesson6
{
  static Scanner userInput = new Scanner(System.in);
  public static void main(String[] args)
  {
    System.out.println("How old are you?");
    int age = checkValidAge();
    if (age != 0) {
      System.out.println("You are " + age + "years old");
    }
    getAFile("./doesntExist.txt");

    divideByZero(2);
  }
  public static void divideByZero(int a)
  {
    try {
      System.out.println(a/0);
    } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
        System.out.println(e.toString());
        e.printStackTrace();
    }
  }
  public static int checkValidAge()
  {
    try {
      return userInput.nextInt();
    } catch (InputMismatchException e) {
      // skip over use input because it is invalid.
      userInput.next();
      System.out.println("That is not a whole number");
      return 0;
    }
  }
  public static void getAFile(String filename)
  {
    try {
      FileInputStream file = new FileInputStream(filename);
    } catch (FileNotFoundException e) {
      System.out.println("Sorry, can't find that file.");
    } catch (IOException e) {
      System.out.println("Unknown IO Error");
    } catch (Exception e) {
      // this will catch every single error.
      // That's why we put it last.
      // And at this point we probably don't know exactly what error it is.
      System.out.println("Some error occured");
    } finally {
      // this block is gonna run whether an exception is caught or not.
      // It is normally used for cleanup duties like closing off connections
      // you have with a database or any files open.
      System.out.println("This is always gonna execute because finally.");
    }
  }
}
