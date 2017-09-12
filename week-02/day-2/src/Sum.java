import java.util.Scanner;
public class Sum {

    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the quantity of numbers");
        int quantity = scanner.nextInt();
        int sum = 0;
        sum = read (quantity, sum);

        System.out.println("This is the sum of the given numbers: " + sum);
    }

    public static int read (int n, int m) {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i < n; i++) {
            System.out.println("Give me a number");
            m += sc.nextInt();
        }
        return (m);
    }
}
