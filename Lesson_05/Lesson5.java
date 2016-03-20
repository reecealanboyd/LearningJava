public class Lesson5 {

  static double PI = 3.14159; // class variable

  public static void main(String[] args) {
    addThem(1, 2);
    // Print out the global value of PI.
    System.out.println("Global PI : " + PI);
  }
  // Syntax for another function in a java class.
  // Passing by value.
  // accessModifier static returnType methodName()
  public static int addThem(int a, int b) {
    double PI = 3.0;   // local variable
    // print out overridden value of PI that is only local to this method.
    System.out.println("Local PI : " + PI);
    return a + b;
  }
}
