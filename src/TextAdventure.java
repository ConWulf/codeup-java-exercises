import java.util.Scanner;

public class TextAdventure {

    private static int potionsUsed = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        startGame(sc);
    }

    public static void startGame(Scanner sc) {
        int bossHealth = 250;
        int heroHealth = 100;
        int heroAtkPoints = 8;
        System.out.println("Are you ready for adventure?");
        String start = sc.nextLine();
        if (start.equalsIgnoreCase("yes")) {
            System.out.println(getName(sc));
            stats(heroHealth, heroAtkPoints, sc);
            System.out.println(choice(heroHealth, bossHealth, heroAtkPoints, sc));
        }
    }

    public static String getName (Scanner sc) {
          System.out.println("Tell me your name.");
          StringBuilder userName = new StringBuilder(sc.nextLine());
          if (!userName.toString().equalsIgnoreCase("")) {
          StringBuilder newName = userName.replace(0, userName.length(), "Tod");
          return "It looks like your name is "  + newName + "\nlet's start your adventure.\n";
          }
          return "";
    }

    public static void stats (int heroHealth, int atkPts, Scanner sc) {
        sc.nextLine();
        System.out.printf("Your stats\n=========\nHealth: %d\n", heroHealth);
        System.out.printf("Potions: 4\nAP: %d\n", atkPts);
        sc.nextLine();
    }

    public static String choice (int heroHealth, int boss, int atk, Scanner sc) {
        System.out.println("What would you like to do?\na. Attack\nd. Defend\ndp. Drink potion\nr. Run");
        String userChoice = sc.nextLine();
        switch (userChoice) {
            case "r":
                System.exit(0);
            case "dp":
                potionsUsed += 1;
                if (potionsUsed >= 4) System.out.println("You have no more potions");
                else {
                heroHealth += 5;
                System.out.printf("you have gained 5 health points, your health is %d\n", heroHealth);
                sc.nextLine();
                }
                return choice(heroHealth, boss, atk, sc);
            case "d":
                return "you defended";
            case "a":
                boss -= atk;
                if (boss <= 0 || heroHealth <= 0) return "You defeated the boss";
                System.out.printf("the boss has %d health\n", boss);
                sc.nextLine();
              return choice(heroHealth, boss, atk, sc);
        }
        return choice(heroHealth, boss, atk, sc);
    }

//    public static int bossFight(int heroHealth, int bossHealth, int atkPts) {
//
//    }


}
