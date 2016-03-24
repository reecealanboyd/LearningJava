import java.util.Arrays;

public class Lesson9
{
  public static void main(String[] args)
  {
    // different ways to declare an array
    int[] randomArray;

    int[] numberArray = new int[10];

    randomArray = new int[20];

    randomArray[1] = 2;

    String[] stringArray = {"just", "random", "words"};

    // fill the array
    for (int i = 0; i < numberArray.length; i++) {
      numberArray[i] = i;
    }

    int k = 1;
    while (k <= 41) {System.out.print('-'); k++;}
    System.out.println();

    // print the array
    for (int j = 0; j < numberArray.length; j++) {
      System.out.print("| " + numberArray[j] + " " );
    }
    System.out.println();

    // make a 2D Array
    String[][] multiArray = new String[10][10];
    for (int i = 0; i < multiArray.length; i++) {
      for (int j = 0; j < multiArray[i].length; j++) {
        multiArray[i][j] = i + " " + j;
      }
    }
    k = 1;
    while (k <= 61) {System.out.print('-'); k++;}
    System.out.println();

    // print the 2D array
    for (int i = 0; i < multiArray.length; i++) {
      for (int j = 0; j < multiArray[i].length; j++) {
        System.out.print("| " + multiArray[i][j] + " ");
      }
      System.out.println("|");
    }
    k = 1;
    while (k <= 61) {System.out.print('-'); k++;}
    System.out.println();

    // format of enhanced for loop
    // for (dataType varForRow : arrayName)

    // print an entire row of an array. So for a 1D array, the entire row.
    for (int row : numberArray) {
      System.out.print(row);
    }
    System.out.println();

    // print rows of a 2D array
    for (String[] rows : multiArray) {
      for (String column : rows) {
        System.out.print("| " + column + " ");
      }
      System.out.println("|");
    }

    // this is why we imported the library
    int[] numberCopy = Arrays.copyOf(numberArray, 5);
    for (int row : numberCopy) {
      System.out.print(row);
    }
    System.out.println();

    // prints our numberCopy array as an array of strings
    // it even separates each element with a ', ' and adds
    // a bracket around each side.
    System.out.println(Arrays.toString(numberCopy));

    int[] moreNumbers = new int[100];
    // fills the entire array with 2's
    Arrays.fill(moreNumbers, 2);

    // fill a 2d array with enhanced for loop
    char[][] boardGame = new char[10][10];
    for (char[] row : boardGame) {
      Arrays.fill(row, '*');
    }

    int[] numsToSort = new int[10];
    for (int i = 0; i < numsToSort.length; i++) {
      numsToSort[i] = (int) (Math.random() * 100);
    }
    Arrays.sort(numsToSort);
    System.out.println(Arrays.toString(numsToSort));

    // find an element in an array using binarySearch.
    // if it exists, return a positive number.
    // if not, return a negative number.
    int whereIs50 = Arrays.binarySearch(numsToSort, 50);
    System.out.println(whereIs50);
  }
}
