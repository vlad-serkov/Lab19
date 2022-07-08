import javax.management.ObjectName;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static public void main(String[] args) {
        System.out.println("Use deck or stack");
        System.out.println("1: deck");
        System.out.println("2: stack");
        Deckkk deck = new Deckkk();
        Stackkk stack = new Stackkk();
        Scanner scanner = new Scanner(System.in);

        //lollooollll

        StartWithDeckAndStack(deck, stack, scanner);
    }

    static void StartWithDeckAndStack(Deckkk deck1, Stackkk stack, Scanner scanner) {
        switch (scanner.next()) {
            case ("print"):
                System.out.print("1: ");
                deck1.printDeckk();
                System.out.print("2: ");
                stack.printStackk();
                StartWithDeckAndStack(deck1, stack, scanner);
                break;
            case ("1addleft"):
                deck1.addLeft(scanner.nextInt());
                StartWithDeckAndStack(deck1, stack, scanner);
                break;
            case ("1addright"):
                deck1.addRight(scanner.nextInt());
                StartWithDeckAndStack(deck1, stack, scanner);
                break;
            case ("1removeleft"):
                deck1.removeLeft();
                StartWithDeckAndStack(deck1, stack, scanner);
                break;
            case ("1removeright"):
                deck1.removeRight();
                StartWithDeckAndStack(deck1, stack, scanner);
                break;
            case ("2add"):
                stack.add(scanner.nextInt());
                StartWithDeckAndStack(deck1, stack, scanner);
                break;
            case ("2remove"):
                stack.remove();
                StartWithDeckAndStack(deck1, stack, scanner);
                break;
            case ("2update"):
                startWithTwoDeck(deck1, new Deckkk(stack), scanner);
                break;
            case ("exit"):
                System.out.println("EXIT");

            default:
                System.out.println("Wrong command");
                StartWithDeckAndStack(deck1, stack, scanner);

        }


    }

    static void startWithTwoDeck(Deckkk deck1, Deckkk deck2, Scanner scanner) {
        switch (scanner.next()) {
            case ("print"):
                System.out.print("1: ");
                deck1.printDeckk();
                System.out.print("2: ");
                deck2.printDeckk();
                startWithTwoDeck(deck1, deck2, scanner);
                break;
            case ("1addleft"):
                deck1.addLeft(scanner.nextInt());
                startWithTwoDeck(deck1, deck2, scanner);
                break;
            case ("1addright"):
                deck1.addRight(scanner.nextInt());
                startWithTwoDeck(deck1, deck2, scanner);
                break;
            case ("1removeleft"):
                deck1.removeLeft();
                startWithTwoDeck(deck1, deck2, scanner);
                break;
            case ("1removeright"):
                deck1.removeRight();
                startWithTwoDeck(deck1, deck2, scanner);
                break;
            case ("2addleft"):
                deck2.addLeft(scanner.nextInt());
                startWithTwoDeck(deck1, deck2, scanner);
                break;
            case ("2addright"):
                deck2.addRight(scanner.nextInt());
                startWithTwoDeck(deck1, deck2, scanner);
                break;
            case ("2removeleft"):
                deck2.removeLeft();
                startWithTwoDeck(deck1, deck2, scanner);
                break;
            case ("2removeright"):
                deck2.removeRight();
                startWithTwoDeck(deck1, deck2, scanner);
                break;

            case ("exit"):
                System.out.println("EXIT");

            default:
                System.out.println("Wrong command");
                startWithTwoDeck(deck1, deck2, scanner);
        }
    }
}