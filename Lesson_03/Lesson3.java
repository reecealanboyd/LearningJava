public class Lesson3 {

    public static void main(String[] args) {
        // random number between 0 and 49
        int randomNumber = (int) (Math.random() * 50);

        // ~ == bitwise compliement
        System.out.println("The Random number: " + randomNumber);
        System.out.println("Its compliment: " + ~randomNumber);
        // & == bitwise AND
        System.out.println("ANDing it with 1: " + (randomNumber & 1));
        // | == bitwise OR
        System.out.println("ORing it with 1: " + (randomNumber | 1));
        // ^ == XOR.
        System.out.println("XORing it with 1: " + (randomNumber ^ 1));
        // << == left shift
        System.out.println("Left shifting it once: " + (randomNumber << 1));
        // >> == right shift
        System.out.println("Right shifting it once: " + (randomNumber >> 1));
        // >>> == zero fill shift right
        // shifted values filled with 0's
        // Note: there is no zero shifting left.
        System.out.println("Zero shifting it right once: " + (randomNumber >>> 1));

        int value1 = 5;
        int value2 = 7;

        // Assigning variable from conditional.
        int biggestValue = (value1 > value2) ? value1 : value2;
        System.out.println(biggestValue);

        // How to use switch statements in Java.
        char theGrade = 'D';
        switch (theGrade) {
            case 'a':
            case 'A':
                System.out.println("Great job!");
                break;
            case 'b':
            case 'B':
                System.out.println("Good job!");
                break;
            case 'c':
            case 'C':
                System.out.println("You passed I guess.");
                break;
            case 'd':
            case 'D':
                System.out.println("D's get degrees.");
                break;
            default:
                System.out.println("You failed.");
                break;
        }
    }
}
