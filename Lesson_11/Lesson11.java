import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class Lesson11
{
  public static void main(String[] args)
  {
    ArrayList arrayListOne = new ArrayList();

    ArrayList<String> names = new ArrayList<String>();
    names.add("John Smith");
    names.add("Mason Crosby");
    names.add("Oliver Miller");

    // add Jack Ryan @ index 2.
    names.add(2, "Jack Ryan");

    // replace first element with John Adams.
    names.set(0, "John Adams");

    // remove third element.
    //names.remove(3);

    // prints all names on their own line.
    for (int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));
    }

    System.out.println();

    // print all the names on the same line.
    System.out.println(names);

    System.out.println();

    // same as the above for loop.
    for (String i : names) {
      System.out.println(i);
    }

    System.out.println();

    // before the enhanced for loop, this is how it was done.
    Iterator indivItems = names.iterator();

    // while there is another item in names
    while (indivItems.hasNext()) {
      System.out.println(indivItems.next());
    }

    System.out.println();

    ArrayList nameCopy = new ArrayList();
    ArrayList nameBackup = new ArrayList();

    nameCopy.addAll(names);

    String paulYoung = "Paul Young";
    names.add(paulYoung);

    if (names.contains(paulYoung)) {
      System.out.println("Paul is here.");
    }

    // how to check if everything in one ArrayList is in another one.
    if (names.containsAll(nameCopy)) {
      System.out.println("Everything in nameCopy is in names");
    }

    // false because we added an element to names after we added all
    // of the elements from names to nameCopy.
    if (nameCopy.containsAll(names)) {
      System.out.println("Everything in names is in nameCopy");
    }

    // delete every item in names.
    names.clear();

    // how to check if an ArrayList is empty.
    if (names.isEmpty()) {
      System.out.println("names is empty.");
    }

    Object[] moreNames = new Object[4];

    // how to copy the elements from an ArrayList to a regular Array.
    moreNames = nameCopy.toArray();

    System.out.println(Arrays.toString(moreNames));
  }
}
