import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("Let's play Rock-Paper-Scissors!");

        while(true) {
            System.out.println("\n1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            int playerChoice = scanner.nextInt();
            if(playerChoice == 4) {
                System.out.println("Thanks for playing!");
                break;
            }

            if(playerChoice < 1 || playerChoice > 3) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            int computerChoice = random.nextInt(3) + 1;

            System.out.println("You chose: " + choices[playerChoice-1]);
            System.out.println("Computer chose: " + choices[computerChoice-1]);

            // Determine winner
            if(playerChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if((playerChoice == 1 && computerChoice == 3) ||
                    (playerChoice == 2 && computerChoice == 1) ||
                    (playerChoice == 3 && computerChoice == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
    }
}
