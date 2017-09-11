
import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number");
        int a = scanner.nextInt();

        if (a < 1) {
            System.out.println("Not enough!");
        } else if (a == 1) {
            System.out.println("One");
        } else if (a == 2) {
            System.out.println("Two");
        } else {
            System.out.println("A lot");
        }
    }
}