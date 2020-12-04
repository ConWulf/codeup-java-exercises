import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("My name is Bob, would you like to have a conversation?");
        String decision = sc.next();
        boolean keepTalking = true;
        if (!decision.equalsIgnoreCase("y")) {
            System.exit(0);
        } else {
            do {
                System.out.println("lets talk.");
            sc.nextLine();
            String converse = sc.nextLine();
            if (converse.endsWith("?")) {
                System.out.println("Sure");
            } else if (converse.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (converse.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }
                System.out.println("would you like to continue the conversation?");
                String answer = sc.next();
                if (!answer.equalsIgnoreCase("y")) {
                    keepTalking = false;
//                    break;
                }
            } while (keepTalking);
        }

    }

}
