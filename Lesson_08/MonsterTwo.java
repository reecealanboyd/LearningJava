import java.util.Arrays;

public class MonsterTwo
{
  // Design tip: Try to have as many variables as possible be private.
  // Only make variables public if you absolutely have to.
  public final String TOMBSTONE = "Here lies a dead MonsterTwo";

  private int health = 500;
  private int attack = 20;
  private int movement = 2;

  private boolean alive = true;

  static char[][] battleBoard = new char[10][10];

  public String name = "Big Monster";
  public char nameChar1 = 'B';
  public int xPosition = 0;
  public int yPosition = 0;
  public static int numOfMonsters = 0;

  public static void buildBattleBoard()
  {
    //fill the board with *'s
    for (char[] row : battleBoard) {
      Arrays.fill(row, '*');
    }
}

  public static void redrawBoard()
  {
    // drawing 30 dashes for neatness above the board
    for (int k = 1; k <= 30; k++) { System.out.print('-'); }
    System.out.println(); // just a newline
    for (int i = 0; i < battleBoard.length; i++) {
      for (int j = 0; j < battleBoard[i].length; j++) {
        System.out.print('|' + battleBoard[i][j] + '|');
      }
      System.out.println(); // just a newline
    }
    for (int k = 1; k <= 30; k++) { System.out.print('-'); }
    System.out.println(); // just a newline
  }

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

  public boolean getAlive()
  {
    return alive;
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
  public MonsterTwo(int health, int movement, int attack, String name)
  {
    this.health = health;
    this.movement = movement;
    this.attack = attack;
    this.name = name;

    int maxXBoardSpace = battleBoard.length - 1;
    int maxYBoardSpace = battleBoard[0].length - 1;

    int randNumX, randNumY;
    do {
      randNumX = (int) (Math.random() * maxXBoardSpace);
      randNumY = (int) (Math.random() * maxYBoardSpace);
    } while (battleBoard[randNumX][randNumY] != '*');
    this.xPosition = randNumX;
    this.yPosition = randNumY;
    this.nameChar1 = name.charAt(0);
    battleBoard[this.yPosition][this.xPosition] = this.nameChar1;
    numOfMonsters++;
  }

  // Default constructor
  public MonsterTwo()
  {

  }

  public static void main(String[] args)
  {
    MonsterTwo Frank = new MonsterTwo();
    System.out.println(Frank.attack);
  }
}
