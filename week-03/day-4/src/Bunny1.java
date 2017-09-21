// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
import java.util.Scanner;

public class Bunny1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me the number of bunnies.");
        int n = sc.nextInt();
        System.out.println("The number of ears: " + earCounter(n));
    }

    static int earCounter(int n) {
        int ears = 0;
        if ((n) == 0) {
            return 0;
        } else {
            return ears + 2 + earCounter(n - 1);
        }
    }
}
