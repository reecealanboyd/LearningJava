public class Lesson7
{
  public static void main(String args[])
  {
    Monster Frank = new Monster();
    // The following line would cause an error at compile-time because
    // attack is private and you can only access within the class.
    // Because of this, we will have to use a getter from Monster.
    //System.out.println(Frank.attack);
    System.out.println(Frank.getAttack());
  }
}
