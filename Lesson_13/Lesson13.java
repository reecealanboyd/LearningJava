import java.util.Arrays;

public class Lesson13
{
  public static void main(String[] args)
  {
    // single quote in double quotes is ok.
    String randomString = "I'm just a randomstring";

    System.out.println(randomString);

    // you have to use escape characters to put a " in a double-quote string.
    String goToQuote = "He said, \"I'm here.\"";

    System.out.println(goToQuote);

    String uppercaseStr = "BIG";
    String lowercaseStr = "big";

    if (uppercaseStr.equals(lowercaseStr)) {
      System.out.println("They're equal");
    }

    String letters = "abcde";
    String moreLetters = "fghijk";

    // find char @ index of String.
    System.out.println("2nd char: " + letters.charAt(1));

    // if strings are equal, prints a 0.
    // if letters is smaller than moreLetters, returns a negative number.
    // if letters is greater than moreLetters, returns a positve number.
    System.out.println(letters.compareTo(moreLetters));

    System.out.println(letters.contains("abc"));

    System.out.println(letters.endsWith("de"));

    System.out.println(letters.indexOf("cd"));

    // You can also specify the index to start searching from.
    // indexOf(StringToLookFor, IndexStartPosition)

    // lastIndexOf works like indexOf except it starts from the
    // end of the String you are searching.

    System.out.println(letters.replace("abc", "xy"));

    // "" is our delimiter.
    String[] letterArray = letters.split("");

    System.out.println(Arrays.toString(letterArray));

    char[] charArray = letters.toCharArray();

    System.out.println(Arrays.toString(charArray));

    System.out.println(letters.substring(1, 4));

    System.out.println(letters.toUpperCase());

    String randString = "       abfgfhfj        ";

    // get rid of the whitespace before and after String but not inside it.
    System.out.println(randString.trim());

    // Note: strings are immutable. Every time you change a string in anyway,
    // it doesn't delete the previous version of the string in memory. It just
    // creates a brand new location in memory for the string over and over
    // again. So if you're going to be changing a string a bunch of times,
    // you should use StringBuilder.
    StringBuilder randSB = new StringBuilder("A random value");

    System.out.println(randSB.append(" again"));

    System.out.println(randSB);

    System.out.println(randSB.delete(15, 21));

    // How much space is our StringBuilder taking up?
    System.out.println(randSB.capacity());  // currently 30.

    // guarantees it will be at least 60 in size.
    randSB.ensureCapacity(60);  // actually 62.

    System.out.println(randSB.capacity());

    // trim size of capacity to actual size of String.
    randSB.trimToSize();

    System.out.println(randSB.capacity());

    System.out.println(randSB.insert(1, "nother"));

    // convert StringBuilder to String.
    String oldSB = randSB.toString();
  }
}
