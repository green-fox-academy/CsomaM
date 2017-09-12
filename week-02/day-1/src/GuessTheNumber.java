import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

        int number = 15;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number");
        int guess = scanner.nextInt();
        boolean answer = false;

        do {
            if (guess > number) {
                System.out.println("It's a smaller number.");
                System.out.println("Guess again.");
                guess = scanner.nextInt();

            } else if (guess < number) {
                System.out.println("it's a bigger number");
                System.out.println("Guess again.");
                guess = scanner.nextInt();
            } else {
                answer = true;
                System.out.println("Correct.");
            }
        } while (answer != true);

    }
}