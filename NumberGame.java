import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalScore = 0;

        while (playAgain) {
            int roundScore = playGame(scanner, random);
            totalScore += roundScore;

            System.out.println("Your score for this round: " + roundScore);
            System.out.println("Your total score: " + totalScore);

            System.out.print("Do you want to play again? (y/n): ");
            String playChoice = scanner.next();
            playAgain = playChoice.equalsIgnoreCase("y");
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }

    public static int playGame(Scanner scanner, Random random) {
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int score = 0;

        System.out.println("Guess the number between 1 and 100.");
        while (attempts < 7) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                score = 7 - attempts + 1; // Calculate score based on remaining attempts
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (score == 0) {
            System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
        }

        return score;
    }
}
