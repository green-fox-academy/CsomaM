import java.util.Scanner;

// Write a recursive function that takes one parameter: n and counts down from n.
public class Counter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number.");
        int n = sc.nextInt();
        countDown(n);
    }

    public static int countDown(int n) {
        if (n == 0) {
            System.out.println("0");
            return 0;
        } else {
            System.out.println(n);
            return countDown(n - 1);
        }
    }
}