import java.util.Arrays;
import java.util.LinkedList;

public class Lesson12
{
  public static void main(String[] args)
  {
    LinkedList linkedListOne = new LinkedList();

    LinkedList<String> names = new LinkedList<String>();

    names.add("Chrisila Pettey");
    names.add("Sal Barbosa");

    // put item @ end of LL.
    names.addLast("Joshua Phillips");

    // put item @ beginning of LL.
    names.addFirst("Cen Li");

    // add item @ index of LL.
    names.add(0, "Ralph Butler");

    // replace item @ index of LL.
    names.set(2, "Hyrum Carroll");

    // remove item @ index of LL.
    names.remove(4);

    System.out.println();

    for (String name : names) {
      System.out.println(name);
    }

    // get() retrieves item @ index in LL.
    System.out.println("\nFirst Index: " + names.get(0));

    // getLast() retrieves last item in LL.
    System.out.println("\nLast Index: " + names.getLast());

    // copy 1 LL to another.
    LinkedList<String> nameCopy = new LinkedList<String>(names);

    System.out.println("\nnameCopy: " + nameCopy);

    if (names.contains("Ralph Butler")) {
      System.out.println("\nHis middle name is Milton.");
    }

    if (names.containsAll(nameCopy)) {
      System.out.println("all names in nameCopy are in names");
    }

    // indexOf() returns index of item in LL.
    System.out.println("\nCen Li index @: " + names.indexOf("Cen Li"));

    // isEmpty() returns true if LL is empty.
    System.out.println("\nList Empty: " + names.isEmpty());

    // doesn't generate an error if LL is empty.
    System.out.println("\nLook without Error: " + names.peek());

    // return item in LL and remove it from LL.
    System.out.println("\nRemoved first element: " + nameCopy.poll());

    // return and remove last item in LL.
    System.out.println("\nRemoved last element: " + nameCopy.pollLast());

    System.out.println();

    // add item to front of LL.
    nameCopy.push("Ralph Milton Butler");

    // remove first item in LL.
    nameCopy.pop();

    for (String i : nameCopy) {
      System.out.println(i);
    }

    Object[] nameArray = new Object[4];

    nameArray = names.toArray();

    System.out.println(Arrays.toString(nameArray));

    // delete all items in LL.
    names.clear();
  }
}
