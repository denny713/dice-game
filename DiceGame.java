import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Dice Game!");
        System.out.println("Roll two dice and guess the total value.");

        while (true) {
            int dice1 = rollDice(random);
            int dice2 = rollDice(random);

            System.out.print("Enter your guess (2-12): ");
            int guess = scanner.nextInt();

            int total = dice1 + dice2;
            System.out.println("The dice rolls are: " + dice1 + " and " + dice2);
            System.out.println("Total: " + total);

            if (guess == total) {
                System.out.println("Congratulations! You guessed it right.");
            } else {
                System.out.println("Sorry, your guess was incorrect.");
            }

            System.out.print("Play again? (y/n): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("y")) {
                break;
            }
        }

        System.out.println("Thanks for playing the Dice Game!");
    }

    public static int rollDice(Random random) {
        // Roll a 6-sided die (1-6)
        return random.nextInt(6) + 1;
    }
}