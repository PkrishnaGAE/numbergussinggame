import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1; // Set your lower bound for the guessing range
        int upperBound = 100; // Set your upper bound for the guessing range
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfGuesses = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfGuesses++;

            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please enter a valid number within the range!");
            } else if (userGuess == secretNumber) {
                hasGuessedCorrectly = true;
            } else {
                System.out.println("Wrong guess! Try again.");
                if (userGuess < secretNumber) {
                    System.out.println("Hint: Try a higher number.");
                } else {
                    System.out.println("Hint: Try a lower number.");
                }
            }
        }

        System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " attempts.");
        scanner.close();
    }
}
