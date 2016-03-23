public class Monster
{
  // Design tip: Try to have as many variables as possible be private.
  // Only make variables public if you absolutely have to.
  public final String TOMBSTONE = "Here lies a dead Monster";

  private int health = 500;
  private int attack = 20;
  private int movement = 2;
  private int xPosition = 0;
  private int yPosition = 0;
  private boolean alive = true;

  public String name = "Big Monster";

  public int getAttack()
  {
    return attack;
  }

  public int getMovement()
  {
    return movement;
  }

  public int getHealth()
  {
    return health;
  }

  public void setHealth(int decreaseHealth)
  {
    health = health - decreaseHealth;
    if (health < 0) {
      alive = false;
    }
  }

  // overloaded method
  public void setHealth(double decrease)
  {
    int decreaseHealth = (int) decrease;
    health  = health - decreaseHealth;
    if (health < 0) {
      alive = false;
    }
  }

  // parameterized constructor
  public Monster(int health, int movement, int attack)
  {
    this.health = health;
    this.movement = movement;
    this.attack = attack;
  }

  // Default constructor
  public Monster()
  {

  }

  public static void main(String[] args)
  {
    Monster Frank = new Monster();
    System.out.println(Frank.attack);
  }
}
