import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {

    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number, this will be the quantity of numbers I'm asking of you.");
        int n = scanner.nextInt();
        int sum = 0;
        int i;
        for (i=0; i < n; i++) {
            System.out.println("Give me the next number.");
            sum += scanner.nextInt();
        }
        float average = ((float)sum)/i;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }
}